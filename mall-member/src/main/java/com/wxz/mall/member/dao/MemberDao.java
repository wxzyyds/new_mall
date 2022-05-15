package com.wxz.mall.member.dao;

import com.wxz.mall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author wangxizhi
 * @email wangxizhi@gmail.com
 * @date 2022-05-15 23:41:50
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
