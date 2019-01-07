Power-LoadBalance
====
[![License](https://img.shields.io/badge/License-Apache%202.0-blue.svg)](https://github.com/cyfonly/FLogger/blob/master/LICENSE)  [![Built with Maven](http://maven.apache.org/images/logos/maven-feather.png)](http://search.maven.org/#search%7Cga%7C1%7Ccyfonly)  

## License
	基于 Apache License 2.0 发布。有关详细信息，请参阅 [LICENSE](https://github.com/yixiangli/Powerful/blob/master/LICENSE)。

## Instruction
	该模块为Powerful－负载均衡策略组件

## Credits
> developer 
>>	+ liyixiang

## Features
### 功能列表


### Install

```
<dependency>
  <groupId>com.lyx.ag</groupId>
  <artifactId>Power-LoadBalance</artifactId>
  <version>1.0</version>
</dependency>
```

## NEWS
----

### requirement
createTime | content | state  
--- | --- | ---
2017-5-3 | 实现Hash策略 | 待完成
2017-5-3 | 实现加权随机策略 | 待完成
2017-5-3 | 实现加权轮询策略 | 待完成

### optimization
createTime | content | state
--- | --- | ---
2017-5-3 | 工厂创建均衡策略部分存在多实例，导致策略类无法单例化 | 待优化

### History

upgradeTime | content | remarks
--- | --- | ---
2017-5-3 | 基础框架完成，通过策略工厂筛选均衡策略 | 1.0版本完成，

## Manifest
	|- doc
	|  |- 
	|- src
	|  |- main
	|     |- java
	|        |- com
	|          |- lyx
	|             |- ag
	|                |- 
	|- .gitignore
	|- LICENSE
	|- README.md
	|- pom.xml

FAQ
---
