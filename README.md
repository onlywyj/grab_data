#### Grab_Data 数据抓取

| 名称                          | 功能                           |
| ----------------------------- | ------------------------------ |
| BaiduMapRE.java               | 百度地图正/逆向地址解码        |
| HttpClientUtil.java           | HttpsClient封装常用的请求      |
| MyBatisPlusAutoGenerator.java | MyBatis_Plus代码自动生成工具类 |
| ExportExcelUtils.java         | 导出Excel工具类                |
| application.yml               | MyBatis_Plus多数据配置         |
|                               |                                |
|                               |                                |



##### 项目目录结构
```
├─java
│  ├─com
│  │  └─mybatisplus
│  │      ├─baidumap
│  │      │  ├─controller
│  │      │  │      AddressController.java
│  │      │  │      
│  │      │  ├─entity
│  │      │  │      Address.java
│  │      │  │      
│  │      │  ├─mapper
│  │      │  │      AddressMapper.java
│  │      │  │      
│  │      │  └─service
│  │      │      │  IAddressService.java
│  │      │      │  
│  │      │      └─impl
│  │      │              AddressServiceImpl.java
│  │      │              
│  │      ├─excel
│  │      │      ExcelData.java
│  │      │      
│  │      └─xsbb531
│  │          ├─controller
│  │          │      Hcdb_resultController.java
│  │          │      Wl_531Controller.java
│  │          │      Xsbb_531Controller.java
│  │          │      Xslxbb_cgController.java
│  │          │      YF_531Controller.java
│  │          │      
│  │          ├─entity
│  │          │      Hcdb_result.java
│  │          │      Wl_531.java
│  │          │      Xsbb_531.java
│  │          │      Xslxbb_cg.java
│  │          │      YF_531.java
│  │          │      
│  │          ├─mapper
│  │          │      Hcdb_resultMapper.java
│  │          │      Wl_531Mapper.java
│  │          │      Xsbb_531Mapper.java
│  │          │      Xslxbb_cgMapper.java
│  │          │      YF_531Mapper.java
│  │          │      
│  │          └─service
│  │              │  IHcdb_resultService.java
│  │              │  IWl_531Service.java
│  │              │  IXsbb_531Service.java
│  │              │  IXslxbb_cgService.java
│  │              │  IYF_531Service.java
│  │              │  
│  │              └─impl
│  │                      Hcdb_resultServiceImpl.java
│  │                      Wl_531ServiceImpl.java
│  │                      Xsbb_531ServiceImpl.java
│  │                      Xslxbb_cgServiceImpl.java
│  │                      YF_531ServiceImpl.java
│  │                      
│  └─wyj
│      └─grab_data
│          │  GrabDataApplication.java
│          │  
│          ├─baidumap
│          │      BaiduMapRE.java
│          │      
│          ├─config
│          │      DataSourceConfig.java
│          │      
│          ├─utils
│          │      ExportExcelUtils.java
│          │      HttpClientUtil.java
│          │      MyBatisPlusAutoGenerator.java
│          │      
│          └─yf_531
│                  DataOperate531.java
│                  
└─resources
    │  application.yml
    │  
    ├─mapper
    │  ├─baidumap
    │  │      AddressMapper.xml
    │  │      
    │  └─xsbb531
    │          Hcdb_resultMapper.xml
    │          Wl_531Mapper.xml
    │          Xsbb_531Mapper.xml
    │          Xslxbb_cgMapper.xml
    │          YF_531Mapper.xml
    │          
    ├─static
    └─templates

```