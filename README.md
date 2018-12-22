# dubbo
### 安装zookeeper
   - 解压 zookeeper-3.4.11.tar.gz 包
   - 修改 conf/zoo_sample.cfg 为zoo.cf ,
   - dataDir 属性默认是linux路径，修改为本机路径 dataDir=../data; **如果不修改此属性，zkCli.cmd 命令启动错误**
   - windows 系统下 cmd 执行 zkServer.cmd ，启动成功 ： - binding to port 0.0.0.0/0.0.0.0:2181 ，端口为 2181
   - 执行 zkCli.cmd 命令，ls / 查看zookeeper节点;create /mqf 123456 创建节点;get /mqf 查看节点
   
#### common-service 基本的配置
#### user-service-provider 服务提供者（普通maven实现）
#### order-service-customer 服务消费者（普通maven实现）
#### boot-user-service-provider 服务提供者（Spring Boot实现）
#### boot-order-service-customer 服务消费者（Spring Boot实现）
