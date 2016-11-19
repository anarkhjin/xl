# Host: localhost  (Version: 5.5.28)
# Date: 2016-05-30 21:40:52
# Generator: MySQL-Front 5.3  (Build 4.263)

/*!40101 SET NAMES utf8 */;

#
# Structure for table "tb_code"
#

DROP TABLE IF EXISTS `tb_code`;
CREATE TABLE `tb_code` (
  `codeid` bigint(20) NOT NULL AUTO_INCREMENT,
  `value` char(2) COLLATE utf8_unicode_ci DEFAULT NULL,
  `displayname` char(20) COLLATE utf8_unicode_ci DEFAULT NULL,
  `name` char(20) COLLATE utf8_unicode_ci DEFAULT NULL,
  `updatetime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`codeid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

#
# Data for table "tb_code"
#


#
# Structure for table "tb_notice"
#

DROP TABLE IF EXISTS `tb_notice`;
CREATE TABLE `tb_notice` (
  `nid` bigint(20) NOT NULL AUTO_INCREMENT,
  `title` char(30) COLLATE utf8_unicode_ci DEFAULT NULL,
  `content` char(200) COLLATE utf8_unicode_ci DEFAULT NULL,
  `publisher` char(20) COLLATE utf8_unicode_ci DEFAULT NULL,
  `publishtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `updatetime` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  PRIMARY KEY (`nid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

#
# Data for table "tb_notice"
#


#
# Structure for table "tb_section"
#

DROP TABLE IF EXISTS `tb_section`;
CREATE TABLE `tb_section` (
  `sid` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` char(20) COLLATE utf8_unicode_ci DEFAULT NULL,
  `updatetime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `createtime` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  `createuser` char(20) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`sid`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

#
# Data for table "tb_section"
#

INSERT INTO `tb_section` VALUES (2,'牌经2','2016-02-29 19:23:36','2016-02-12 15:46:00','古今'),(5,'罗继','2016-02-25 21:36:55','2016-02-25 21:36:55','顾进'),(6,'麻将','2016-03-13 14:11:16','2016-02-29 21:16:45','顾进'),(7,'你好吗？','2016-02-29 21:16:50','2016-02-29 21:16:50','顾进'),(8,'阿发阿发','2016-02-29 21:16:54','2016-02-29 21:16:54','顾进'),(9,'啦','2016-02-29 21:16:58','2016-02-29 21:16:58','顾进'),(10,'阿发','2016-02-29 21:17:01','2016-02-29 21:17:01','顾进');

#
# Structure for table "tb_subsection"
#

DROP TABLE IF EXISTS `tb_subsection`;
CREATE TABLE `tb_subsection` (
  `subid` bigint(20) NOT NULL AUTO_INCREMENT,
  `sid` bigint(20) DEFAULT NULL,
  `name` char(20) COLLATE utf8_unicode_ci DEFAULT NULL,
  `updatetime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `createtime` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  `createuser` char(20) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`subid`),
  KEY `FK_Reference_1` (`sid`),
  CONSTRAINT `FK_Reference_1` FOREIGN KEY (`sid`) REFERENCES `tb_section` (`sid`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

#
# Data for table "tb_subsection"
#

INSERT INTO `tb_subsection` VALUES (1,2,'牌经第一章','2016-02-23 16:19:00','2016-02-23 16:21:06','gujin'),(2,2,'随便','2016-02-26 17:18:49','2016-02-26 17:18:48','顾进'),(3,2,'你好么？','2016-02-26 17:24:31','2016-02-26 17:24:31','顾进'),(4,2,'后','2016-02-26 17:35:29','2016-02-26 17:35:29','顾进'),(5,2,'度亏','2016-02-26 17:35:34','2016-02-26 17:35:34','顾进'),(6,2,'就','2016-02-26 17:35:39','2016-02-26 17:35:39','顾进'),(7,2,'旅游','2016-02-26 17:50:07','2016-02-26 17:50:07','顾进'),(8,2,'咯嘛','2016-02-26 17:57:10','2016-02-26 17:57:10','顾进'),(9,6,'你是猪呢？','2016-03-13 14:11:30','2016-03-13 14:11:30','顾进');

#
# Structure for table "tb_user"
#

DROP TABLE IF EXISTS `tb_user`;
CREATE TABLE `tb_user` (
  `uid` bigint(20) NOT NULL AUTO_INCREMENT,
  `username` char(20) COLLATE utf8_unicode_ci DEFAULT NULL,
  `password` char(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  `qq` char(12) COLLATE utf8_unicode_ci DEFAULT NULL,
  `telephone` char(11) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`uid`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

#
# Data for table "tb_user"
#

INSERT INTO `tb_user` VALUES (1,'anarkhjin','gujin520','1002606871','18385417002');

#
# Structure for table "tb_topic"
#

DROP TABLE IF EXISTS `tb_topic`;
CREATE TABLE `tb_topic` (
  `tid` bigint(20) NOT NULL AUTO_INCREMENT,
  `subid` bigint(20) DEFAULT NULL,
  `uid` bigint(20) DEFAULT NULL,
  `title` char(100) COLLATE utf8_unicode_ci DEFAULT NULL,
  `sendtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `click_num` int(11) DEFAULT NULL,
  `fellow_num` int(11) DEFAULT NULL,
  `step_num` int(11) DEFAULT NULL,
  `reply_num` int(11) DEFAULT NULL,
  `updatetime` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  `last_replytime` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  `status` tinyint(3) DEFAULT NULL,
  PRIMARY KEY (`tid`),
  KEY `FK_Reference_2` (`subid`),
  KEY `FK_Reference_3` (`uid`),
  CONSTRAINT `FK_Reference_2` FOREIGN KEY (`subid`) REFERENCES `tb_subsection` (`subid`),
  CONSTRAINT `FK_Reference_3` FOREIGN KEY (`uid`) REFERENCES `tb_user` (`uid`)
) ENGINE=InnoDB AUTO_INCREMENT=41 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

#
# Data for table "tb_topic"
#

INSERT INTO `tb_topic` VALUES (26,1,1,'麻将没有赢家','2016-05-30 21:20:59',3,NULL,NULL,3,'2016-02-25 19:26:22','2016-02-25 19:26:22',1),(27,1,1,'你好我是度进','2016-02-25 19:28:37',0,NULL,NULL,0,'2016-02-25 19:28:37','2016-02-25 19:28:37',0),(28,1,1,'安抚萨芬','2016-02-25 19:35:34',0,NULL,NULL,0,'2016-02-25 19:35:34','2016-02-25 19:35:34',0),(29,1,1,'安抚','2016-02-25 19:36:48',0,NULL,NULL,0,'2016-02-25 19:36:48','2016-02-25 19:36:48',0),(30,1,1,' 安抚','2016-02-25 19:38:12',0,NULL,NULL,0,'2016-02-25 19:38:12','2016-02-25 19:38:12',0),(31,1,1,'师大','2016-02-25 19:43:07',0,NULL,NULL,0,'2016-02-25 19:43:07','2016-02-25 19:43:07',0),(32,1,1,'安抚','2016-02-25 19:44:23',0,NULL,NULL,0,'2016-02-25 19:44:23','2016-02-25 19:44:23',0),(33,1,1,'为','2016-02-25 19:45:43',0,NULL,NULL,0,'2016-02-25 19:45:43','2016-02-25 19:45:43',0),(34,1,1,'安抚','2016-02-25 19:46:39',0,NULL,NULL,0,'2016-02-25 19:46:39','2016-02-25 19:46:39',0),(35,1,1,'feature','2016-02-25 19:58:45',0,NULL,NULL,0,'2016-02-25 19:58:45','2016-02-25 19:58:45',0),(36,1,1,'ASD','2016-02-25 20:05:48',0,NULL,NULL,0,'2016-02-25 20:00:53','2016-02-25 20:00:53',1),(37,1,1,'安顺','2016-02-25 20:06:26',0,NULL,NULL,0,'2016-02-25 20:06:18','2016-02-25 20:06:18',1),(39,2,1,'你好啊','2016-03-01 20:35:09',0,NULL,NULL,0,'2016-03-01 20:35:09','2016-03-01 20:35:09',0),(40,1,1,'我是顾进，发错，萨芬爱疯了三分卡了反馈奥斯卡了罚款是打发了三分','2016-03-02 19:37:19',0,NULL,NULL,0,'2016-03-02 19:37:19','2016-03-02 19:37:19',0);

#
# Structure for table "tb_content"
#

DROP TABLE IF EXISTS `tb_content`;
CREATE TABLE `tb_content` (
  `cid` bigint(20) NOT NULL AUTO_INCREMENT,
  `state` tinyint(4) DEFAULT NULL,
  `tid` bigint(20) DEFAULT NULL,
  `content` text COLLATE utf8_unicode_ci,
  `createtime` datetime DEFAULT NULL,
  PRIMARY KEY (`cid`),
  KEY `FK_Reference_4` (`tid`),
  CONSTRAINT `FK_Reference_4` FOREIGN KEY (`tid`) REFERENCES `tb_topic` (`tid`)
) ENGINE=InnoDB AUTO_INCREMENT=55 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

#
# Data for table "tb_content"
#

INSERT INTO `tb_content` VALUES (31,0,26,'12_13_15_25','2016-02-25 19:26:34'),(32,1,26,'我是顾讲。你是哪个','2016-02-25 19:26:49'),(33,1,26,'   爱疯污染爱玩儿了科技为家人？\n   杀掉了看法的撒爱上看到上岛咖啡咖啡店可拉伸的接口费加上地方坚实的飞机交付价格放赶嘎嘎嘎嘎嘎嘎嘎嘎嘎灌灌灌灌灌灌灌灌灌灌灌灌灌灌灌灌灌灌灌灌灌灌灌灌灌灌灌灌灌灌灌灌灌灌灌灌灌灌灌灌灌灌灌灌灌灌灌灌灌灌灌灌灌灌灌。','2016-02-25 19:27:25'),(34,1,27,'        撒旦法爱上当会计法 撒旦法加速度打算开飞机你你你你您撒旦法是的是的，萨拉斯发到你撒打开附件都能发家开发积分发生的接口费你说地方你？\n        你话少发生达芙妮发生的反馈你说的烦恼假的发生年第三方撒旦法你说的烦恼拒收到付件看看官方公开呢速度快发给你打开发过宁德市反馈给你打客服给你的反馈国内贷款纠纷感觉到付款给你打客服给你打客服能干点啥看法那个坑肯定发给你都快过年都快过年打开给你打款给你的反馈及给你的思考给你打客服给你答复个。','2016-02-25 19:29:19'),(35,1,27,'师大发送辣豆腐卡上发生了大开发杀掉了疯狂送大礼疯狂的律师费拉风撒旦法klsafsa\n        ewfklsd fasdfl a撒旦法安顺。','2016-02-25 19:29:39'),(36,0,27,'13_13_14_15_15_15_16_16_23_24_24_24_24_24_25_25_26_26_26_26','2016-02-25 19:30:10'),(37,0,28,'24_24','2016-02-25 19:35:39'),(38,1,28,'发的说法','2016-02-25 19:35:44'),(39,0,29,'13_27_34_38','2016-02-25 19:36:52'),(40,1,29,'住安顺安抚？\n        啥地方呢安抚奥斯卡的发生的反馈那是的风景爱上的咖啡奥斯卡的风景撒旦法啥都开发啥地方叫啥地方凯撒的风景撒旦士大夫撒点开放撒旦法傻的叫客服傻大姐发烧快递费你爱我的烦恼啥都开发撒旦法？','2016-02-25 19:37:10'),(41,1,29,'个啥地方','2016-02-25 19:37:17'),(42,0,30,'13','2016-02-25 19:38:14'),(43,0,34,'26_27','2016-02-25 19:46:49'),(44,1,34,'啊而我啊JKSJASFJ','2016-02-25 19:46:56'),(45,1,34,'{\n    \"goods_pics_list\": [\n        \"/trademall/images/goods/splb001/splb001001/spjh0000100001/spbh0000100001001/1.jpg\",\n        \"/trademall/images/goods/splb001/splb001001/spjh0000100001/spbh0000100001001/2.jpg\",\n        \"/trademall/images/goods/splb001/splb001001/spjh0000100001/spbh0000100001001/3.jpg\",\n        \"/trademall/images/goods/splb001/splb001001/spjh0000100001/spbh0000100001001/4.jpg\",\n        \"/trademall/images/goods/splb001/splb001001/spjh0000100001/spbh0000100001001/5.jpg\"\n    ],\n    \"goods_dyna_attr_list\": [\n        {\n            \"attrName\": \"颜色\",\n            \"attrId\": \"dtsx001001000001001\",\n            \"attrData\": \"黑色\"\n        },\n        {\n            \"attrName\": \"尺寸\",\n            \"attrId\": \"dtsx001001000001002\",\n            \"attrData\": \"S\"\n        }\n    ],\n    \"piece_dyna_attr_list\": [\n        {\n            \"attrDatas\": [\n                \"天蓝色\",\n                \"灰色\",\n                \"粉红色\",\n                \"红色\",\n                \"荧光绿\",\n                \"黑色\"\n            ],\n            \"attrName\": \"颜色\",\n            \"attrId\": \"dtsx001001000001001\"\n        },\n        {\n            \"attrDatas\": [\n                \"L\",\n                \"M\",\n                \"S\",\n                \"XL\"\n            ],\n            \"attrName\": \"尺寸\",\n            \"attrId\": \"dtsx001001000001002\"\n        }\n    ],\n    \"evaluate_simplify\": {\n        \"commentCount\": 2,\n        \"list\": [\n            {\n                \"opTime\": 1456044905000,\n                \"points\": 5,\n                \"pieceNo\": \"spjh001001000001\",\n                \"nickName\": \"3zx_000000aab\",\n                \"pieceValue\": \"黑色,S\",\n                \"description\": \"第三个\"\n            },\n            {\n                \"opTime\": 1456044806000,\n                \"points\": 5,\n                \"pieceNo\": \"spjh001001000001\",\n                \"nickName\": \"3zx_000000aab\",\n                \"pieceValue\": \"黑色,S\",\n                \"description\": \"阿萨德\"\n            },\n            {\n                \"opTime\": 1456044743000,\n                \"points\": 3,\n                \"pieceNo\": \"spjh001001000001\",\n                \"nickName\": \"3zx_000000aab\",\n                \"pieceValue\": \"黑色,S\",\n                \"description\": \"这件衣服还可以\"\n            },\n            {\n                \"opTime\": 1456033085000,\n                \"points\": 10,\n                \"pieceNo\": \"spjh001001000001\",\n                \"nickName\": \"3zx_000000aab\",\n                \"pieceValue\": \"黑色,S\",\n                \"description\": \"sadf\"\n            },\n            {\n                \"opTime\": 1456032969000,\n                \"points\": 6,\n                \"pieceNo\": \"spjh001001000001\",\n                \"nickName\": \"3zx_000000aab\",\n                \"pieceValue\": \"黑色,S\",\n                \"description\": \"sdaf sadf \"\n            }\n        ],\n        \"rate\": 0.5\n    },\n    \"goods_fixed_attr\": {\n        \"goodsId\": \"spbh0010010000010001\",\n        \"keywords\": \"淑雅客,洛子,羽绒服\",\n        \"goodsBrand\": \"淑雅客\",\n        \"goodsCount\": 1000,\n        \"pieceValue\": \"黑色,S\",\n        \"tip\": \"支持7天无理由退货\",\n        \"shopAccount\": \"dpbh0000000001\",\n        \"freight\": \"在线支付免运费\",\n        \"goodsPrice\": 0.08,\n        \"showOrder\": 1,\n        \"points\": 100,\n        \"pieceNo\": \"spjh001001000001\",\n        \"goodsName\": \"淑雅客 2015秋冬新款韩版时尚洛子毛领羽绒服女中长款修身长袖羽绒服外套女 YIL 1502 黑色 S\",\n        \"goodsType\": \"splb001001\"\n    }\n}','2016-02-25 19:47:10'),(46,1,35,'萨芬','2016-02-25 19:58:49'),(47,0,35,'24_27','2016-02-25 19:58:53'),(48,0,36,'15','2016-02-25 20:00:55'),(49,1,36,'A ','2016-02-25 20:00:57'),(50,0,37,'26_26','2016-02-25 20:06:21'),(51,1,37,'撒旦是','2016-02-25 20:06:24'),(53,1,39,'你好，你是猪吗？','2016-03-01 20:35:16'),(54,0,39,'23_25_26_26','2016-03-01 20:35:20');

#
# Structure for table "tb_reply"
#

DROP TABLE IF EXISTS `tb_reply`;
CREATE TABLE `tb_reply` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `tid` bigint(20) DEFAULT NULL,
  `uid` bigint(20) DEFAULT NULL,
  `sendtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `content` char(200) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_Reference_6` (`tid`),
  CONSTRAINT `FK_Reference_6` FOREIGN KEY (`tid`) REFERENCES `tb_topic` (`tid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

#
# Data for table "tb_reply"
#


#
# Structure for table "tb_userinfo"
#

DROP TABLE IF EXISTS `tb_userinfo`;
CREATE TABLE `tb_userinfo` (
  `uinfoid` bigint(20) NOT NULL AUTO_INCREMENT,
  `uid` bigint(20) DEFAULT NULL,
  `sex` smallint(6) DEFAULT NULL,
  `birthday` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `telephone` char(11) COLLATE utf8_unicode_ci DEFAULT NULL,
  `qq` char(12) COLLATE utf8_unicode_ci DEFAULT NULL,
  `realname` char(20) COLLATE utf8_unicode_ci DEFAULT NULL,
  `address` char(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  `sysrole` char(2) COLLATE utf8_unicode_ci DEFAULT NULL,
  `status` char(2) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`uinfoid`),
  KEY `FK_Reference_5` (`uid`),
  CONSTRAINT `FK_Reference_5` FOREIGN KEY (`uid`) REFERENCES `tb_user` (`uid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

#
# Data for table "tb_userinfo"
#


#
# Structure for table "tb_vip"
#

DROP TABLE IF EXISTS `tb_vip`;
CREATE TABLE `tb_vip` (
  `vipid` bigint(20) NOT NULL AUTO_INCREMENT,
  `creattime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `deadtime` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  `password` char(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  `content` char(100) COLLATE utf8_unicode_ci DEFAULT NULL,
  `qq` char(12) COLLATE utf8_unicode_ci DEFAULT NULL,
  `mobile` char(11) COLLATE utf8_unicode_ci DEFAULT NULL,
  `vtimes` smallint(6) DEFAULT NULL,
  `orderNo` varchar(50) CHARACTER SET utf8 DEFAULT NULL,
  PRIMARY KEY (`vipid`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

#
# Data for table "tb_vip"
#

INSERT INTO `tb_vip` VALUES (10,'2016-03-10 21:32:34','2017-03-10 21:32:34','d7yrk9p4','年会员','1002606871','18385417001',0,'sdakf'),(12,'2016-03-10 21:35:51','2017-03-10 21:35:51','28kqn8uk','年会员','1002606871','18385417001',0,'sdakf'),(13,'2016-03-10 21:50:36','2016-04-10 21:50:36','2ssg143b','月会员','100236984','13639143070',0,'20160310215021_08681457617821870');
