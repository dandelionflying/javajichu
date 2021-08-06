package cn.running4light.javajichu.designPatterns.factory;

/**
 * @author running4light
 * @description
 * @createTime 2021/8/6 11:34
 */
public class RecShape implements Shape {
    @Override
    public void draw() {
        System.err.println("Rec drawing");
    }
}
