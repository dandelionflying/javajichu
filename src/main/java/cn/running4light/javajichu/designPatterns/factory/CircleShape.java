package cn.running4light.javajichu.designPatterns.factory;

/**
 * @author running4light
 * @description
 * @createTime 2021/8/6 11:33
 */
public class CircleShape implements Shape{

    @Override
    public void draw() {
        System.err.println("cricle drawing");
    }
}
