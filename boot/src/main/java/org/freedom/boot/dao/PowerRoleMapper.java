package org.freedom.boot.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.freedom.boot.bean.PowerRole;
import org.freedom.boot.bean.PowerRoleExample;

public interface PowerRoleMapper {
    long countByExample(PowerRoleExample example);

    int deleteByExample(PowerRoleExample example);

    int deleteByPrimaryKey(Integer powerRoleId);

    int insert(PowerRole record);

    int insertSelective(PowerRole record);

    List<PowerRole> selectByExample(PowerRoleExample example);

    PowerRole selectByPrimaryKey(Integer powerRoleId);

    int updateByExampleSelective(@Param("record") PowerRole record, @Param("example") PowerRoleExample example);

    int updateByExample(@Param("record") PowerRole record, @Param("example") PowerRoleExample example);

    int updateByPrimaryKeySelective(PowerRole record);

    int updateByPrimaryKey(PowerRole record);
}