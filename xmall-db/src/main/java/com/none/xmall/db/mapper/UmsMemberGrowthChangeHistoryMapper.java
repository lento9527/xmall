package com.none.xmall.db.mapper;

import com.none.xmall.db.model.UmsMemberGrowthChangeHistory;
import com.none.xmall.db.model.UmsMemberGrowthChangeHistoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UmsMemberGrowthChangeHistoryMapper {
    int countByExample(UmsMemberGrowthChangeHistoryExample example);

    int deleteByExample(UmsMemberGrowthChangeHistoryExample example);

    int deleteByPrimaryKey(Long id);

    int insert(UmsMemberGrowthChangeHistory record);

    int insertSelective(UmsMemberGrowthChangeHistory record);

    List<UmsMemberGrowthChangeHistory> selectByExample(UmsMemberGrowthChangeHistoryExample example);

    UmsMemberGrowthChangeHistory selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") UmsMemberGrowthChangeHistory record, @Param("example") UmsMemberGrowthChangeHistoryExample example);

    int updateByExample(@Param("record") UmsMemberGrowthChangeHistory record, @Param("example") UmsMemberGrowthChangeHistoryExample example);

    int updateByPrimaryKeySelective(UmsMemberGrowthChangeHistory record);

    int updateByPrimaryKey(UmsMemberGrowthChangeHistory record);
}