package cn.running4light.javajichu.thread;

/**
 * @author running4light
 * @description
 * @createTime 2021/8/4 14:08
 */
public class Thread1 extends Thread{
    private int data ;
    public Thread1(int data){
        this.data = data;
    }
    @Override
    public void run(){
        System.err.println(data);
    }
}
