package com.anan.huotui.mapper;

import com.anan.huotui.po.TbWuliu;
import com.anan.huotui.po.TbWuliuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbWuliuMapper {
    int countByExample(TbWuliuExample example);

    int deleteByExample(TbWuliuExample example);

    int deleteByPrimaryKey(Long wid);

    int insert(TbWuliu record);

    int insertSelective(TbWuliu record);

    List<TbWuliu> selectByExample(TbWuliuExample example);

    TbWuliu selectByPrimaryKey(Long wid);

    int updateByExampleSelective(@Param("record") TbWuliu record, @Param("example") TbWuliuExample example);

    int updateByExample(@Param("record") TbWuliu record, @Param("example") TbWuliuExample example);

    int updateByPrimaryKeySelective(TbWuliu record);

    int updateByPrimaryKey(TbWuliu record);
}