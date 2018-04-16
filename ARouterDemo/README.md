## reference : 
* 作者演讲概要 : https://yq.aliyun.com/articles/71687?spm=5176.100240.searchblog.7.5qkuq2
* 浅谈Android模块化设计 : https://blog.csdn.net/weijianfeng1990912/article/details/66475978
* Alibaba-ARouter 源码分析笔记 : https://www.jianshu.com/p/16e578a89555

## 原声路由存在的问题 : 
* 显式跳转：类耦合
* 隐式跳转 : 规则集中式管理, 写作困难
* manifest扩展性较差
* 跳转过程无法控制
* 失败无法降级

## 控制反转(ioC) : 
* reference : 
  * 很好理解 : https://www.jianshu.com/p/07af9dbbbc4b?utm_campaign=maleskine&utm_content=note&utm_medium=seo_notes&utm_source=recommendation
* 总结 : 
  * 控制反转 : 是一种在软件工程中解耦合的思想，调用类只依赖接口，而不依赖具体的实现类，减少了耦合
  * 依赖注入 : 是一种设计模式，可以作为控制反转的一种实现方式。依赖注入就是将实例变量传入到一个对象中去

## ARouter 架构 : 
* Compiler : 编译期 APT自动生成代码
* Api : 运行期 接入APP方调用
  * lancher层 : ARouter , 所有供外部调用的api
  * facede层 : 
    * callback
    * service : 拦截器主要是通过service来实现的. 例如 : 跳转判断登录, 对吧?
    * template : 编译时 , 自动生成代码的模板
  * 实现层 : 
    * WareHouse : 运行期间加载的一些配置文件以及映射关系, 
    * LogisticsCenter : 流转以及内部调用
    * Postcard : 跳转过程参数处理, _ARouter就是流转到这个类来处理的
