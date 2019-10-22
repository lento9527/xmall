package com.none.xmall.db.mapper;

import com.none.xmall.db.model.UmsMemberIntegrationConsumeSetting;
import com.none.xmall.db.model.UmsMemberIntegrationConsumeSettingExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UmsMemberIntegrationConsumeSettingMapper {
    int countByExample(UmsMemberIntegrationConsumeSettingExample example);

    int deleteByExample(UmsMemberIntegrationConsumeSettingExample example);

    int deleteByPrimaryKey(Long id);

    int insert(UmsMemberIntegrationConsumeSetting record);

    int insertSelective(UmsMemberIntegrationConsumeSetting record);

    List<UmsMemberIntegrationConsumeSetting> selectByExample(UmsMemberIntegrationConsumeSettingExample example);

    UmsMemberIntegrationConsumeSetting selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") UmsMemberIntegrationConsumeSetting record, @Param("example") UmsMemberIntegrationConsumeSettingExample example);

    int updateByExample(@Param("record") UmsMemberIntegrationConsumeSetting record, @Param("example") UmsMemberIntegrationConsumeSettingExample example);

    int updateByPrimaryKeySelective(UmsMemberIntegrationConsumeSetting record);

    int updateByPrimaryKey(UmsMemberIntegrationConsumeSetting record);
}