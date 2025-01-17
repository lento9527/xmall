package com.none.xmall.app.service;

import com.none.xmall.app.domain.MemberProductCollection;

import java.util.List;

/**
 * 会员收藏Service
 * Created by macro on 2018/8/2.
 */
public interface MemberCollectionService {
    int addProduct(MemberProductCollection productCollection);

    int deleteProduct(Long memberId, Long productId);

    List<MemberProductCollection> listProduct(Long memberId);
}
