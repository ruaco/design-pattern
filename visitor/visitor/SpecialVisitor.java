package visitor.visitor;

import visitor.elements.Circle;
import visitor.elements.Rectangle;

public class SpecialVisitor implements Visitor {

    @Override
    public void visit(Rectangle shape) {
        System.out.println("special visitor: " + shape.getClass().getName());
    }

    @Override
    public void visit(Circle shape) {
        System.out.println("special visitor: " + shape.getClass().getName());
    }
}
