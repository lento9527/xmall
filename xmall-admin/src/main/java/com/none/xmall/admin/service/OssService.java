package com.none.xmall.admin.service;

import com.none.xmall.admin.dto.OssCallbackResult;
import com.none.xmall.admin.dto.OssPolicyResult;

import javax.servlet.http.HttpServletRequest;

/**
 * oss上传管理Service
 * Created by macro on 2018/5/17.
 */
public interface OssService {
    OssPolicyResult policy();
    OssCallbackResult callback(HttpServletRequest request);
}
