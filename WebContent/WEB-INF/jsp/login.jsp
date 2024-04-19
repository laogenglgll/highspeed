<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head lang="en">
    <meta charset="UTF-8">
    <title></title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/login.css">
    <script src="${pageContext.request.contextPath}/js/jquery.js"></script>
    <script >
    /* $(function(){
    	$("#login-btn").click(function(){
    		var name = $("#name").val();
    		var password = $("#password").val();
    		$get("${pageContext.request.contextPath}/userlogin.action?name="+name+"&pwd="+password)
    	})
    }) */
    function signin(){
    	$("form").submit(); 
     }
    </script>
</head>
<body>
    <!--登陆主体开始-->
    <div id="main">
        <!-- 头像区开始-->
        <div id="header-border">
            <!-- 头像区内部开始-->
            <div id="header-pic">

            </div>
            <!-- 头像区内部结束-->
        </div>
        <!-- 头像区结束-->
        <!-- 账号密码区开始-->
        <div id="account">
            <form action="slogin.action">
                <div class="input">
                    <input type="text" id="name" name="username" placeholder="please input username"/>
                </div>
                <div class="input">
                    <input type="password" id="password" name="password" placeholder="please input password"/>
                </div>
            </form>
        </div>
       
        <button id="login-btn" onclick="signin()">Sign In</button>
        
        <div id="footer">
            <a href="#">Forget Password?</a>
        </div>
        <!-- 登陆区底部结束-->
    </div>
    <!--登陆主体结束-->
    
    <!--引入jquery-->
    <script src="${pageContext.request.contextPath}/js/jquery.js"></script>
    <!-- 引入全局公共js文件 -->
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/global.js"></script>
    <!-- 引入layer弹出层js功能 -->
    <script type="text/javascript" src="${pageContext.request.contextPath}"+ "/js/layer/layer.js"></script>

</body>
</html>