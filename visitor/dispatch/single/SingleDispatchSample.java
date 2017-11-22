package visitor.dispatch.single;
/**
 宗量: arity
 分派: dispatch
 解析: resolution
 http://rednaxelafx.iteye.com/blog/260206
* */
public class SingleDispatchSample {

    static class A { }

    static class B extends A { }

    static class Foo {
        public void method(A a) {
            System.out.println("Foo-method(A)");
        }
    }

    static class Bar extends Foo {
        public void method(A a) {
            System.out.println("Bar-method(A)");
        }

        public void method(B b) {
            System.out.println("Bar-method(B)");
        }
    }


    public static void main(String[] args) {
        A a = new A();
        Foo foo = new Foo();
        Foo bar = new Bar();
        // 静态多分派
        foo.method(a); // Foo-method(A)
        bar.method(a); // Bar-method(A)


        A b = new B();
        // 动态单分派
        bar.method(b); // Bar-method(A)
    }
}
