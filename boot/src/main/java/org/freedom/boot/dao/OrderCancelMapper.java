package org.freedom.boot.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.freedom.boot.bean.OrderCancel;
import org.freedom.boot.bean.OrderCancelExample;

public interface OrderCancelMapper {
    long countByExample(OrderCancelExample example);

    int deleteByExample(OrderCancelExample example);

    int deleteByPrimaryKey(Integer orderCancelId);

    int insert(OrderCancel record);

    int insertSelective(OrderCancel record);

    List<OrderCancel> selectByExample(OrderCancelExample example);

    OrderCancel selectByPrimaryKey(Integer orderCancelId);

    int updateByExampleSelective(@Param("record") OrderCancel record, @Param("example") OrderCancelExample example);

    int updateByExample(@Param("record") OrderCancel record, @Param("example") OrderCancelExample example);

    int updateByPrimaryKeySelective(OrderCancel record);

    int updateByPrimaryKey(OrderCancel record);
}