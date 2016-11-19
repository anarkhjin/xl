package com.anan.huotui.mapper;

import com.anan.huotui.po.TbQuan;
import com.anan.huotui.po.TbQuanExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbQuanMapper {
    int countByExample(TbQuanExample example);

    int deleteByExample(TbQuanExample example);

    int deleteByPrimaryKey(Long qid);

    int insert(TbQuan record);

    int insertSelective(TbQuan record);

    List<TbQuan> selectByExample(TbQuanExample example);

    TbQuan selectByPrimaryKey(Long qid);

    int updateByExampleSelective(@Param("record") TbQuan record, @Param("example") TbQuanExample example);

    int updateByExample(@Param("record") TbQuan record, @Param("example") TbQuanExample example);

    int updateByPrimaryKeySelective(TbQuan record);

    int updateByPrimaryKey(TbQuan record);
}