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
	<title>增加部门</title>
	<!--判断如果是IE9以下，引入兼容h5标签的js文件，注意空格的位置-->		
	<!--[if lt IE 9]>
	
	<script src="js/bootstrap/js/respond.min.js"></script>
	<script src="js/bootstrap/js/html5shiv.min.js"></script>		
	<![end if] -->
	<!--引入jquery-->
	<script src="${pageContext.request.contextPath}/js/jquery.js"></script>
	
</head>
<body>	
	<div class="container">
		
		<ol class="breadcrumb">
			<li><a href="#">驾驶员管理</a></li>
				<li>增加驾驶员</li>
		</ol>

		<h2 class="page-header">增加驾驶员</h2>
		<form id="form1" class="form-horizontal" method="get" action="${pageContext.request.contextPath}/driver/addjsy1.action">
			<div class="form-group">
				<label for="" class="col-sm-2">驾驶证号</label>
				<div class="col-sm-10">
					<input type="text" id="deptName" name="dno" placeholder="请输入驾驶证号" class="form-control"/>
				</div>					
			</div>	
			<div class="form-group">
				<label for="" class="col-sm-2">姓名</label>
				<div class="col-sm-10">
					<input type="text" id="dname" name="dname" placeholder="请输入姓名" class="form-control"/>
					<span id="span"></span>
				</div>					
			</div>
			<div class="form-group">
				<label for="" class="col-sm-2">身份证</label>
				<div class="col-sm-10">
					<input type="text" id="" name="idcard" placeholder="请输入身份中" class="form-control"/>
				</div>					
			</div>
			<div class="form-group">
				<label for="" class="col-sm-2">性别</label>

				 <div class="radio-list col-sm-10">
				         <label>
				              <input type="radio" value="1" name="sex" data-title="男"/> 男
				         </label>
				         <label>
				              <input type="radio" value="2" name="sex" data-title="女"/> 女
				         </label>
				</div>
			</div>
			<div class="form-group">
				<label for="" class="col-sm-2">手机号</label>
				<div class="col-sm-10">
					<input type="text" id="" name="tel" placeholder="请输入手机号" class="form-control"/>
				</div>					
			</div>
			<div class="form-group">
				<label for="" class="col-sm-2">余额</label>
				<div class="col-sm-10">
					<input type="text" id="" name="money" placeholder="请输入余额" class="form-control"/>
				</div>					
			</div>
			<div class="form-group">
				<label for="" class="col-sm-2">备注</label>
				<div class="col-sm-10">
					<textarea name="backup" id="empInfo" rows="5" placeholder="请输入备注介绍" class="form-control"></textarea>
				</div>					
			</div>
			<div class="form-group">					
				<div class="col-sm-10 col-sm-offset-2">
					<input type="button"  value="增加驾驶员" class="btn btn-success" onclick="addjsy()"/>
					<input type="button"  value="取消" class="btn btn-danger" onclick="history.back();"/>
				</div>
			</div>		
		</form>
	</div>

	<!--引入jquery-->
	<script src="${pageContext.request.contextPath}/js/jquery.js"></script>
	<!--引入bootstrap的js功能-->
	<script src="${pageContext.request.contextPath}/js/bootstrap/js/bootstrap.js"></script>
	<script type="text/javascript">
	
		
		function addjsy(){
			$("#form1").submit();
		}

	</script>
	<script>
	$(function(){
		$("#dname").blur(function(){
			var name = $("#dname").val();
			$.ajax({
				url:"${pageContext.request.contextPath}/driver/validname.action?dname="+name,
			method:"get",
			success:function(response){
				console.log(response.msg);
				console.log(101010101);
				$("#span").html(response.msg);
			}
			})
		});
	})
	
	</script>
</body>
</html>