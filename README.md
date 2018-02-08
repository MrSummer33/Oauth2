#Oauth2
基于Oauth2、springSecurity实现单点登录系统



##组建

###认证服务器
负责登录认证、管理token

###资源服务器
受保护的服务器、权限认证

###客户端
资源服务器的使用者、向认证服务器获取token

###资源拥有者
用户

###客户端代理
浏览器


##授权模式－密码模式

###流程
请求：***http://localhost:9090/client/login?username=xiaxi&password=123456&grant_type=password***

返回：

	"access_token": "a0e2eb18-537e-46b5-a575-a098a3b7d489",
    "token_type": "bearer",
    "refresh_token": "9f1660a9-a725-4827-b59a-a4b04abb8577",
    "expires_in": 998131,
    "scope": "openid"

###原理
 客户端将用户名密码转发到认证服务器完成认证过程，并换取token.

##授权模式－授权码模式
todo
##授权模式－简化模式
todo
##授权模式－客户端模式
todo

##如何实现单点登录




