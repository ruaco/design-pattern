package adapter.wrapper;

import adapter.exist.Adaptee;

public class ObjectAdapter implements Target {
    private Adaptee adaptee;

    public ObjectAdapter(Adaptee adaptee) {
        this.setAdaptee(adaptee);
    }

    public void setAdaptee(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void newMethod() {
        System.out.print("ObjectAdapter: ");
        adaptee.oldMethod();
    }
}
