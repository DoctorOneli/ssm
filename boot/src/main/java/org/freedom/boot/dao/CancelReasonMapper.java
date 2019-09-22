package org.freedom.boot.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.freedom.boot.bean.CancelReason;
import org.freedom.boot.bean.CancelReasonExample;

public interface CancelReasonMapper {
    long countByExample(CancelReasonExample example);

    int deleteByExample(CancelReasonExample example);

    int deleteByPrimaryKey(Integer cancelReasonId);

    int insert(CancelReason record);

    int insertSelective(CancelReason record);

    List<CancelReason> selectByExample(CancelReasonExample example);

    CancelReason selectByPrimaryKey(Integer cancelReasonId);

    int updateByExampleSelective(@Param("record") CancelReason record, @Param("example") CancelReasonExample example);

    int updateByExample(@Param("record") CancelReason record, @Param("example") CancelReasonExample example);

    int updateByPrimaryKeySelective(CancelReason record);

    int updateByPrimaryKey(CancelReason record);
}