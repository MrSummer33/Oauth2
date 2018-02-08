
# Oauth2
基于Oauth2、springSecurity实现单点登录系统

## 概述
> 这部分的介绍主要参考[阮一峰的博客](http://www.ruanyifeng.com/blog/2014/05/oauth_2_0.html)

OAuth是一个关于授权（authorization）的开放网络标准，最初是大型互联网平台公司用来支持其用户登录第三方站点, 或者授权第三方站点访问其用户资源. 现在也被设计用来作为单点登录系统.

OAuth 目前的版本为2.0, 详细标准请参考[RFC 6749](http://www.rfcreader.com/#rfc6749)

## 角色

### 认证服务器
负责登录认证、管理token

### 资源服务器
受保护的服务器、权限认证

### 客户端
资源服务器的使用者、向认证服务器获取token

### 资源拥有者
用户

### 客户端代理
浏览器


## 授权模式－密码模式

### 流程
 1. request：***http://localhost:9090/client/login?username=****&password=****&grant_type=password***

 2. response：
  ```
    "access_token": "a0e2eb18-537e-46b5-a575-a098a3b7d489",
    "token_type": "bearer",
    "refresh_token": "9f1660a9-a725-4827-b59a-a4b04abb8577",
    "expires_in": 998131,
    "scope": "openid"
  ```
  
  

### 步骤

 1. 用户向客户端服务器提供用户名密码
 2. 客户端服务器拿着用户名密码发给认证服务器，请求token
 3. 认证服务器确认合法后，返回token
 
## 授权模式－授权码模式
todo
## 授权模式－简化模式
todo
## 授权模式－客户端模式
todo

# 如何实现单点登录




