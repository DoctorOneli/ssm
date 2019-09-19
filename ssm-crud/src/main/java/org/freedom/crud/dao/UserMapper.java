package org.freedom.crud.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.freedom.crud.bean.User;
import org.freedom.crud.bean.UserExample;

public interface UserMapper {
    long countByExample(UserExample example);

    int deleteByExample(UserExample example);

    int deleteByPrimaryKey(Integer uid);

    int insert(User record);

    int insertSelective(User record);

    List<User> selectByExample(UserExample example);

    User selectByPrimaryKey(Integer uid);
    
    List<User> selectByExampleWithClass(UserExample example);

    User selectByPrimaryKeyWithClass(Integer uid);

    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

    int updateByExample(@Param("record") User record, @Param("example") UserExample example);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}