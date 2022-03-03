# Eureka Netflix 源码阅读

> 本项目基于 Netflix Eureka 1.10.0 版本源码进行阅读.
>
> [源码地址](https://github.com/Netflix/eureka/tree/v1.10.10)

Spring Cloud Eureka 是针对 Eureka 做的适配封装.

## 模块分析

（1）eureka-client：这个就是指的eureka的客户端，注册到eureka上面去的一个服务，就是一个eureka client，无论是你要注册，还是要发现别的服务，无论是服务提供者还是服务消费者，都是一个eureka客户端。

（2）eureka-core：这个就是指的eureka的服务端，其实就是eureka的注册中心

（3）eureka-resources：这个是基于jsp开发的eureka控制台，web页面，上面你可以看到各种注册服务

（4）eureka-server：这是把eureka-client、eureka-core、eureka-resources打包成了一个war包，也就是说eureka-server自己本身也是一个eureka-client，同时也是注册中心，同时也提供eureka控制台。真正的使用的注册中心

（5）eureka-examples：eureka使用的例子

（6）eureka-test-utils：eureka的单元测试工具类

## Eureka Server

1. 引用说明: [build.gradle](./eureka-server/build.gradle)

> 实际上是一个 web 应用

最主要的就是 [web.xml](./eureka-server/src/main/webapp/WEB-INF/web.xml)

listener: EurekaBootStrap

在 web 应用启动的时候, 就会执行. 主要负责对这个 web 应用的初始化. 例如: 启动线程, 加载配置
