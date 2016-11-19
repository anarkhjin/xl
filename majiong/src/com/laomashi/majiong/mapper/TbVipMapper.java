package com.laomashi.majiong.mapper;

import com.laomashi.majiong.po.TbVip;
import com.laomashi.majiong.po.TbVipExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbVipMapper {
    int countByExample(TbVipExample example);

    int deleteByExample(TbVipExample example);

    int deleteByPrimaryKey(Long vipid);

    int insert(TbVip record);

    int insertSelective(TbVip record);

    List<TbVip> selectByExample(TbVipExample example);

    TbVip selectByPrimaryKey(Long vipid);

    int updateByExampleSelective(@Param("record") TbVip record, @Param("example") TbVipExample example);

    int updateByExample(@Param("record") TbVip record, @Param("example") TbVipExample example);

    int updateByPrimaryKeySelective(TbVip record);

    int updateByPrimaryKey(TbVip record);
}