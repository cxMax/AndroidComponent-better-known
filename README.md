# AndroidComponent-better-known
learn android component

# reference :
* 系列文章1: 
  * Android彻底组件化方案实践 : https://www.jianshu.com/p/1b1d77f58e84
  * Android彻底组件化demo发布 ： https://www.jianshu.com/p/59822a7b2fad
  * Android彻底组件化—代码和资源隔离 : https://www.jianshu.com/p/c7459b59dcd5
* 使用DDComponentForAndroid ：
  * DDComponentForAndroid分析(1)　：　https://www.jianshu.com/p/5746e50ed572
* XModulable : 
  * 基于组件化/模块化的重构探索实践 : https://www.jianshu.com/p/8cb02606d528


# project : 
* DDComponentForAndroid : https://github.com/luojilab/DDComponentForAndroid
* CC : https://github.com/luckybilly/CC
* JIMU : https://github.com/mqzhangw/JIMU
* ARouter : https://github.com/alibaba/ARouter
* XModulable : https://github.com/xpleemoon/XModulable
* ModularizationArchitecture : https://github.com/SpinyTech/ModularizationArchitecture
* Router : https://github.com/JumeiRdGroup/Router
* ActivityRouter : https://github.com/mzule/ActivityRouter
* AndroidComponent ： https://github.com/wustor/AndroidComponent
  * 这个有问题， 全是通过反射去找独立module的类


# 组件化和插件化的区别 ： 
* 相同点 ： 将一整个项目，分而治之，降低耦合
* 不同点 ： 
  * 组件化 ： 编译期
  * 插件化 ： 编译期，运行期

# 组件化要点 ： 
* 代码解耦
* 组件单独运行
* 数据传递
* UI跳转
* 组件的生命周期
* 集成调试
* 代码隔离
