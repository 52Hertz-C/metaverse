package com.meta.user.common.config.mybatis;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @program: metaverse
 * @description: mybatis-plus配置
 * @packagename: com.meta.user.common.config.mybatis
 * @author: cxy
 * @date: 2022-02-19 16:38:18
 **/
@Configuration
public class MybatisPlusConfig {

    /**
     * 分页插件
     */
    @Bean
    public PaginationInterceptor paginationInterceptor() {
        return new PaginationInterceptor();
    }
}
