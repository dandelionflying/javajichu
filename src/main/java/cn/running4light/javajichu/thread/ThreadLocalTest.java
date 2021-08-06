package cn.running4light.javajichu.thread;

/**
 * @author running4light
 * @description
 * @createTime 2021/7/31 10:56
 */
public class ThreadLocalTest {
    static void print(String str){
        System.err.println(str + ": " +threadLocal.get());
//        threadLocal.remove();
    }
    static ThreadLocal<String> threadLocal = new ThreadLocal<>(){
        @Override
        protected String initialValue(){
            return "initvalue";
        }
    };

    public static void main(String[] args) {
        Thread threadOne = new Thread(new Runnable() {
            @Override
            public void run() {
                threadLocal.set("threadOne local");
                System.err.println("t1" + ": " +threadLocal.get());
            }
        });
        Thread threadTwo = new Thread(new Runnable() {
            @Override
            public void run() {
                threadLocal.set("threadTwo local");
                System.err.println("t2" + ": " +threadLocal.get());
            }
        });
        threadOne.start();
        threadTwo.start();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.err.println(threadLocal.get());
    }
}
