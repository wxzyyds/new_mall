package com.wxz.mall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wxz.common.utils.PageUtils;
import com.wxz.mall.coupon.entity.CouponSpuCategoryRelationEntity;

import java.util.Map;

/**
 * 优惠券分类关联
 *
 * @author wangxizhi
 * @email wangxizhi@gmail.com
 * @date 2022-05-15 23:35:43
 */
public interface CouponSpuCategoryRelationService extends IService<CouponSpuCategoryRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

