package com.none.xmall.admin.controller;

import com.none.xmall.admin.dto.CommonResult;
import com.none.xmall.admin.service.SmsCouponHistoryService;
import com.none.xmall.db.model.SmsCouponHistory;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * 优惠券领取记录管理Controller
 * Created by macro on 2018/11/6.
 */
@Controller
@Api(tags = "SmsCouponHistoryController",description = "优惠券领取记录管理")
@RequestMapping("/couponHistory")
public class SmsCouponHistoryController {
    @Autowired
    private SmsCouponHistoryService historyService;
    @ApiOperation("根据优惠券id，使用状态，订单编号分页获取领取记录")
    @RequestMapping(value = "/list",method = RequestMethod.GET)
    @ResponseBody
    public Object list(@RequestParam(value = "couponId",required = false) Long couponId,
                       @RequestParam(value = "useStatus",required = false) Integer useStatus,
                       @RequestParam(value = "orderSn",required = false) String orderSn,
                       @RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize,
                       @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum){
        List<SmsCouponHistory> historyList = historyService.list(couponId,useStatus,orderSn,pageSize,pageNum);
        return new CommonResult().pageSuccess(historyList);
    }
}
