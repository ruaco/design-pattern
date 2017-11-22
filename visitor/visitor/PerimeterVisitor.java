package visitor.visitor;

import visitor.elements.Circle;
import visitor.elements.Rectangle;

import java.net.URL;

public class PerimeterVisitor implements Visitor {

    @Override
    public void visit(Rectangle shape) {
        System.out.println("perimeter visitor: " + shape.getClass().getName());
    }

    @Override
    public void visit(Circle shape) {
        System.out.println("perimeter visitor: " + shape.getClass().getName());
    }
}
