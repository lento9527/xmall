package com.none.xmall.db.mapper;

import com.none.xmall.db.model.PmsSkuStock;
import com.none.xmall.db.model.PmsSkuStockExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PmsSkuStockMapper {
    int countByExample(PmsSkuStockExample example);

    int deleteByExample(PmsSkuStockExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PmsSkuStock record);

    int insertSelective(PmsSkuStock record);

    List<PmsSkuStock> selectByExample(PmsSkuStockExample example);

    PmsSkuStock selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PmsSkuStock record, @Param("example") PmsSkuStockExample example);

    int updateByExample(@Param("record") PmsSkuStock record, @Param("example") PmsSkuStockExample example);

    int updateByPrimaryKeySelective(PmsSkuStock record);

    int updateByPrimaryKey(PmsSkuStock record);
}