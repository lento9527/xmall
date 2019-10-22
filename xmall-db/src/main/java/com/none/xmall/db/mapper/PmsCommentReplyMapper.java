package com.none.xmall.db.mapper;

import com.none.xmall.db.model.PmsCommentReply;
import com.none.xmall.db.model.PmsCommentReplyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PmsCommentReplyMapper {
    int countByExample(PmsCommentReplyExample example);

    int deleteByExample(PmsCommentReplyExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PmsCommentReply record);

    int insertSelective(PmsCommentReply record);

    List<PmsCommentReply> selectByExample(PmsCommentReplyExample example);

    PmsCommentReply selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PmsCommentReply record, @Param("example") PmsCommentReplyExample example);

    int updateByExample(@Param("record") PmsCommentReply record, @Param("example") PmsCommentReplyExample example);

    int updateByPrimaryKeySelective(PmsCommentReply record);

    int updateByPrimaryKey(PmsCommentReply record);
}