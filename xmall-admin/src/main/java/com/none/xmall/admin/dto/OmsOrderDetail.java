package com.none.xmall.admin.dto;

import com.none.xmall.db.model.OmsOrderItem;
import com.none.xmall.db.model.OmsOrderOperateHistory;
import com.none.xmall.db.model.OmsOrder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * 订单详情信息
 * Created by macro on 2018/10/11.
 */
public class OmsOrderDetail extends OmsOrder {
    @Getter
    @Setter
    private List<OmsOrderItem> orderItemList;
    @Getter
    @Setter
    private List<OmsOrderOperateHistory> historyList;
}
