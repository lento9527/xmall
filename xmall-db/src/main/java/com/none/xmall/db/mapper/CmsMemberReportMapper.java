package com.none.xmall.db.mapper;

import com.none.xmall.db.model.CmsMemberReport;
import com.none.xmall.db.model.CmsMemberReportExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CmsMemberReportMapper {
    int countByExample(CmsMemberReportExample example);

    int deleteByExample(CmsMemberReportExample example);

    int deleteByPrimaryKey(Long id);

    int insert(CmsMemberReport record);

    int insertSelective(CmsMemberReport record);

    List<CmsMemberReport> selectByExample(CmsMemberReportExample example);

    CmsMemberReport selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") CmsMemberReport record, @Param("example") CmsMemberReportExample example);

    int updateByExample(@Param("record") CmsMemberReport record, @Param("example") CmsMemberReportExample example);

    int updateByPrimaryKeySelective(CmsMemberReport record);

    int updateByPrimaryKey(CmsMemberReport record);
}