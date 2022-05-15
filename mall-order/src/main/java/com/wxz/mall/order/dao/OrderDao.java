package com.wxz.mall.order.dao;

import com.wxz.mall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author wangxizhi
 * @email wangxizhi@gmail.com
 * @date 2022-05-15 23:39:27
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
