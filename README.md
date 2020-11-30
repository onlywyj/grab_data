#### Grab_Data 数据抓取

| 名称                          | 功能                           |
| ----------------------------- | ------------------------------ |
| BaiduMapRE.java               | 百度地图正/逆向地址解码        |
| HttpClientUtil.java           | HttpsClient封装常用的请求      |
| MyBatisPlusAutoGenerator.java | MyBatis_Plus代码自动生成工具类 |
|                               |                                |



##### 项目目录结构

├─ main
│  ├─java
│  │  └─wyj
│  │      └─grab_data
│  │          │  GrabDataApplication.java 
│  │          │  
│  │          ├─BaiduMap		**#** 百度地图正/逆向地址解码
│  │          │      BaiduMapRE.java 	
│  │          │      
│  │          └─utils 	 **# **工具类
│  │                  HttpClientUtil.java  **#** HttpsClient封装常用的请求
│  │                  MyBatisPlusAutoGenerator.java 	**#** MyBatis_Plus代码自动生成工具类
│  │                  
│  └─resources
│      │  application.properties   	**#** 配置文件
│      │  
│      ├─static
│      └─templates
└─test
    └─java
        └─wyj
            └─grab_data
                    GrabDataApplicationTests.java 	 **#** 测试类