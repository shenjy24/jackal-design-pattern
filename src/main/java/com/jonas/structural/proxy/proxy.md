### 1.模式简介
#### 定义
代理模式的定义：由于某些原因需要给某对象提供一个代理以控制对该对象的访问。这时，访问对象不适合或者不能直接引用目标对象，代理对象作为访问对象和目标对象之间的中介。

#### 角色
代理模式包含如下角色：
- Subject: 抽象主题角色，通过接口或抽象类声明真实主题和代理对象实现的业务方法。
- RealSubject: 真实主题角色，实现了抽象主题中的具体业务，是代理对象所代表的真实对象，是最终要引用的对象。
- Proxy: 代理主题角色，提供了与真实主题相同的接口，其内部含有对真实主题的引用，它可以访问、控制或扩展真实主题的功能。

#### 实现
在代码中，一般代理会被理解为代码增强，实际上就是在原代码逻辑前后增加一些代码逻辑，而使调用者无感知。

根据代理的创建时期，代理模式分为静态代理和动态代理。
- 静态：由程序员创建代理类或特定工具自动生成源代码再对其编译，在程序运行前代理类的 .class 文件就已经存在了。
- 动态：在程序运行时，运用反射机制动态创建而成。

#### 应用场景
当不想直接引用某个对象或访问某个对象存在困难时，可以通过代理对象来间接访问。使用代理模式主要有两个目的：
1. 保护目标对象；
2. 增强目标对象。

### 2.静态代理

#### 简介
静态代理方式需要代理对象和目标对象实现一样的接口。

#### 优点
可以在不修改目标对象的前提下扩展目标对象的功能。

#### 缺点
- 冗余。由于代理对象要实现与目标对象一致的接口，会产生过多的代理类。
- 不易维护。一旦接口增加方法，目标对象与代理对象都要进行修改。

### 3.动态代理

#### 简介
动态代理利用了JDK API，动态地在内存中构建代理对象，从而实现对目标对象的代理功能。动态代理又被称为JDK代理或接口代理。

静态代理与动态代理的区别主要在：
- 静态代理在编译时就已经实现，编译完成后代理类是一个实际的class文件
- 动态代理是在运行时动态生成的，即编译完成后没有实际的class文件，而是在运行时动态生成类字节码，并加载到JVM中

特点：**动态代理对象不需要实现接口，但是要求目标对象必须实现接口，否则不能使用动态代理。**

#### JDK相关类
- java.lang.reflect Proxy
```
//返回一个指定接口的代理类实例，该接口可以将方法调用指派到指定的调用处理程序。
static Object newProxyInstance(ClassLoader loader,      //指定当前目标对象使用类加载器
                               Class<?>[] interfaces,   //目标对象实现的接口的类型
                               InvocationHandler h      //事件处理器
) 
```
- java.lang.reflect InvocationHandler
```
// 在代理实例上处理方法调用并返回结果。
Object invoke(Object proxy, Method method, Object[] args) 
```

### 4.cglib代理

cglib (Code Generation Library )是一个第三方代码生成类库，运行时在内存中动态生成一个子类对象从而实现对目标对象功能的扩展。

cglib特点
- JDK的动态代理有一个限制，就是使用动态代理的对象必须实现一个或多个接口。如果想代理没有实现接口的类，就可以使用CGLIB实现。
- CGLIB是一个强大的高性能的代码生成包，它可以在运行期扩展Java类与实现Java接口。它广泛的被许多AOP的框架使用，例如Spring AOP和dynaop，为他们提供方法的interception（拦截）。
- CGLIB包的底层是通过使用一个小而快的字节码处理框架ASM，来转换字节码并生成新的类。不鼓励直接使用ASM，因为它需要你对JVM内部结构包括class文件的格式和指令集都很熟悉。

cglib与动态代理最大的区别就是：
- 使用动态代理的对象必须实现一个或多个接口，即动态代理只能代理接口。
- 使用cglib代理的对象则无需实现接口，达到代理类无侵入。

### 5.总结
1. 静态代理实现较简单，只要代理对象对目标对象进行包装，即可实现增强功能，但静态代理只能为一个目标对象服务，如果目标对象过多，则会产生很多代理类。
2. JDK动态代理需要目标对象实现业务接口，代理类只需实现InvocationHandler接口。
3. 动态代理生成的类为 lass com.sun.proxy.\$Proxy4，cglib代理生成的类为class com.cglib.UserDao\$\$EnhancerByCGLIB\$\$552188b6。
4. 静态代理在编译时产生class字节码文件，可以直接使用，效率高。
5. 动态代理必须实现InvocationHandler接口，通过反射代理方法，比较消耗系统性能，但可以减少代理类的数量，使用更灵活。
6. cglib代理无需实现接口，通过生成类字节码实现代理，比反射稍快，不存在性能问题，但**cglib会继承目标对象，需要重写方法，所以目标对象不能为final类。**

### 6.参考文档
[Java三种代理模式：静态代理、动态代理和cglib代理](https://segmentfault.com/a/1190000011291179)