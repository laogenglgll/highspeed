<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta charset="UTF-8">
	<!--设置浏览器的布局视口，只在移动端浏览器起作用-->
	<meta name="viewport" content="width=width-device,initial-scale=1,user-scalable=no" />
	<!--引入bootstrap的核心css-->
	<link rel="stylesheet" href="${pageContext.request.contextPath}/js/bootstrap/css/bootstrap.css" />
	<title>修改密码</title>
	<!--判断如果是IE9以下，引入兼容h5标签的js文件，注意空格的位置-->		
	<!--[if lt IE 9]>
	
	<script src="js/bootstrap/js/respond.min.js"></script>
	<script src="js/bootstrap/js/html5shiv.min.js"></script>		
	<![end if] -->
</head>
<body>	
	<div class="container">
		
		<ol class="breadcrumb">
			<li><a href="#">人力资源管理系统</a></li>
			<li><a href="#">密码管理</a></li>			
			<li>修改密码</li>
		</ol>

		<h2 class="page-header">修改密码</h2>
		<form id="form1" class="form-horizontal" action="updateuser.action">
			<div class="form-group">
				<label for="" class="col-sm-2">旧密码</label>
				<div class="col-sm-10">
					<input type="hidden" name="uid" value="${user.uid }">
					<input type="password" onblur="abc()" id="oldPwd" name="oldPwd" placeholder="请输入原始密码" class="form-control"/>
					<span id="span"></span>
				</div>					
			</div>	
			<div class="form-group">
				<label for="" class="col-sm-2">新密码</label>
				<div class="col-sm-10">
					<input type="password" id="empPwd" name="empPwd" placeholder="请输入新密码" class="form-control"/>
				</div>					
			</div>
			<div class="form-group">
				<label for="" class="col-sm-2">确认密码</label>
				<div class="col-sm-10">
					<input type="password" id="empPwd2" onblur="abcd()" name="newPassWord" placeholder="请再次输入新密码" class="form-control"/>
				</div>					
			</div>
			<div class="form-group">					
				<div class="col-sm-10 col-sm-offset-2">
					<input type="submit"  value="立即修改" class="btn btn-success" id="updateBtn"/>
					<input type="button"  value="取消" class="btn btn-danger" onclick="history.back();"/>
				</div>
			</div>		
		</form>
	</div>
	
	<!--引入jquery-->
	<script src="${pageContext.request.contextPath}/js/jquery.js"></script>
	<!-- 引入全局公共js文件 -->
	<script type="text/javascript" src="${pageContext.request.contextPath}/js/global.js"></script>
	<!--引入bootstrap的js功能-->
	<script src="${pageContext.request.contextPath}/js/bootstrap/js/bootstrap.js"></script>
	<!-- 引入layer弹出层js功能 -->
	<script type="text/javascript" src="${pageContext.request.contextPath}/js/layer/layer.js"></script>
	<script type="text/javascript">
	
		function abc(){
			var pwd = ${user.pwd};
			var npwd = $("#oldPwd").val();
			if(pwd != npwd){
				$("#span").html("原始密码不正确");
			}else{
				$("#span").html("原始密码正确");
			}
		}
		
		
		
	</script>
</body>
</html>