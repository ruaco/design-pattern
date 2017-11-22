package visitor.elements;

import visitor.visitor.Visitor;

public class Circle implements Shape {

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
