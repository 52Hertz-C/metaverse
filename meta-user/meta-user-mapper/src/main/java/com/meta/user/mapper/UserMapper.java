package com.meta.user.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.meta.user.common.entity.User;

/**
 * @program: metaverse
 * @description: 用户mapper
 * @packagename: com.meta.user.mapper
 * @author: cxy
 * @date: 2022-02-19 16:36:00
 **/
//@CacheNamespace(implementation= MybatisRedisCache.class,eviction=MybatisRedisCache.class)
public interface UserMapper extends BaseMapper<User> {
}
