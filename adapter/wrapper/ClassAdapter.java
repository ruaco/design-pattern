package adapter.wrapper;

import adapter.exist.Adaptee;

// 用来兼容 Adaptee
public class ClassAdapter extends Adaptee implements Target {

    @Override
    public void newMethod() {
        System.out.print("ClassAdapter: ");
        this.oldMethod();
    }
}
