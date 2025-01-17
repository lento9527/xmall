package com.none.xmall.app.controller;

import com.none.xmall.app.domain.CommonResult;
import com.none.xmall.app.domain.MemberProductCollection;
import com.none.xmall.app.service.MemberCollectionService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 会员收藏管理Controller
 * Created by macro on 2018/8/2.
 */
@Controller
@Api(tags = "MemberCollectionController", description = "会员收藏管理")
@RequestMapping("/member/collection")
public class MemberCollectionController {
    @Autowired
    private MemberCollectionService memberCollectionService;
    @ApiOperation("添加商品收藏")
    @RequestMapping(value = "/addProduct", method = RequestMethod.POST)
    @ResponseBody
    public Object addProduct(@RequestBody MemberProductCollection productCollection) {
        int count = memberCollectionService.addProduct(productCollection);
        if(count>0){
            return new CommonResult().success(count);
        }else{
            return new CommonResult().failed();
        }
    }

    @ApiOperation("删除收藏商品")
    @RequestMapping(value = "/deleteProduct", method = RequestMethod.POST)
    @ResponseBody
    public Object deleteProduct(Long memberId, Long productId) {
        int count = memberCollectionService.deleteProduct(memberId,productId);
        if(count>0){
            return new CommonResult().success(count);
        }else{
            return new CommonResult().failed();
        }
    }

    @ApiOperation("显示关注列表")
    @RequestMapping(value = "/listProduct/{memberId}", method = RequestMethod.GET)
    @ResponseBody
    public Object listProduct(@PathVariable Long memberId) {
        List<MemberProductCollection> memberProductCollectionList = memberCollectionService.listProduct(memberId);
        return new CommonResult().success(memberProductCollectionList);
    }
}
