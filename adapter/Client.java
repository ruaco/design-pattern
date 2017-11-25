package adapter;

import adapter.exist.Adaptee;
import adapter.wrapper.ClassAdapter;
import adapter.wrapper.ObjectAdapter;
import adapter.wrapper.Target;

/*
* 将一个类的接口转换成客户希望的另一个接口。
* Adapter模式使得原本由于接口不兼容而不能一起工作的类可以一起工作。
* 又叫 Wrapper
* 类模式版本 - 借助继承
* 对象版本   - 借助私有成员变量
* */
public class Client {

    public static void main(String[] args) {
        Target classTarget = new ClassAdapter();
        classTarget.newMethod();

        Adaptee adaptee = new Adaptee();
        Target objectTarget = new ObjectAdapter(adaptee);
        objectTarget.newMethod();
    }
}
