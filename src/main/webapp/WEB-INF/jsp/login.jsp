<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>登录</title>
    <base href="/">
    <link rel="stylesheet" href="layui/css/layui.css">
</head>
<script type="text/javascript" src="layui/layui.all.js"></script>
<script type="text/javascript" src="js/jquery-3.4.1.js"></script>
<script>
 $(function () {
     layui.use(['layer', 'form'], function () {
         var layer = layui.layer, form = layui.form;
         $("#btn").on("click",function () {
             $("#loginForm").submit();
          /*   let name=$("#name").val(),password=$("#password").val();
             $.post("user/login",{name:name,password:password},function (r) {
                    location.href="index";
             })*/
         })
     });
 })
</script>
<body style="background-image: url('images/indexbackplus.jpg')">
<div id="body" style="left:500px;top: 400px;position: absolute">
    <div id="loginDiv">
        <form action="user/login" class="layui-form" method="post" id="loginForm">
            <div class="layui-form-item">
                <label class="layui-form-label">用户名：</label>
                <div class="layui-input-block" style="width: 280px">
                    <input type="text" name="name" required lay-verify="required" placeholder="请输入用户名称"
                           autocomplete="off" class="layui-input" id="name" value="${name}">
                </div>
            </div>
            <div class="layui-form-item">
                <label class="layui-form-label">密码：</label>
                <div class="layui-input-inline"style="width: 280px">
                    <input type="password" name="password" required lay-verify="required" placeholder="请输入密码"
                           autocomplete="off" class="layui-input" id="password">
                </div>
                <div class="layui-form-mid layui-word-aux">${message}</div>
            </div>
            <div class="layui-form-item"  style="text-align: center">
                <button type="button" class="layui-btn" id="btn">登录</button>
            </div>
        </form>
        <div id="regit"style="text-align: center">
            <a href="javascript:void(0)">还没有账号？</a>
            <a href="/user/regit">去注册</a>
        </div>
    </div>
</div>

</body>
</html>
