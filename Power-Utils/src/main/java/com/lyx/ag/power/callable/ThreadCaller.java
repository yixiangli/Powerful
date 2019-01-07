package com.lyx.ag.power.callable;

import java.util.ArrayList;
import java.util.concurrent.*;

/**
 * @User: liyixiang
 * @Date: 2018/6/28
 * @TODO:
 *      Callable方式实现多线程
*/
public class ThreadCaller implements Callable<Boolean> {

    private int id;

    public ThreadCaller(int id) {
        this.id = id;
    }

    public Boolean call() throws Exception {
        System.out.println("回调了call函数");
        return true;
    }

}

class Test {
    public static void main(String[] args) {
        ExecutorService exec = Executors.newCachedThreadPool();
        ArrayList<Future<Boolean>> results = new ArrayList();
        for (int i = 0; i < 10; ++i) {
            results.add(exec.submit(new ThreadCaller(i)));
        }
        for (Future<Boolean> fs : results) {
            try {
                System.out.println(fs.get());
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            } finally {
                exec.shutdown();
            }
        }
    }
}


