package com.wxz.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wxz.common.utils.PageUtils;
import com.wxz.mall.product.entity.CategoryBrandRelationEntity;

import java.util.Map;

/**
 * 品牌分类关联
 *
 * @author wangxizhi
 * @email wangxizhi@gmail.com
 * @date 2022-05-12 02:12:01
 */
public interface CategoryBrandRelationService extends IService<CategoryBrandRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

