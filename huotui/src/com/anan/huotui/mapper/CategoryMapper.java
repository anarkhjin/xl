package com.anan.huotui.mapper;

import com.anan.huotui.po.Category;
import com.anan.huotui.po.CategoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CategoryMapper {
    int countByExample(CategoryExample example);

    int deleteByExample(CategoryExample example);

    int deleteByPrimaryKey(Long cateId);

    int insert(Category record);

    int insertSelective(Category record);

    List<Category> selectByExampleWithBLOBs(CategoryExample example);

    List<Category> selectByExample(CategoryExample example);

    Category selectByPrimaryKey(Long cateId);

    int updateByExampleSelective(@Param("record") Category record, @Param("example") CategoryExample example);

    int updateByExampleWithBLOBs(@Param("record") Category record, @Param("example") CategoryExample example);

    int updateByExample(@Param("record") Category record, @Param("example") CategoryExample example);

    int updateByPrimaryKeySelective(Category record);

    int updateByPrimaryKeyWithBLOBs(Category record);

    int updateByPrimaryKey(Category record);
}