package cn.running4light.javajichu.thread;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author running4light
 * @description
 * @createTime 2021/8/4 12:17
 */
public class ThreadOrderRunTest {
    public static void main(String[] args) {
        ThreadOrderRunTest test = new ThreadOrderRunTest();
        test.func1();

    }

    /**
     * @Description 线程顺序执行
     * @Author running4light朱泽雄
     * @CreateTime 15:10 2021/8/4
     * @Return
     */
    public void func1(){
        ExecutorService executorService = Executors.newCachedThreadPool();
//        ExecutorService executorService = Executors.newSingleThreadExecutor();// 单例
//        ExecutorService executorService = Executors.newCachedThreadPool();


//        executorService.execute(()->System.err.println("第1个 (lambda方式)"));
//        executorService.execute(()->System.err.println("第2个 (lambda方式)"));
//        executorService.execute(()->System.err.println("第3个 (lambda方式)"));
//        executorService.execute(()->System.err.println("第4个 (lambda方式)"));
//        executorService.execute(()->System.err.println("第5个 (lambda方式)"));

        for (int i = 0; i < 100; i++) {
            executorService.execute(new Thread1(i));
        }

    }

    public void func2(){
        for (int i = 0; i < 100; i++) {
            Thread1 thread = new Thread1(i);
            thread.start();
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
