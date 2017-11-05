# builder 生成器模式

写了两个 case

一个是常用的 query 类, 还有一个是httpResponse 类, 都是非常适合 builder 模式的场景.

JavaScript 也可以用类似的方式完成生成器

```javascript
class Object {
    static new(...args) {
        return new this(...args)
    }
}
```

使用其他类的时候 extends 这个类即可, 这个是通用生成器, 通过调用 new 的方法取代 new Class() 的语法.
