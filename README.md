
> 这是个简单的个人学习代码仓库，时不时诈尸更新，会简单记录一些 Kotlin 的语法备忘
> 现在还是用 Java，也不知道哪天能用上 Kotlin
> 但是嘛，谁也不知道哪篇云彩有雨不是？☔️☔️☔️


1、Kotlin 所有的类都默认 final，遵循 EffectiveJava 的建议：要么为继承而设计，要么就禁止继承；
想要开放继承，需要声明 open；

2、尽可能的使用 val 而不是 var；

3、如果方法的返回值可以用一个等式表达，可以直接用等号代替花括号
```kotlin
fun add(x: Int, y: Int) = x + y
```

4、默认构造器和类名一起声明，初始化操作有对应的 init 方法；

5、写一个扩展，语法糖还是甜
```kotlin
fun Context.toast(msg: CharSequence, duration: Int = Toast.LENGTH_SHORT){
    Toast.makeText(this, msg, duration).show();
}
```

6、数据类直接声明 data class，参数往构造器里扔；
重写 getter/setter 的时候，可以用 `field` 来指代当前属性；

7、伴生对象会被当前类的所有对象共有，类似 Java 的静态

8、所有的 Kotlin 函数都会返回一个值，不声明返回值，就会返回 Unit 类