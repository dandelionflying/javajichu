package cn.running4light.javajichu.designPatterns.factory;

import java.awt.*;

/**
 * @author running4light
 * @description
 * @createTime 2021/8/6 11:32
 */
public class ShapeFactory {

    public Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }
        if (shapeType.equalsIgnoreCase("CIRCLE")) {
            return new CircleShape();
        } else if (shapeType.equalsIgnoreCase("REC")) {
            return new RecShape();
        }
        return null;
    }
}
