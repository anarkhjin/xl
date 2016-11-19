# Host: localhost  (Version: 5.5.5-10.1.9-MariaDB)
# Date: 2016-08-03 10:02:20
# Generator: MySQL-Front 5.3  (Build 4.263)

/*!40101 SET NAMES utf8 */;

#
# Structure for table "an_up"
#

DROP TABLE IF EXISTS `an_up`;
CREATE TABLE `an_up` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `version` smallint(6) DEFAULT NULL,
  `url` char(128) DEFAULT NULL,
  `state` smallint(6) DEFAULT NULL,
  `describle` char(10) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

#
# Data for table "an_up"
#

INSERT INTO `an_up` VALUES (1,1,'www.baidu.com',1,'第一个版本');

#
# Structure for table "category"
#

DROP TABLE IF EXISTS `category`;
CREATE TABLE `category` (
  `cate_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` char(18) DEFAULT NULL,
  `url` char(120) DEFAULT NULL,
  `detail` text COMMENT '图文详情',
  PRIMARY KEY (`cate_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

#
# Data for table "category"
#

INSERT INTO `category` VALUES (1,'火腿','',' '),(2,'其他','',' ');

#
# Structure for table "tb_menu"
#

DROP TABLE IF EXISTS `tb_menu`;
CREATE TABLE `tb_menu` (
  `mid` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(12) DEFAULT NULL COMMENT '菜单名',
  `action` varchar(136) DEFAULT NULL COMMENT '操作action',
  PRIMARY KEY (`mid`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

#
# Data for table "tb_menu"
#

INSERT INTO `tb_menu` VALUES (1,'分类管理','/admin/cate.do');

#
# Structure for table "tb_shop"
#

DROP TABLE IF EXISTS `tb_shop`;
CREATE TABLE `tb_shop` (
  `sid` bigint(20) NOT NULL AUTO_INCREMENT,
  `sname` char(32) DEFAULT NULL,
  `saccount` char(18) DEFAULT NULL,
  `saddress` char(32) DEFAULT NULL,
  `sprivince` char(18) DEFAULT NULL,
  `scity` char(18) DEFAULT NULL,
  `sarea` char(18) DEFAULT NULL,
  `linkname` char(12) DEFAULT NULL,
  `linktele` char(13) DEFAULT NULL,
  `token` char(132) DEFAULT NULL,
  `uuid` char(132) DEFAULT NULL,
  `logo` char(128) DEFAULT NULL,
  `jingdu` char(15) DEFAULT NULL,
  `weidu` char(15) DEFAULT NULL,
  PRIMARY KEY (`sid`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

#
# Data for table "tb_shop"
#

INSERT INTO `tb_shop` VALUES (1,'盘县火腿柏果店','baiguo','六盘水市盘县柏果镇红卫村','贵州省','六盘水','盘县','顾进','18385417002',NULL,'6cb84792-a575-4004-b05b-96ef7c129091',NULL,'104.8435730000','26.5885930000');

#
# Structure for table "tb_goods"
#

DROP TABLE IF EXISTS `tb_goods`;
CREATE TABLE `tb_goods` (
  `gid` bigint(20) NOT NULL AUTO_INCREMENT,
  `sid` bigint(20) NOT NULL,
  `cate_id` bigint(20) NOT NULL,
  `goods_name` varchar(128) NOT NULL DEFAULT '',
  `price` int(8) DEFAULT NULL,
  `trueprice` int(8) DEFAULT NULL COMMENT '真实价格',
  `standar` int(8) DEFAULT NULL COMMENT '规格',
  `truestandar` int(8) DEFAULT NULL COMMENT '真实价格，规格；多少钱500克',
  `weight` char(12) DEFAULT NULL,
  `uuid` char(132) DEFAULT NULL,
  `discrible` mediumtext,
  `state` smallint(6) DEFAULT NULL,
  `num` smallint(6) DEFAULT NULL,
  `yunfei` int(5) DEFAULT NULL COMMENT '运费',
  `yunfei_text` char(200) DEFAULT NULL,
  PRIMARY KEY (`gid`),
  KEY `FK_GOODS1_REFERENCE_MESSSGE` (`sid`),
  KEY `FK_GOODS2_REFERENCE_MESSSGE` (`cate_id`),
  CONSTRAINT `FK_GOODS1_REFERENCE_MESSSGE` FOREIGN KEY (`sid`) REFERENCES `tb_shop` (`sid`),
  CONSTRAINT `FK_GOODS2_REFERENCE_MESSSGE` FOREIGN KEY (`cate_id`) REFERENCES `category` (`cate_id`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8;

#
# Data for table "tb_goods"
#

INSERT INTO `tb_goods` VALUES (1,1,1,'盘县火腿 中刀 1000克',6000,8000,3000,4000,'1000克','3bbe9456-4055-48a3-afd5-e40b32bf1f10','盘县山区火腿，生态火腿',1,100,1000,'本地免费送货上门，外地收取10元运费'),(2,1,1,'盘县火腿 中刀 1000克',6000,8000,3000,4000,'1000克','3bbe9456-4055-48a3-afd5-e40b32bf1f10','盘县山区火腿，生态火腿',1,100,1000,'本地免费送货上门，外地收取10元运费'),(3,1,1,'盘县火腿 中刀 1000克',6000,8000,3000,4000,'1000克','3bbe9456-4055-48a3-afd5-e40b32bf1f10','盘县山区火腿，生态火腿',1,100,1000,'本地免费送货上门，外地收取10元运费'),(4,1,1,'盘县火腿 中刀 1000克',6000,8000,3000,4000,'1000克','3bbe9456-4055-48a3-afd5-e40b32bf1f10','盘县山区火腿，生态火腿',1,100,1000,'本地免费送货上门，外地收取10元运费'),(5,1,1,'盘县火腿 中刀 1000克',6000,8000,3000,4000,'1000克','3bbe9456-4055-48a3-afd5-e40b32bf1f10','盘县山区火腿，生态火腿',1,100,1000,'本地免费送货上门，外地收取10元运费'),(6,1,1,'盘县火腿 中刀 1000克',6000,8000,3000,4000,'1000克','3bbe9456-4055-48a3-afd5-e40b32bf1f10','盘县山区火腿，生态火腿',1,100,1000,'本地免费送货上门，外地收取10元运费'),(7,1,1,'盘县火腿 中刀 1000克',6000,8000,3000,4000,'1000克','3bbe9456-4055-48a3-afd5-e40b32bf1f10','盘县山区火腿，生态火腿',1,100,1000,'本地免费送货上门，外地收取10元运费'),(8,1,1,'盘县火腿 中刀 1000克',6000,8000,3000,4000,'1000克','3bbe9456-4055-48a3-afd5-e40b32bf1f10','盘县山区火腿，生态火腿',1,100,1000,'本地免费送货上门，外地收取10元运费'),(9,1,2,'盘县火腿 中刀 1000克',6000,8000,3000,4000,'1000克','3bbe9456-4055-48a3-afd5-e40b32bf1f10','盘县山区火腿，生态火腿',1,100,1000,'本地免费送货上门，外地收取10元运费'),(10,1,2,'盘县火腿 中刀 1000克',6000,8000,3000,4000,'1000克','3bbe9456-4055-48a3-afd5-e40b32bf1f10','盘县山区火腿，生态火腿',1,100,1000,'本地免费送货上门，外地收取10元运费'),(11,1,2,'盘县火腿 中刀 1000克',6000,8000,3000,4000,'1000克','3bbe9456-4055-48a3-afd5-e40b32bf1f10','盘县山区火腿，生态火腿',1,100,1000,'本地免费送货上门，外地收取10元运费'),(12,1,2,'盘县火腿 中刀 1000克',6000,8000,3000,4000,'1000克','3bbe9456-4055-48a3-afd5-e40b32bf1f10','盘县山区火腿，生态火腿',1,100,1000,'本地免费送货上门，外地收取10元运费'),(13,1,2,'盘县火腿 中刀 1000克',6000,8000,3000,4000,'1000克','3bbe9456-4055-48a3-afd5-e40b32bf1f10','盘县山区火腿，生态火腿',1,100,1000,'本地免费送货上门，外地收取10元运费'),(14,1,2,'盘县火腿 中刀 1000克',6000,8000,3000,4000,'1000克','3bbe9456-4055-48a3-afd5-e40b32bf1f10','盘县山区火腿，生态火腿',1,100,1000,'本地免费送货上门，外地收取10元运费'),(15,1,2,'盘县火腿 中刀 1000克',6000,8000,3000,4000,'1000克','3bbe9456-4055-48a3-afd5-e40b32bf1f10','盘县山区火腿，生态火腿',1,100,1000,'本地免费送货上门，外地收取10元运费'),(16,1,2,'盘县火腿 中刀 1000克',6000,8000,3000,4000,'1000克','3bbe9456-4055-48a3-afd5-e40b32bf1f10','盘县山区火腿，生态火腿',1,100,1000,'本地免费送货上门，外地收取10元运费');

#
# Structure for table "tb_goods_img"
#

DROP TABLE IF EXISTS `tb_goods_img`;
CREATE TABLE `tb_goods_img` (
  `img_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `gid` bigint(20) NOT NULL,
  `url` char(128) DEFAULT NULL,
  PRIMARY KEY (`img_id`),
  KEY `FK_IMG_REFERENCE_MESSSGE` (`gid`),
  CONSTRAINT `FK_IMG_REFERENCE_MESSSGE` FOREIGN KEY (`gid`) REFERENCES `tb_goods` (`gid`)
) ENGINE=InnoDB AUTO_INCREMENT=65 DEFAULT CHARSET=utf8;

#
# Data for table "tb_goods_img"
#

INSERT INTO `tb_goods_img` VALUES (1,1,'/images/goods.jpg'),(2,1,'/images/goods.jpg'),(3,1,'/images/goods.jpg'),(4,1,'/images/goods.jpg'),(5,2,'/images/goods.jpg'),(6,2,'/images/goods.jpg'),(7,2,'/images/goods.jpg'),(8,2,'/images/goods.jpg'),(9,3,'/images/goods.jpg'),(10,3,'/images/goods.jpg'),(11,3,'/images/goods.jpg'),(12,3,'/images/goods.jpg'),(13,4,'/images/goods.jpg'),(14,4,'/images/goods.jpg'),(15,4,'/images/goods.jpg'),(16,4,'/images/goods.jpg'),(17,5,'/images/goods.jpg'),(18,5,'/images/goods.jpg'),(19,5,'/images/goods.jpg'),(20,5,'/images/goods.jpg'),(21,6,'/images/goods.jpg'),(22,6,'/images/goods.jpg'),(23,6,'/images/goods.jpg'),(24,6,'/images/goods.jpg'),(25,7,'/images/goods.jpg'),(26,7,'/images/goods.jpg'),(27,7,'/images/goods.jpg'),(28,7,'/images/goods.jpg'),(29,8,'/images/goods.jpg'),(30,8,'/images/goods.jpg'),(31,8,'/images/goods.jpg'),(32,8,'/images/goods.jpg'),(33,9,'/images/goods.jpg'),(34,9,'/images/goods.jpg'),(35,9,'/images/goods.jpg'),(36,9,'/images/goods.jpg'),(37,10,'/images/goods.jpg'),(38,10,'/images/goods.jpg'),(39,10,'/images/goods.jpg'),(40,10,'/images/goods.jpg'),(41,11,'/images/goods.jpg'),(42,11,'/images/goods.jpg'),(43,11,'/images/goods.jpg'),(44,11,'/images/goods.jpg'),(45,12,'/images/goods.jpg'),(46,12,'/images/goods.jpg'),(47,12,'/images/goods.jpg'),(48,12,'/images/goods.jpg'),(49,13,'/images/goods.jpg'),(50,13,'/images/goods.jpg'),(51,13,'/images/goods.jpg'),(52,13,'/images/goods.jpg'),(53,14,'/images/goods.jpg'),(54,14,'/images/goods.jpg'),(55,14,'/images/goods.jpg'),(56,14,'/images/goods.jpg'),(57,15,'/images/goods.jpg'),(58,15,'/images/goods.jpg'),(59,15,'/images/goods.jpg'),(60,15,'/images/goods.jpg'),(61,16,'/images/goods.jpg'),(62,16,'/images/goods.jpg'),(63,16,'/images/goods.jpg'),(64,16,'/images/goods.jpg');

#
# Structure for table "tb_user"
#

DROP TABLE IF EXISTS `tb_user`;
CREATE TABLE `tb_user` (
  `uid` bigint(20) NOT NULL AUTO_INCREMENT,
  `account` char(20) DEFAULT NULL COMMENT '账号',
  `name` char(12) DEFAULT NULL COMMENT '名称',
  `tel` char(13) DEFAULT NULL COMMENT '电话',
  `qq` char(12) DEFAULT NULL COMMENT 'qq',
  `email` char(32) DEFAULT NULL,
  `token` char(128) DEFAULT NULL COMMENT 'token 融云聊天',
  `open_id` char(128) DEFAULT NULL COMMENT '第三方开放id',
  `password` char(32) DEFAULT NULL COMMENT '密码',
  `piont` int(11) DEFAULT NULL COMMENT '积分',
  `cate` tinyint(3) NOT NULL DEFAULT '2' COMMENT '用户类别 0 管理员 1 店铺管理员 2普通用户',
  `shopid` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`uid`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

#
# Data for table "tb_user"
#

INSERT INTO `tb_user` VALUES (1,'admin','顾进','18385417002','1002606871','hanchenjiagujin@126.com',NULL,NULL,'admin',NULL,2,NULL);

#
# Structure for table "tb_quan"
#

DROP TABLE IF EXISTS `tb_quan`;
CREATE TABLE `tb_quan` (
  `qid` bigint(20) NOT NULL AUTO_INCREMENT,
  `uid` bigint(20) NOT NULL,
  `price` int(6) DEFAULT NULL COMMENT '抵用券价值；整数元',
  `isuse` tinyint(3) NOT NULL DEFAULT '0' COMMENT '是否已使用0 待使用 1 已使用',
  `lowprice` int(8) DEFAULT NULL COMMENT '最低使用价格,从分开始',
  PRIMARY KEY (`qid`),
  KEY `FK_QUAN_REFERENCE_MESSSGE` (`uid`),
  CONSTRAINT `FK_QUAN_REFERENCE_MESSSGE` FOREIGN KEY (`uid`) REFERENCES `tb_user` (`uid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

#
# Data for table "tb_quan"
#


#
# Structure for table "tb_order"
#

DROP TABLE IF EXISTS `tb_order`;
CREATE TABLE `tb_order` (
  `oid` bigint(20) NOT NULL AUTO_INCREMENT,
  `uid` bigint(20) NOT NULL,
  `state` int(11) DEFAULT NULL,
  `yunfei` int(10) DEFAULT NULL,
  `priceindeed` int(10) DEFAULT NULL,
  `priceall` int(10) DEFAULT NULL,
  `privince` char(18) DEFAULT NULL,
  `city` char(18) DEFAULT NULL,
  `area` char(18) DEFAULT NULL,
  `address` char(32) DEFAULT NULL,
  `linkman` char(12) DEFAULT NULL,
  `linktel` char(13) DEFAULT NULL,
  `tips` mediumtext,
  `youhui` int(7) DEFAULT NULL,
  `huoyun` tinyint(1) DEFAULT '0' COMMENT '货运标记，0表示本地送货；1表示快递',
  `qid` bigint(20) DEFAULT NULL COMMENT '抵用券id',
  `goodslist` tinytext COMMENT '购物清单json',
  PRIMARY KEY (`oid`),
  KEY `FK_ORDER_REFERENCE_MESSSGE` (`uid`),
  CONSTRAINT `FK_ORDER_REFERENCE_MESSSGE` FOREIGN KEY (`uid`) REFERENCES `tb_user` (`uid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

#
# Data for table "tb_order"
#


#
# Structure for table "order_list"
#

DROP TABLE IF EXISTS `order_list`;
CREATE TABLE `order_list` (
  `olid` bigint(20) NOT NULL AUTO_INCREMENT,
  `oid` bigint(20) NOT NULL,
  `gid` bigint(20) NOT NULL,
  `num` int(11) DEFAULT NULL,
  PRIMARY KEY (`olid`),
  KEY `FK_ORDERL_REFERENCE_MESSSGE` (`gid`),
  KEY `FK_ORDERL1_REFERENCE_MESSSGE` (`oid`),
  CONSTRAINT `FK_ORDERL1_REFERENCE_MESSSGE` FOREIGN KEY (`oid`) REFERENCES `tb_order` (`oid`),
  CONSTRAINT `FK_ORDERL_REFERENCE_MESSSGE` FOREIGN KEY (`gid`) REFERENCES `tb_goods` (`gid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

#
# Data for table "order_list"
#


#
# Structure for table "tb_cart"
#

DROP TABLE IF EXISTS `tb_cart`;
CREATE TABLE `tb_cart` (
  `cid` bigint(20) NOT NULL AUTO_INCREMENT,
  `uid` bigint(20) NOT NULL,
  `gid` bigint(20) NOT NULL,
  `num` smallint(6) DEFAULT NULL,
  PRIMARY KEY (`cid`),
  KEY `FK_CART_REFERENCE_MESSSGE` (`gid`),
  KEY `FK_CART1_REFERENCE_MESSSGE` (`uid`),
  CONSTRAINT `FK_CART1_REFERENCE_MESSSGE` FOREIGN KEY (`uid`) REFERENCES `tb_user` (`uid`),
  CONSTRAINT `FK_CART_REFERENCE_MESSSGE` FOREIGN KEY (`gid`) REFERENCES `tb_goods` (`gid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

#
# Data for table "tb_cart"
#


#
# Structure for table "tb_address"
#

DROP TABLE IF EXISTS `tb_address`;
CREATE TABLE `tb_address` (
  `aid` bigint(20) NOT NULL AUTO_INCREMENT,
  `uid` bigint(20) NOT NULL,
  `deflaut` smallint(6) DEFAULT NULL,
  `privince` char(18) DEFAULT NULL,
  `city` char(18) DEFAULT NULL,
  `area` char(24) DEFAULT NULL,
  `address` char(108) DEFAULT NULL,
  PRIMARY KEY (`aid`),
  KEY `FK_ADDRESS_REFERENCE_MESSSGE` (`uid`),
  CONSTRAINT `FK_ADDRESS_REFERENCE_MESSSGE` FOREIGN KEY (`uid`) REFERENCES `tb_user` (`uid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

#
# Data for table "tb_address"
#


#
# Structure for table "tb_user_menu"
#

DROP TABLE IF EXISTS `tb_user_menu`;
CREATE TABLE `tb_user_menu` (
  `Id` bigint(20) NOT NULL AUTO_INCREMENT,
  `uid` bigint(20) DEFAULT NULL,
  `mid` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

#
# Data for table "tb_user_menu"
#

INSERT INTO `tb_user_menu` VALUES (1,1,1);

#
# Structure for table "tb_wuliu"
#

DROP TABLE IF EXISTS `tb_wuliu`;
CREATE TABLE `tb_wuliu` (
  `wid` bigint(20) NOT NULL AUTO_INCREMENT,
  `company` varchar(16) NOT NULL DEFAULT '',
  `com` varchar(20) NOT NULL DEFAULT '' COMMENT '物流公司编号',
  `no` varchar(24) NOT NULL DEFAULT '' COMMENT '物流编号',
  `uuid` varchar(128) DEFAULT NULL COMMENT 'uuid',
  `oid` bigint(20) DEFAULT NULL COMMENT '订单编号',
  PRIMARY KEY (`wid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='物流表';

#
# Data for table "tb_wuliu"
#

