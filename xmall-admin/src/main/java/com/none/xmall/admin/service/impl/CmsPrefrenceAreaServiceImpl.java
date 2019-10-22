package com.none.xmall.admin.service.impl;

import com.none.xmall.db.mapper.CmsPrefrenceAreaMapper;
import com.none.xmall.db.model.CmsPrefrenceArea;
import com.none.xmall.db.model.CmsPrefrenceAreaExample;
import com.none.xmall.admin.service.CmsPrefrenceAreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 商品优选Service实现类
 * Created by macro on 2018/6/1.
 */
@Service
public class CmsPrefrenceAreaServiceImpl implements CmsPrefrenceAreaService {
    @Autowired
    private CmsPrefrenceAreaMapper prefrenceAreaMapper;

    @Override
    public List<CmsPrefrenceArea> listAll() {
        return prefrenceAreaMapper.selectByExample(new CmsPrefrenceAreaExample());
    }
}
