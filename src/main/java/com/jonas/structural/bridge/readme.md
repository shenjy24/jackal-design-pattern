### 定义
桥接模式将抽象部分与它的实现部分分离，使它们都可以独立地变化。

通俗理解：系统可能有多维度分类，每一种维度都可能变化，那么就把这种多维度分离出来让它们独立变化，减少它们之间的耦合。  
如果采用继承可能会造成大量的类增加，因此采用聚合/组合进行关联，这也是桥接模式的核心。

继承方式：

![继承](https://github.com/shenjy24/document/raw/master/images/design_pattern/bridge1.png)

聚合方式：

![聚合](https://github.com/shenjy24/document/raw/master/images/design_pattern/bridge2.png)

### 结构

![结构图](https://github.com/shenjy24/document/raw/master/images/design_pattern/bridge-structure.png)

- 抽象部分 （Abstraction） 提供高层控制逻辑， 依赖于完成底层实际工作的实现对象。
- 精确抽象 （Refined Abstraction） 提供控制逻辑的变体。 与其父类一样， 它们通过通用实现接口与不同的实现进行交互。
- 实现部分 （Implementation） 为所有具体实现声明通用接口。 抽象部分仅能通过在这里声明的方法与实现对象交互。抽象部分可以列出和实现部分一样的方法， 但是抽象部分通常声明一些复杂行为， 这些行为依赖于多种由实现部分声明的原语操作。
- 具体实现 （Concrete Implementations） 中包括特定于平台的代码。
- 客户端 （Client） 仅关心如何与抽象部分合作。 但是， 客户端需要将抽象对象与一个实现对象连接起来。

示例：

![示例](https://github.com/shenjy24/document/raw/master/images/design_pattern/bridge-example.png)

### 参考资料
[桥接设计模式](https://refactoringguru.cn/design-patterns/bridge)