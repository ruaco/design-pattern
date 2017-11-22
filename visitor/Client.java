package visitor;

import visitor.elements.Circle;
import visitor.elements.Rectangle;
import visitor.elements.Shape;
import visitor.visitor.PerimeterVisitor;
import visitor.visitor.SpecialVisitor;
import visitor.visitor.Visitor;

/**
 * 几何图形的访问者
 * */
public class Client {
    public static void main(String[] args) {
        Visitor v = new PerimeterVisitor();
        Visitor s = new SpecialVisitor();

        Shape s1 = new Circle();
        // 解决了动态多分派的问题
        s1.accept(v);
        s1.accept(s);

        Shape s2 = new Rectangle();
        s2.accept(v);
        s2.accept(s);
    }
}
