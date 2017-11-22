package visitor.visitor;

import visitor.elements.Circle;
import visitor.elements.Rectangle;

public interface Visitor {

    public void visit(Rectangle shape);
    public void visit(Circle shape);
}
