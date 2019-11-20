# zjumecsim工具设计

## 主要模块
### core
主要串联起各个模块，组装整体的框架流程

### info
全局信息注册模块，感知全局系统状态

### application
对应用进行抽象与管理模块.
应用抽象为一个连续序列：s1 -> s2 -> s3.
s1抽象为执行服务的点：ApplicationServiceNode
s1 -> s2 抽象为服务边：ApplicationServiceEdge

### entity
系统中出现的实体的抽象
### selector
mobile device选择接入服务器处理模块

### generator
mobile device生成请求模块

### transmit
网络传输处理模块

### executor
执行器模块

### scheduler
请求调度管理模块

### logger
日志处理模块

### statistics
统计处理模块

### config
系统中配置处理模块，负责所有的配置的管理

### controller
与前端交互模块

### util
工具类所在模块

### allocation
资源分配模块，分配系统资源，包括CPU、带宽，RAM，DISK。