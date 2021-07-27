package com.stoad.demo.config;

import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableCaching
public class CacheConfig {

//    @Bean
//    public CacheManager cacheManager() {
//        return new ConcurrentMapCacheManager("addresses");
//    }
}
