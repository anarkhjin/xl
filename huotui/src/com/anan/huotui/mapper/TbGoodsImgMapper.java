package com.anan.huotui.mapper;

import com.anan.huotui.po.TbGoodsImg;
import com.anan.huotui.po.TbGoodsImgExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbGoodsImgMapper {
    int countByExample(TbGoodsImgExample example);

    int deleteByExample(TbGoodsImgExample example);

    int deleteByPrimaryKey(Long imgId);

    int insert(TbGoodsImg record);

    int insertSelective(TbGoodsImg record);

    List<TbGoodsImg> selectByExample(TbGoodsImgExample example);

    TbGoodsImg selectByPrimaryKey(Long imgId);

    int updateByExampleSelective(@Param("record") TbGoodsImg record, @Param("example") TbGoodsImgExample example);

    int updateByExample(@Param("record") TbGoodsImg record, @Param("example") TbGoodsImgExample example);

    int updateByPrimaryKeySelective(TbGoodsImg record);

    int updateByPrimaryKey(TbGoodsImg record);
}