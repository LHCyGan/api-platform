# 众享 接口开放平台

## 项目介绍
一个提供 API 接口供开发者调用的平台。
管理员可以接入并发布接口，统计分析各接口调用情况；用户可以注册登录并开通接口调用权限，然后可以浏览接口及在线调试，还能使用客户端 SDK 轻松在代码中调用接口。

## 业务流程
![image](https://user-images.githubusercontent.com/94662685/230849728-0f8cd19a-14a9-46a6-b738-75be37412032.png)


## 技术选型
### 后端
-   Java Spring Boot
-   MySQL 数据库
-   MyBatis-Plus 及 MyBatis X 自动生成
-   API 签名认证（Http 调用）
-   Spring Boot Starter（SDK 开发）
-   Dubbo 分布式（RPC、Nacos）
-   Swagger + Knife4j 接口文档生成
-   Spring Cloud Gateway 微服务网关
-   Hutool、Apache Common Utils、Gson 等工具库


## 接口首页（以下的是假数据）
![image-20230410165510040](https://user-images.githubusercontent.com/94662685/230869763-96af3fc0-1acc-4210-94a3-a18a20e09ea8.png)

## 接口管理
![image-20230410165232553](https://user-images.githubusercontent.com/94662685/230869878-48303dfa-eec8-4889-90a0-45b8cdc1f5b7.png)

## 接口详情
![image-20230410165410323](https://user-images.githubusercontent.com/94662685/230869976-75c22100-4cfb-465e-904e-01a71451a8d9.png)

## 接口分析
![image-20230410165322628](https://user-images.githubusercontent.com/94662685/230870014-3c59cb80-a77a-40a3-8a3a-e1ece30bd0ca.png)




