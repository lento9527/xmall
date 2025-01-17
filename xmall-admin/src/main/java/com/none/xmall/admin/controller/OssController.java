package com.none.xmall.admin.controller;


import com.none.xmall.admin.dto.CommonResult;
import com.none.xmall.admin.dto.OssCallbackResult;
import com.none.xmall.admin.dto.OssPolicyResult;
import com.none.xmall.admin.service.impl.OssServiceImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

/**
 * Oss相关操作接口
 * Created by macro on 2018/4/26.
 */
@Controller
@Api(tags = "OssController",description = "Oss管理")
@RequestMapping("/aliyun/oss")
public class OssController {
	@Autowired
	private OssServiceImpl ossService;

	@ApiOperation(value = "oss上传签名生成")
	@RequestMapping(value = "/policy",method = RequestMethod.GET)
	@ResponseBody
	public Object policy() {
		OssPolicyResult result = ossService.policy();
		return new CommonResult().success(result);
	}

	@ApiOperation(value = "oss上传成功回调")
	@RequestMapping(value = "callback",method = RequestMethod.POST)
	@ResponseBody
	public Object callback(HttpServletRequest request) {
		OssCallbackResult ossCallbackResult = ossService.callback(request);
		return new CommonResult().success(ossCallbackResult);
	}

}
