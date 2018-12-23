# dubbo
#### common-service 基本的配置
#### user-service-provider 服务提供者（普通maven实现）
#### order-service-customer 服务消费者（普通maven实现）
#### boot-user-service-provider 服务提供者（Spring Boot实现）
#### boot-order-service-customer 服务消费者（Spring Boot实现）

### 安装zookeeper
   - 解压 zookeeper-3.4.11.tar.gz 包
   - 修改 conf/zoo_sample.cfg 为zoo.cf ,
   - dataDir 属性默认是linux路径，修改为本机路径 dataDir=../data; **如果不修改此属性，zkCli.cmd 命令启动错误**
   - windows 系统下 cmd 执行 zkServer.cmd ，启动成功 ： - binding to port 0.0.0.0/0.0.0.0:2181 ，端口为 2181
   - 执行 zkCli.cmd 命令，ls / 查看zookeeper节点;create /mqf 123456 创建节点;get /mqf 查看节点
   
### Dubbo 环境管理控制台
   -  dubbo-admin 项目使用 mvn clean package 打包
   - 注意： \src\main\resources\application.properties 文件 **server.port** 与 **dubbo.registry.address** 属性
   - 执行 java -jar dubbo-admin-0.0.1-SNAPSHOT.jar 命令启动，默认地址是：localhost:7001
   
### Dubbo monitor 监控中心
   - dubbo-monitor-simple 项目使用 mvn clean package 打包
   - target 文件夹解压 dubbo-monitor-simple-2.0.0-assembly.tar.gz 到当前文件夹
   - 使用 dubbo-monitor-simple-2.0.0\assembly.bin\start.bat 启动监控中心
   - 默认访问地址是 localhost:8080
### SpringBoot 与dubbo 整合的三种方式
    1）导入 dubbo-starter，在 application.properties 配置属性，
        使用 @Service【暴露服务】（provider方）和  @Reference【引用】（customer方）@EnableDubbo 开启基于注解的dubbo功能
    2）保留 dubbo xml 配置文件, 不使用  @Service
    3）使用注解 API 方式 
      http://dubbo.apache.org/zh-cn/docs/user/configuration/annotation.html
