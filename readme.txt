Spring Cloud
   17个子项目
   1.四组件
     A. Spring Cloud Config 配置中心
        Clients---->Config Service ----> Local Git Repository---->Remote Git Repository
     B. Spring Cloud Netflix 服务发现
                     Eureka Service
             | Get Registry           |Register/Renew/Cancel
        Service------Remote Call-------Service Provider
     C. Spring cloud Hystrix 熔断器

     D. Spring Cloud Zuul 服务网关
     主要提供和的模块：服务发现（Eureka），断路器（Hystrix）--资源隔离和自我修复，智能路由（Zuul），客户端负载均衡（Ribbon）等

   2.Spring Cloud && Dubbo
     A.背景
       Dubbo，是阿里巴巴服务化治理的核心框架
       Spring Source产物，还有Pivotal和Netfix是其强大的后盾与技术输出，核心：Netflix开源的整套微服务架构套件

     B.社区活跃度
       Spring Cloud毋庸置疑的优于Dubbo，这对于没有大量精力与财力维护这部分开源内容的团队来说，Spring Cloud会是更优的选择

     C.架构完整度
       核心组件：Dubbo只是类似Netflix的一个子集，自身不提供，需要另外整合以实现对应的功能
       分布式配置：淘宝的diamond、百度的disconf，Spring Cloud Config 配置中心
       服务跟踪：可以使用京东开源的Hydra
       批量任务：可以使用当当开源的Elastic-Job

     D.RPC vs REST
       RPC来实现服务间调用的痛点：
         服务提供方与调用方接口依赖方式太强：严格的管理版本依赖,服务方与调用方的不一致，一对多服务的install
         没有严格的版本管理制度或开发一些自动化工具:
       REST接口相比RPC更为轻量化,不存在代码级别的强依赖,痛点:
          接口定义过轻，很容易导致定义文档与实际实现不一致导致服务集成时的问题
          解决：每个服务整合swagger，每个服务的代码与文档一体化
          在分布式环境下，REST方式的服务依赖要比RPC方式的依赖更为灵活
       服务对平台敏感，难以简单复用
          提供对外服务时，都会以REST的方式
          Dubbo中我们要提供REST接口时，不得不实现一层代理，用来将RPC接口转换成REST接口，当当网在dubbox中增加了对REST支持

     E.文档质量
       文档质量，由于Spring Cloud的迭代很快，难免会出现不一致的情况，所以在质量上我认为Dubbo更好一些。
       而对于文档语言上，Dubbo自然对国内开发团队来说更有优势
   3.总结：
     使用Dubbo构建的微服务架构是第三方组件的整合，各环节我们的选择自由度很高，一个有问题就都有问题
     Spring Cloud就像品牌机，在Spring Source的整合下，做了大量的兼容性测试，保证了机器拥有更高的稳定性

   4.参考：
     Martin Fowler https://martinfowler.com/articles/microservices.html