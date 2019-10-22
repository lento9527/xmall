package com.none.xmall.db.mapper;

import com.none.xmall.db.model.UmsAdminRole;
import com.none.xmall.db.model.UmsAdminRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UmsAdminRoleMapper {
    int countByExample(UmsAdminRoleExample example);

    int deleteByExample(UmsAdminRoleExample example);

    int deleteByPrimaryKey(Long id);

    int insert(UmsAdminRole record);

    int insertSelective(UmsAdminRole record);

    List<UmsAdminRole> selectByExample(UmsAdminRoleExample example);

    UmsAdminRole selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") UmsAdminRole record, @Param("example") UmsAdminRoleExample example);

    int updateByExample(@Param("record") UmsAdminRole record, @Param("example") UmsAdminRoleExample example);

    int updateByPrimaryKeySelective(UmsAdminRole record);

    int updateByPrimaryKey(UmsAdminRole record);
}