package com.none.xmall.db.mapper;

import com.none.xmall.db.model.UmsMemberReceiveAddress;
import com.none.xmall.db.model.UmsMemberReceiveAddressExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UmsMemberReceiveAddressMapper {
    int countByExample(UmsMemberReceiveAddressExample example);

    int deleteByExample(UmsMemberReceiveAddressExample example);

    int deleteByPrimaryKey(Long id);

    int insert(UmsMemberReceiveAddress record);

    int insertSelective(UmsMemberReceiveAddress record);

    List<UmsMemberReceiveAddress> selectByExample(UmsMemberReceiveAddressExample example);

    UmsMemberReceiveAddress selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") UmsMemberReceiveAddress record, @Param("example") UmsMemberReceiveAddressExample example);

    int updateByExample(@Param("record") UmsMemberReceiveAddress record, @Param("example") UmsMemberReceiveAddressExample example);

    int updateByPrimaryKeySelective(UmsMemberReceiveAddress record);

    int updateByPrimaryKey(UmsMemberReceiveAddress record);
}