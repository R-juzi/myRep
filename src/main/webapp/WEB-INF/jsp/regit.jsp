<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>注册</title>
    <base href="/"/>
    <link rel="stylesheet" href="layui/css/layui.css">
</head>
<script type="text/javascript" src="layui/layui.all.js"></script>
<script type="text/javascript" src="js/jquery-3.4.1.js"></script>
<script>
    $(function () {
        /*  layui.use(['layer'],function () {
              let layer=layui.layer;
              $("#regit").submit();
          })*/
        $("#btn").on("click", function () {
            let name = $("#name").val(), password = $("#password").val();
            $.post("user/regit", {name: name, password: password}, function (r) {
                console.log(r)
                if (r.code == "200") {
                    location.href = "index";
                }
            });
        })
    })
</script>
<body style="background-image: url('images/indexbackplus.jpg')">
<div id="body">
    <div id="loginDiv" style="left:650px;top: 400px;position: absolute;text-align: center">
        <form action="user/regit" method="post" class="layui-form" id="regit">
            <div class="layui-form-item">
                <label class="layui-form-label">用户名：</label>
                <div class="layui-input-block" style="width: 280px">
                    <input type="text" name="name" required lay-verify="required" placeholder="请输入用户名称"
                           autocomplete="off" class="layui-input" id="name">
                </div>
            </div>
            <div class="layui-form-item">
                <label class="layui-form-label">密码：</label>
                <div class="layui-input-inline" style="width: 280px">
                    <input type="password" name="password" required lay-verify="required" placeholder="请输入密码"
                           autocomplete="off" class="layui-input" id="password">
                </div>
                <div class="layui-form-mid layui-word-aux">数据校验区</div>
            </div>
            <div class="layui-form-item" style="text-align: center">
                <button type="button" class="layui-btn" id="btn">注册</button>
            </div>
        </form>
    </div>
</div>

</body>
</html>
