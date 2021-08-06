package cn.running4light.javajichu.designPatterns.factory;

/**
 * @author running4light
 * @description
 * @createTime 2021/8/6 11:36
 */
public class TestFactory {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape circle = shapeFactory.getShape("CIRCLE");

        Shape rec = shapeFactory.getShape("rec");
        circle.draw();
        rec.draw();

    }
}
