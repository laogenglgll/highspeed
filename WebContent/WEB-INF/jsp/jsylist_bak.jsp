<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<!--设置浏览器的布局视口，只在移动端浏览器起作用-->
	<meta name="viewport" content="width=width-device,initial-scale=1,user-scalable=no" />
	<!--引入bootstrap的核心css-->
	<link rel="stylesheet" href="${pageContext.request.contextPath}/js/bootstrap/css/bootstrap.css" />
	<title>驾驶员列表</title>
	<!--判断如果是IE9以下，引入兼容h5标签的js文件，注意空格的位置-->		
	<!--[if lt IE 9]>
	
	<script src="js/bootstrap/js/respond.min.js"></script>
	<script src="js/bootstrap/js/html5shiv.min.js"></script>		
	<![end if] -->

	<style type="text/css">
		.pagination {
			margin: 0!important;
		}
	</style>
</head>
<body>	
${page}
	<div class="container">
		
		<ol class="breadcrumb">
			<li>驾驶员管理</li>
		</ol>

		<h2 class="page-header">驾驶员列表</h2>
		<form action="">
			<div class="row">
					<div class="col-sm-5">
						<input type="text" placeholder="请输入驾驶证号" class="form-control"/>
						
					</div>	
					<div class="col-sm-5">
					    <input type="text" placeholder="请输入电话"  class="form-control"/>	
					</div>	
					<div class="col-sm-2">
					    <input type="button"  value="搜索" class="btn btn-success"/>
				    </div>			
			</div>
		</form>
        <div class="row">
			<div class="col-sm-offset-8 col-sm-4">
				<a href="AddJsy.html" class="btn btn-success btn-block">增加驾驶员</a>
			</div>
		</div>
		<table class="table table-bordered table-striped" id="dataTable">
			<thead>
				<tr>
					<th>驾驶证号</th>
					<th>姓名</th>
					<th>身份证</th>
					<th>性别</th>
					<th>总分</th>
					<th>手机号</th>
					<th>余额</th>
					<th>操作</th>
				</tr>
			</thead>
			<tbody>	
			
			</tbody>
		</table>
	<!--引入jquery-->
	<script src="${pageContext.request.contextPath}/js/jquery.js"></script>
	<!-- 引入全局公共js文件 -->
	<script type="text/javascript" src="${pageContext.request.contextPath}/js/global.js"></script>
	<!--引入bootstrap的js功能-->
	<script src="${pageContext.request.contextPath}/js/bootstrap/js/bootstrap.js"></script>
	<!-- 引入layer弹出层js功能 -->
	<script type="text/javascript" src="${pageContext.request.contextPath}/js/layer/layer.js"></script>
  
</body>
</html>