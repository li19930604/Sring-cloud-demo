info业务服务
====
**2019.5.29** ~~修订信息~~
* 创建config-client服务

~~功能~~
* 可读取本地、git
* 可嵌套用在各个服务模块

~~存在问题~~
* git上无法读取子目录下的配置，导致项目启动失败

**2019.6.11** ~~修订信息~~
* git仅支持单文件读取
* 本地文件遵循相同属性右覆盖左的规则
* 实现动态刷新配置

**2019.6.12** ~~修订信息~~
* 集成feign
* 集成熔断器
* 集成Hystrix-dashboard仪表盘