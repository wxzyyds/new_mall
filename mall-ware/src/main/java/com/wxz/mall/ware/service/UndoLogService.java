package com.wxz.mall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wxz.common.utils.PageUtils;
import com.wxz.mall.ware.entity.UndoLogEntity;

import java.util.Map;

/**
 * 
 *
 * @author wangxizhi
 * @email wangxizhi@gmail.com
 * @date 2022-05-15 23:44:13
 */
public interface UndoLogService extends IService<UndoLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}
