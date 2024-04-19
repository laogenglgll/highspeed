<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<!--设置浏览器的布局视口，只在移动端浏览器起作用-->
	<meta name="viewport" content="width=width-device,initial-scale=1,user-scalable=no" />
	<!--引入bootstrap的核心css-->
	<link rel="stylesheet" href="js/bootstrap/css/bootstrap.css" />
	<title>修改头像</title>
	<!--判断如果是IE9以下，引入兼容h5标签的js文件，注意空格的位置-->		
	<!--[if lt IE 9]>
	
	<script src="js/bootstrap/js/respond.min.js"></script>
	<script src="js/bootstrap/js/html5shiv.min.js"></script>		
	<![end if] -->
</head>
<body>	
	<div class="container">
		
		<ol class="breadcrumb">
			<li><a href="#">密码管理</a></li>			
			<li>修改个人信息</li>
		</ol>

		<h2 class="page-header">修改个人信息</h2>
		<form id="form1" class="form-horizontal"
		action="${pageContext.request.contextPath }/updatepic.action"
		method="post"
		enctype="multipart/form-data">
			<div class="form-group">
				<label for="" class="col-sm-2">管理员名称</label>
				<div class="col-sm-10">
					<input type="text" id="oldPwd" name="oldPwd" value="${user.uname }" class="form-control"/>
				</div>					
			</div>	
			<div class="form-group">
				<label for="" class="col-sm-2">头像</label>
				<div class="col-sm-10">
					<input type="hidden" value="${user.uid }" name="uid">
					<input type="file" id="empPwd" name="pic"  class="form-control"/>
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
	<script src="js/jquery.js"></script>
	<!-- 引入全局公共js文件 -->
	<script type="text/javascript" src="js/global.js"></script>
	<!--引入bootstrap的js功能-->
	<script src="js/bootstrap/js/bootstrap.js"></script>
	<!-- 引入layer弹出层js功能 -->
	<script type="text/javascript" src="js/layer/layer.js"></script>

</body>
</html>