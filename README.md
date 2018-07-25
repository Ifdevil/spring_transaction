# 事务
事务：逻辑上的一组操作，这组操作要么全部成功，要么全部失败。

## 事务特性（ACID)
事务特性：原子性、一致性、隔离性、持久性

1. 原子性：事务是不可分割的工作单位，事务中的操作要么全部发生，要么全部失败。
2. 一致性：事务前后数据的完整性必须保持一致。
3. 隔离性：多个用户并发访问数据库时，一个用户的事务不能被其他用户的事务干扰，多个并发事务之间数据要相互隔离。（如果不考虑事务隔离性问题，则会引发安全问题：脏读、不可重复读、幻读。数据库事务隔离级别解决）
4. 持久性：一个事务一旦提交，它对数据库中数据的改变就是永久的，即使数据发生故障也不应该对其有任何影响。

## Spring事务管理

Spring事务管理高层抽象主要包括3个接口

- **PlatformTransactionManager:事务管理器**
- **TransactionDefinition:事务定义信息（隔离、传播、超时、只读）**
- **TransactionStatus:事务具体运行状态**

###PlatformTransactionManager事务管理器
Spring为不同的持久化框架提供了不同PlatformTransactionManager接口实现

###TransactionDefinition:事务定义信息
事务隔离级别：
数据库提供的四种隔离级别：

- **READ_UNCOMMITED：出现脏读、不可重复读、幻读**
- **READ_COMMITTED：解决脏读**
- **REPEATABLE_READ：解决脏读、不可重复读**
- **SERIALIZABLE：解决脏读、不可重复读、幻读**
- **DEFAULT(***spring提供数据库默认隔离级别***)**

事务传播行为：七种

- **<label  style="color:red">PROPAGATION_REQUIRED</label>：支持当前事务，如果不存在就新建一个**
- **PROPAGATION_SUPPORTS：支持当前事务，没有不用**
- **PROPAGATION_MANDATORY：支持当前事务，抛异常**
- **<label  style="color:red">PROPAGATION_REQUIRES_NEW</label>：如果有事务，则挂起当前事务，新建一个**
- **PROPAGATION_NOT_SUPPORTED：以非事务方式运行，有事务，则挂起当前事务**
- **PROPAGATION_NEVER：以非事务方式运行，有事务，抛异常**
- **<label  style="color:red">PROPAGATION_NESTED</label>：如果当前事务存在，则嵌套事务运行**

###TransactionStatus:事务具体运行状态
提供获取事务状态的方法

##实现
Spring事务管理API：以上

Spring的编程式事务管理：通过TransactionTemplate手动管理事务

Spring的声明式事务管理：通过XML配置声明式事务
