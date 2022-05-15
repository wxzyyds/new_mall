package com.wxz.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wxz.common.utils.PageUtils;
import com.wxz.mall.product.entity.UndoLogEntity;

import java.util.Map;

/**
 * 
 *
 * @author wangxizhi
 * @email wangxizhi@gmail.com
 * @date 2022-05-12 02:12:00
 */
public interface UndoLogService extends IService<UndoLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

