package org.freedom.boot.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.freedom.boot.bean.EvaluateLike;
import org.freedom.boot.bean.EvaluateLikeExample;

public interface EvaluateLikeMapper {
    long countByExample(EvaluateLikeExample example);

    int deleteByExample(EvaluateLikeExample example);

    int deleteByPrimaryKey(Integer likeId);

    int insert(EvaluateLike record);

    int insertSelective(EvaluateLike record);

    List<EvaluateLike> selectByExample(EvaluateLikeExample example);

    EvaluateLike selectByPrimaryKey(Integer likeId);

    int updateByExampleSelective(@Param("record") EvaluateLike record, @Param("example") EvaluateLikeExample example);

    int updateByExample(@Param("record") EvaluateLike record, @Param("example") EvaluateLikeExample example);

    int updateByPrimaryKeySelective(EvaluateLike record);

    int updateByPrimaryKey(EvaluateLike record);
}