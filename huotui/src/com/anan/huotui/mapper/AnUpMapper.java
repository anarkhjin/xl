package com.anan.huotui.mapper;

import com.anan.huotui.po.AnUp;
import com.anan.huotui.po.AnUpExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AnUpMapper {
    int countByExample(AnUpExample example);

    int deleteByExample(AnUpExample example);

    int deleteByPrimaryKey(Long id);

    int insert(AnUp record);

    int insertSelective(AnUp record);

    List<AnUp> selectByExample(AnUpExample example);

    AnUp selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") AnUp record, @Param("example") AnUpExample example);

    int updateByExample(@Param("record") AnUp record, @Param("example") AnUpExample example);

    int updateByPrimaryKeySelective(AnUp record);

    int updateByPrimaryKey(AnUp record);
}