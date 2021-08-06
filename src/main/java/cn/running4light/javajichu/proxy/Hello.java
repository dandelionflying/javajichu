package cn.running4light.javajichu.proxy;

/**
 * @author running4light
 * @description
 * @createTime 2021/7/30 11:39
 */
public class Hello implements HelloInt{
    @Override
    public void func() {
        System.err.println("func...");
    }
}
