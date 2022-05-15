package com.wxz.mall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wxz.common.utils.PageUtils;
import com.wxz.mall.coupon.entity.UndoLogEntity;

import java.util.Map;

/**
 * 
 *
 * @author wangxizhi
 * @email wangxizhi@gmail.com
 * @date 2022-05-15 23:35:42
 */
public interface UndoLogService extends IService<UndoLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

