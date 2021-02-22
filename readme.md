### idea配置flutter 项目从0到1的构建过程

#### 安装`flutter`插件
#### 下载`flutter` 配置flutter环境变量
#### 配置`android`开发环境
1. 配置Android sdk
   flutter config --android-sdk D:\progremerTools\android(自己的android sdk路径)
2. 配置android 模拟器(如果不用模拟器，直接用真机也是没得问题的)
3. 配置安卓环境变量
4. 配置gradle


出现问题：
1. flutter Exception in thread "main" java.util.zip.ZipException: error in opening zip
解决办法
   因为某些文件没有下载下来，或者版本不一样导致的。删掉用户目录下的 .gradle
