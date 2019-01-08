package com.lyx.ag.cache.heap;

import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;

/**
 * Created by liyixiang on 2019/1/7.
 */
public class GuavaCache {

    public static void test(){
        Cache<String,String> mycache = CacheBuilder.newBuilder().build();


    }
}
