package visitor.elements;

import visitor.visitor.Visitor;

public interface Shape {

    public void accept(Visitor visitor);
}
