### 设计模式
#### 1.目的
本项目主要为设计模式的学习资源源码。
#### 2.使用
git clone git@github.com:lightClouds917/designMode.git
拉取项目到本地，不同的设计模式单独存储在对应的包下，部分设计模式演示或者验证时，是在其同包名下的测试类中进行。
#### 3.更新进度
##### 单例模式
singleton包下，类中有注释，有以下5种：
- 饿汉式
- 懒汉式
- 加锁双重检查
- 内部静态类
- 枚举
##### 代理模式
proxy包下，类中有注释，有以下3种：
- 静态代理
- jdk动态代理
- cglib动态代理

##### 简单工厂模式
factory包下

##### 建造者模式
builder包下

##### 观察者模式
observer包下

**概述**：
在观察者模式中，往往有一个一对多的关系，一个被观察者和多个观察者（这里的多个也可以是1个），观察者依赖被观察者，
当被观察者发生变化时，观察者会收到被观察者发出的通知，然后自身发生变更等操作。

**适用场景**：
1.一个抽象模型中有2种角色，其中一种依赖另外一种，希望二者低耦合，可复用；
2.一个对象发生变更时，会触发其他一群对象发生会更，这群对象是谁，有多少，不清楚；

**角色**：
1.抽象观察者；
2.具体观察者；
3.被观察者；


##### 迭代器模式
iterator包下

###### 过滤器模式
filter包下

###### 策略模式
strategy包下
一个算法接口，三个实现类，等于是三个策略。

#### 4.关于
欢迎一起完善本项目(提issue或者加微信)，如果有任何疑问，请通过公众号或者添加作者微信交流。

java4all:

![Image text](https://github.com/lightClouds917/designMode/blob/master/src/main/resources/templates/java4all_black.jpg)

IT云清：

![Image text](https://github.com/lightClouds917/designMode/blob/master/src/main/resources/templates/ITyunqing.jpg)
