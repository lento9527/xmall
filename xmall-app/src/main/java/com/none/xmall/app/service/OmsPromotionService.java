package com.none.xmall.app.service;

import com.none.xmall.db.model.OmsCartItem;
import com.none.xmall.app.domain.CartPromotionItem;

import java.util.List;

/**
 * Created by macro on 2018/8/27.
 * 促销管理Service
 */
public interface OmsPromotionService {
    /**
     * 计算购物车中的促销活动信息
     * @param cartItemList 购物车
     */
    List<CartPromotionItem> calcCartPromotion(List<OmsCartItem> cartItemList);
}
