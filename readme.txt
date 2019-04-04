Service Feign服务消费者的创建过程
    1、添加依赖
        spring-cloud-starter-netflix-eureka-server
        spring-cloud-starter-openfeign
    2、在@SpringbootApplication注解的启动类
        打上注解@EnableDiscoveryClient和@EnableFeignClients
    3、配置application.yml
    4、定义一个接口，通过注解@FeignClient，来指定调用哪个服务
    5、在Web层的controller层，对外暴露一个api接口，通过上面定义的Feign客户端（接口）来消费服务

注：
    1、Feign默认集成了Ribbon
    2、Feign和Eureka结合，实现负载均衡
    3、Feign采用的是基于接口的注解



在Feign中使用断路器Hystrix
    1、在yml配置文件中加上feign.hystrix.enabled=true
    2、写一个断路器的类，需要实现Feign接口，并注入到IOC容器中。
    2、在@FeignClient的接口的注解中加上fallback，指定断路器的类


Hystrix Dashboard (断路器：Hystrix 仪表盘)
    1、添加依赖
        spring-cloud-starter-netflix-hystrix-dashboard
        spring-boot-starter-actuator
    2、在@SpringbootApplication注解的启动类
        打上注解@EnableHystrixDashboard
    3、打开浏览器：访问http://localhost:8764/hystrix