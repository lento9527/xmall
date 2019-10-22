package com.none.xmall.db.mapper;

import com.none.xmall.db.model.UmsAdminRolePermissionRelation;
import com.none.xmall.db.model.UmsAdminRolePermissionRelationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UmsAdminRolePermissionRelationMapper {
    int countByExample(UmsAdminRolePermissionRelationExample example);

    int deleteByExample(UmsAdminRolePermissionRelationExample example);

    int deleteByPrimaryKey(Long id);

    int insert(UmsAdminRolePermissionRelation record);

    int insertSelective(UmsAdminRolePermissionRelation record);

    List<UmsAdminRolePermissionRelation> selectByExample(UmsAdminRolePermissionRelationExample example);

    UmsAdminRolePermissionRelation selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") UmsAdminRolePermissionRelation record, @Param("example") UmsAdminRolePermissionRelationExample example);

    int updateByExample(@Param("record") UmsAdminRolePermissionRelation record, @Param("example") UmsAdminRolePermissionRelationExample example);

    int updateByPrimaryKeySelective(UmsAdminRolePermissionRelation record);

    int updateByPrimaryKey(UmsAdminRolePermissionRelation record);
}