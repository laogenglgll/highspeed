<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<!--设置浏览器的布局视口，只在移动端浏览器起作用-->
	<meta name="viewport" content="width=width-device,initial-scale=1,user-scalable=no" />
	<!--引入bootstrap的核心css-->
	<link rel="stylesheet" href="${pageContext.request.contextPath}/js/bootstrap/css/bootstrap.css" />
	<title>增加部门</title>
	<!--判断如果是IE9以下，引入兼容h5标签的js文件，注意空格的位置-->		
	<!--[if lt IE 9]>
	
	<script src="js/bootstrap/js/respond.min.js"></script>
	<script src="js/bootstrap/js/html5shiv.min.js"></script>		
	<![end if] -->
</head>
<body>	
	<div class="container">
		
		<ol class="breadcrumb">
			<li><a href="#">站点管理</a></li>
				<li>增加新站点</li>
		</ol>

		<h2 class="page-header">增加新站点</h2>
		<form id="form1" class="form-horizontal" method="get" action="${pageContext.request.contextPath }/nav/add.action">
			<div class="form-group">
				<label for="" class="col-sm-2">站点名称</label>
				<div class="col-sm-10">
					<input type="text" name="sname" placeholder="请输入站点名称" 
							class="form-control" id="sname"/>
				</div>
				<div id="msg1" class="col-sm-3"></div>					
			</div>	
			<div class="form-group">
				<label for="" class="col-sm-2">收费金额</label>
				<div class="col-sm-10">
					<input type="text" name="price" placeholder="请输入收费金额" class="form-control"/>
				</div>					
			</div>
<!-- 			<div class="form-group">
				<label for="" class="col-sm-2">站点说明</label>
				<div class="col-sm-10">
					<textarea  rows="5" placeholder="请输入站点说明" class="form-control"></textarea>
				</div>					
			</div> -->
			<div class="form-group">					
				<div class="col-sm-10 col-sm-offset-2">
					<input type="button"  value="增加站点" class="btn btn-success" onclick="add()"/>
					<input type="button"  value="取消" class="btn btn-danger" />
				</div>
			</div>		
		</form>
	</div>

	<!--引入jquery-->
	<script src="${pageContext.request.contextPath}/js/jquery.js"></script>
	<!--引入bootstrap的js功能-->
	<script src="${pageContext.request.contextPath}/js/bootstrap/js/bootstrap.js"></script>
	<script type="text/javascript">
		function add(){
			$("#form1").submit();
		}
		$(function(){
			$("#sname").blur(function(){
				$.get("${pageContext.request.contextPath}/station/validname.action?sname="+$(this).val(),
						function(response){
					$("#msg1").html(response.msg);
				})
			})
		})
		
	</script>
</body>
</html>