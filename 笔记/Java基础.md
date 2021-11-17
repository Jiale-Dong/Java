## 1. Java基础

### 定义

- 重载：同名不同参数的函数或者方法；
- 重写：指子类对父类方法的重写；



### 基本数据类型

```java
整数类型：byte(1字节)，short(2)，int(4)，long(8)
浮点数类型：float(4)，double(8)
字符类型：char(2)
布尔类型：boolean:只有true和false两个值,Java语言对布尔类型的存储并没有做规定，因为理论上存储布尔类型只需要1 bit，但是通常JVM内部会把boolean表示为4字节整数。   
```



## 2. Java基础回顾复习

```java
1. 注解
   ‒ JDK5.0后引入的新技术；
   ‒ 注解可以使用在类、包、方法、属性上；
   - 注解的定义，作用域（@Target(ElementType.TYPE)）和作用时间        				                （@Retention(RetentionPolicy.RUNTIME)）
   
2. 反射
   - 反射获取对象     Class c1 = Class.forName("com.Test");
   - 2.1 通过反射对象获取类注解   
       （Annotation[] annotations = c1.getAnnotations();）
       （annotations.for循环获取定义的类注解）
   - 获取类注解值
       （jiale jiale = (jiale)c1.getAnnotation(jiale.class);）
       （System.out.println(jiale.value());）
       
   - 2.2 通过反射对象获取属性注解  
       （Field age = c1.getDeclaredField("age");）
       （jialeField annotation = age.getAnnotation(jialeField.class);）
       （System.out.println(annotation.colName());  // 获取注解属性） 
    
3. 接口
   ‒ interface定义接口，@interface定义注解
   ‒ 子类implements父接口，必须要要重写接口中方法；
    
4. 封装
   - 对私有字段或属性进行封装，通过get()、set()取值或修改值
    
5. 继承
   - 父类被final定义后，子类不能被继承
   - 私有属性和方法不能被继承
6. 多态
   - Persion s1 = new Student(); 子类型转父类型，只能执行父类型有的方法，该方法执行按照子类重写的执      行；如没被重写，则按照父类型方法
   - ((Student)s1).eat(); 父类型转子类型，可以执行子类型的方法
    
7. 集合
   - equals比较两个集合的类型是否一样
   - ==比较两个集合的地址
   - 集合只能存放引用数据类型，col.add(18); // 称为自动装箱
   - Collection接口的遍历方式：迭代器和增强for循环;遍历方式（2种）
   - List接口的增删改查，接口不能创建对象，只能由他的实现类创建，遍历方式（3种）
   - ArrayList实现类的遍历方式（3种）
   - Map由HashMap实现，遍历方式（3种）
   - Map的定义，指定数据类型：Map<String, String> map = new HashMap<>();
   - 链表的插入、删除操作
   - HashSet是一个不允许有重复元素的集合
   - HashMap的定义：HashMap<Integer, String> hashmap = new HashMap<>();
8. 自动装箱和自动拆箱
   - 引用类型可以赋值为null，表示空，基本类型不能赋值为null
    
9. IO
   - 输入流InputStream，程序从输入流读数据，输入流添加缓冲数据；
   - 输出流OutputStream，程序向输出流写数据，close()方法关闭输出流
    
10. 时间类
   - LocalDateTime类
   - LocalDateTime.of     指定时间
   - LocalDateTime.parse     解析字符串
   - DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss")  // 自定义日期格式
   - LocalDateTime对时间和日期进行链式调用   dt.plusDays(6).minusMinutes(11)
   - 调整年月日  dt.withMonth(01).withDayOfMonth(01);
   - 获取当前时间所在年的最后一天
       
11. 多线程
```



## 3. 多线程

### 进程与线程

1. 说起进程，就不得不说下程序。程序是指令和数据的有序集合，其本身没有仼何运的含义，是一个静态的概念。
2. 而进程则是执行程序的一次执行过程，它是一个动态的概念。是系统资源分配的单位
3. 通常在一个进程中可以包含若干个线程，当然一个进程中至少有一个线程，不然没有存在的意义。线程是CPU调度和执行的的单位。
4. 多个线程操作同一个对象，叫做并发

注意：很多多线程是模拟出来的，真正的多线程是指有多个cpu，即多核，如服务器。如果是模拟出来的多线程，即在一个cpu的情况下，在同一个时间点，cpu只能执行一个代码，因为切换的很快，所以就有同时执行的错觉。



### 三种创建方式

1. Thread class    继承Thread类（重点）
2. Runnable接口      实现Runnable接口（重点）
3. Callable接口     实现Callable接口（了解）

### Lamda表达式

- 避免匿名内部类定义过多
- 其实质属于函数式编程的概念

1. 理解函数式接口是学习Java8 lamda表达式的关键
2. 函数式接口的定义：
   - 任何接口，如果只包含一个唯一抽象方法，那么他就是函数式接口；
   - 对于函数式接口，我们可以通过lamda表达式来创建接口对象

- lamda表达式的学习过程

  编写接口-实现类-静态内部类-局部内部类-匿名内部类->lamda表达式

### 线程同步机制

1. 并发：多个线程操作同一对象
2. synchronized 同步方法， 锁的是this
3. 同步块：synchronized(Obj){}

### 死锁

多个线程各自占有一些共享资源，并且互相等待其他线程占有的资源才能运行，而导致两个
或者多个线程都在等待对方释放资源，都停止执行的情形。某一个同步块同时拥有“两个以上
对象的锁”时，就可能会发生“死锁”的问题

产生死锁的四个必要条件：

1. 互斥条件：一个资源每次只能被一个进程使用
2. 请求和保持条件：一个进程因请求资源而阻塞时，对已获得的资源保持不放
3. 不剥夺条件：进程已获得的资源，在未使用完之前，不能强行剥夺
4. 循环等待条件：若干进程之间形成一种头尾相接的循环等待资源关系

synchronized与lock的对比：

1. Lock是显式锁（手动开启和关闭锁，别忘记关闭锁）synchronized是隐式锁，出了作用域自动释放
2. Lock只有代码块锁， synchronized有代码块锁和方法锁
3. 使用Lock锁，JVM将花费较少的时间来调度线程，性能更好

### 线程协作 - 生产者消费这模式

这是一个线程同步问题，生产者和消费者共享同一个资源，并且生产者和消费者之间相互依赖，
互为条件：

1. 对于生产者没有生产品之前要通知消费者等待而生产了产品之后，又需要马上通知消费者消费
2. 对于消费者，在消费之后，要通知生产者已经结束消费，需要生产新的产品以供消费
3. 在生产者消费者问题中，仅有 synchronized是不够的
   - synchronized可阻止并发更新同一个共享资源，实现了同步；
   - synchronized不能用来实现不同线程之间的消息传递（通信）；

方法一：管程法，利用缓冲区解决
方法二：信号灯法



## 4. 常见面试题

```xml
1. 前后端分离本质
   并不是一个技术问题，而是一个工程化考量和项目管理的问题，使项目达到高内聚低耦合的状态。
```







