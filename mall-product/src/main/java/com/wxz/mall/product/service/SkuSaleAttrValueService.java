package com.wxz.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wxz.common.utils.PageUtils;
import com.wxz.mall.product.entity.SkuSaleAttrValueEntity;

import java.util.Map;

/**
 * sku销售属性&值
 *
 * @author wangxizhi
 * @email wangxizhi@gmail.com
 * @date 2022-05-12 02:12:00
 */
public interface SkuSaleAttrValueService extends IService<SkuSaleAttrValueEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

