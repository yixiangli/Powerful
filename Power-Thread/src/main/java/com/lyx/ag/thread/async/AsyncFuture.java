package com.lyx.ag.thread.async;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/**
 * Created by liyixiang on 2019/1/10.
 */
public class AsyncFuture {

    final static ExecutorService executor = Executors.newFixedThreadPool(2);

    public static void main(String[] args) throws Exception {
        RpcService rpcService = new RpcService();
        HttpService httpService = new HttpService();

        Future<Map<String,String>> future1 = null;
        Future<Integer> future2 = null;

        try {
            future1 = executor.submit(() -> rpcService.getRpcService());
            future2 = executor.submit(() -> httpService.getHttpService());

            Map<String,String> result1 = future1.get(2000, TimeUnit.MILLISECONDS);

            Integer result2 = future2.get(2000,TimeUnit.MILLISECONDS);

            System.out.println(result1.get("key"));
            System.out.println(result2);
        }catch (Exception e) {
            if(future1 != null){
                future1.cancel(true);
            }
            if(future2 != null){
                future2.cancel(true);
            }
            throw new RuntimeException(e);
        }
        future1.cancel(true);
        future2.cancel(true);
        executor.shutdown();

    }


    static class RpcService {

        Map<String,String> getRpcService() throws Exception {
            Thread.sleep(150);
            Map<String,String> result = new HashMap<>();
            result.put("key","1");
            return result;
        }

    }

    static class HttpService {

        Integer getHttpService() throws Exception {
            Thread.sleep(100);
            return 2;
        }

    }

}
