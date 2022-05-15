package com.wxz.mall.product.dao;

import com.wxz.mall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author wangxizhi
 * @email wangxizhi@gmail.com
 * @date 2022-05-12 02:12:01
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
