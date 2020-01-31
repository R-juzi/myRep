
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>登录</title>
</head>

<style>
    #body {
        width: 1920px;
        height: 1080px;
        background-image: url("images/indexbackplus.jpg");
    }
    #loginForm{
        width: 450px;
        height: 300px;
        left:45%;
        top:45%;
        position: absolute;
    }
</style>
<body >
<div id="body">
    <div id="loginForm" >
        <form action="user/login" method="post">
            用户：<input type="text" id="userName" name="name"><br>
            密码：<input type="password" id="userPassword" name="password"><br>
            <input type="submit" name="登录">
        </form>
        <div id="regit">
            <a href="javascript:void(0)">还没有账号？</a>
            <a href="/user/regit">去注册</a>
        </div>
    </div>
</div>

</body>
</html>
