package com.stoad.demo.config;

import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.concurrent.ConcurrentMapCacheManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableCaching
public class CacheConfig {

    //Static cache manager only allowing specified cache names
    //If no cache manager is specified, then cache is created upon requested
    @Bean
    public CacheManager cacheManager() {
        return new ConcurrentMapCacheManager("chores");
    }
}
