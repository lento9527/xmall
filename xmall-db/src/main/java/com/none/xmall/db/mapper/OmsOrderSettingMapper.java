package com.none.xmall.db.mapper;

import com.none.xmall.db.model.OmsOrderSetting;
import com.none.xmall.db.model.OmsOrderSettingExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OmsOrderSettingMapper {
    int countByExample(OmsOrderSettingExample example);

    int deleteByExample(OmsOrderSettingExample example);

    int deleteByPrimaryKey(Long id);

    int insert(OmsOrderSetting record);

    int insertSelective(OmsOrderSetting record);

    List<OmsOrderSetting> selectByExample(OmsOrderSettingExample example);

    OmsOrderSetting selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") OmsOrderSetting record, @Param("example") OmsOrderSettingExample example);

    int updateByExample(@Param("record") OmsOrderSetting record, @Param("example") OmsOrderSettingExample example);

    int updateByPrimaryKeySelective(OmsOrderSetting record);

    int updateByPrimaryKey(OmsOrderSetting record);
}