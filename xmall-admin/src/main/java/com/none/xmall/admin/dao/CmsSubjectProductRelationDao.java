package com.none.xmall.admin.dao;

import com.none.xmall.db.model.CmsSubjectProductRelation;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 自定义商品和专题关系操作
 * Created by macro on 2018/4/26.
 */
public interface CmsSubjectProductRelationDao {
    int insertList(@Param("list") List<CmsSubjectProductRelation> subjectProductRelationList);
}
