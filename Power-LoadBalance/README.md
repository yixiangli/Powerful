Introduction
====

***
Instruction
----

	该模块为Powerful－负载均衡策略组件

***
Install
----

  <groupId>com.lyx.ag</groupId>
  <artifactId>Power-LoadBalance</artifactId>
  <version>1.0</version>

***
Credits
----

> developer 
>>	+ liyixiang


***
NEWS
----

#### requirement
createTime | content | state  
--- | --- | ---
2017-5-3 | 实现Hash策略 | 待完成
2017-5-3 | 实现加权随机策略 | 待完成
2017-5-3 | 实现加权轮询策略 | 待完成

#### optimization
createTime | content | state
--- | --- | ---
2017-5-3 | 工厂创建均衡策略部分存在多实例，导致策略类无法单例化 | 待优化

***
History
----

upgradeTime | content | remarks
--- | --- | ---
2017-5-3 | 基础框架完成，通过策略工厂筛选均衡策略 | 1.0版本完成，

***
FAQ
----
