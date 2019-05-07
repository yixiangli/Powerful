package com.lyx.ag.thread.async;

import com.sun.org.apache.regexp.internal.RE;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpPatch;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.concurrent.FutureCallback;
import org.apache.http.impl.nio.client.CloseableHttpAsyncClient;
import org.apache.http.impl.nio.client.HttpAsyncClients;
import org.apache.http.nio.client.HttpAsyncClient;
import org.apache.http.nio.client.methods.HttpAsyncMethods;
import org.apache.http.nio.protocol.BasicAsyncResponseConsumer;
import org.apache.http.nio.protocol.HttpAsyncRequestProducer;
import org.apache.http.nio.protocol.HttpAsyncResponseConsumer;

import java.util.concurrent.CompletableFuture;

/**
 * Created by liyixiang on 2019/1/10.
 */
public class AsyncCallback {

    public static CloseableHttpAsyncClient httpAsyncClient;
    public static CompletableFuture<String> getHttpData(String url) {
        CompletableFuture asyncFuture = new CompletableFuture();

        HttpAsyncRequestProducer producer = HttpAsyncMethods.create(new HttpPost(url));
        HttpAsyncResponseConsumer consumer = new BasicAsyncResponseConsumer();

        FutureCallback callback = new FutureCallback<HttpResponse>() {
            @Override
            public void completed(HttpResponse httpResponse) {
                asyncFuture.complete(httpResponse);
            }

            @Override
            public void failed(Exception e) {
                asyncFuture.completeExceptionally(e);
            }

            @Override
            public void cancelled() {
                asyncFuture.cancel(true);
            }
        };

        httpAsyncClient.execute(producer,consumer,callback);
        return asyncFuture;
    }

    public static void main(String[] args) throws Exception {
        httpAsyncClient = HttpAsyncClients.createDefault();
        //异步httpclient必须调用start
        httpAsyncClient.start();
        CompletableFuture<String> future = AsyncCallback.getHttpData("http://www.jd.com");
        System.out.println(future.get());
    }
}
