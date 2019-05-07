package com.lyx.ag.cache.loader;

import com.google.common.cache.CacheBuilder;
import com.lyx.ag.cache.Category;

import javax.xml.transform.Result;


/**
 * Created by liyixiang on 2019/1/7.
 */
public class GuavaCacheLoader {

    public static void loadSoR(){
        /**
        LoadingCache<String,Result<Category>> getCache =
                CacheBuilder.newBuilder().build(new CacheLoader<String, Result<Category>>() {
                    @Override
                    public Result<Category> load(String s) throws Exception {
                        return null;
                    }
                });

        **/
    }
}
