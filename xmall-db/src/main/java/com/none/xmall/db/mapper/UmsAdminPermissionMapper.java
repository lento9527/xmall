package com.none.xmall.db.mapper;

import com.none.xmall.db.model.UmsAdminPermission;
import com.none.xmall.db.model.UmsAdminPermissionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UmsAdminPermissionMapper {
    int countByExample(UmsAdminPermissionExample example);

    int deleteByExample(UmsAdminPermissionExample example);

    int deleteByPrimaryKey(Long id);

    int insert(UmsAdminPermission record);

    int insertSelective(UmsAdminPermission record);

    List<UmsAdminPermission> selectByExample(UmsAdminPermissionExample example);

    UmsAdminPermission selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") UmsAdminPermission record, @Param("example") UmsAdminPermissionExample example);

    int updateByExample(@Param("record") UmsAdminPermission record, @Param("example") UmsAdminPermissionExample example);

    int updateByPrimaryKeySelective(UmsAdminPermission record);

    int updateByPrimaryKey(UmsAdminPermission record);
}