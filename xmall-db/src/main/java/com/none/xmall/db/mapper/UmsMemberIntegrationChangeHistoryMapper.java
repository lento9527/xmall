package com.none.xmall.db.mapper;

import com.none.xmall.db.model.UmsMemberIntegrationChangeHistory;
import com.none.xmall.db.model.UmsMemberIntegrationChangeHistoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UmsMemberIntegrationChangeHistoryMapper {
    int countByExample(UmsMemberIntegrationChangeHistoryExample example);

    int deleteByExample(UmsMemberIntegrationChangeHistoryExample example);

    int deleteByPrimaryKey(Long id);

    int insert(UmsMemberIntegrationChangeHistory record);

    int insertSelective(UmsMemberIntegrationChangeHistory record);

    List<UmsMemberIntegrationChangeHistory> selectByExample(UmsMemberIntegrationChangeHistoryExample example);

    UmsMemberIntegrationChangeHistory selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") UmsMemberIntegrationChangeHistory record, @Param("example") UmsMemberIntegrationChangeHistoryExample example);

    int updateByExample(@Param("record") UmsMemberIntegrationChangeHistory record, @Param("example") UmsMemberIntegrationChangeHistoryExample example);

    int updateByPrimaryKeySelective(UmsMemberIntegrationChangeHistory record);

    int updateByPrimaryKey(UmsMemberIntegrationChangeHistory record);
}