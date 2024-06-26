<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
	<!--设置浏览器的布局视口，只在移动端浏览器起作用-->
	<meta name="viewport" content="width=width-device,initial-scale=1,user-scalable=no" />
	<!--引入bootstrap的核心css-->
	<link rel="stylesheet" href="${pageContext.request.contextPath}/js/bootstrap/css/bootstrap.css" />
	<title>查询职务列表</title>
	<!--判断如果是IE9以下，引入兼容h5标签的js文件，注意空格的位置-->		
	<!--[if lt IE 9]>
	
	<script src="js/bootstrap/js/respond.min.js"></script>
	<script src="js/bootstrap/js/html5shiv.min.js"></script>		
	<![end if] -->

	<style type="text/css">
		* {
			margin: 0;
			padding: 0;
		}
		
		body {
			background: #333333;
		}

		/*头像区*/
		.touxiang {
			width: 150px;
			height: 150px;
			margin: 20px auto;
			border-radius: 50%;
			border:5px solid #ffffff;
			overflow: hidden;
		}
		
		.touxiang img {
			width: 100%;
			display: block;			
		}
		
		/*左侧导航链接*/
		.nav-left .list-group-item {
			background: transparent;
			border: none;
			border-radius: 0!important;
			line-height: 35px;
			text-align: center;
			color: #eeeeee;
			font-size: 16px;
			letter-spacing: 1px;
			border-bottom: 1px solid #444444;
		}
	</style>

</head>
<body>
	<div class="container-fluid">
		
		<!-- 头像区 -->
		<div class="row touxiang">
			<a href="UploadHead.html" title="点击修改用户头像" target="content">
				<img id="empPic" src="/pic101/${user.uimg }" alt="头像" class="img-responsive">
			</a>						
		</div>	

		<p class="text-center" style="color:#eeeeee">欢迎你，<span id="empLoginName"></span></p>
		
		<!-- 左侧导航链接 -->
		<div class="row nav-left">
			<div class="list-group">
				<a href="${pageContext.request.contextPath}/nav/addstation.action" target="content" class="list-group-item">站点管理</a>
				<a href="${pageContext.request.contextPath}/driver/Jsylist.action" target="content" class="list-group-item">驾驶员管理</a>
				<a href="${pageContext.request.contextPath}/car/list.action" target="content" class="list-group-item">车辆管理</a>
				<a href="${pageContext.request.contextPath}/fee/toin.action" target="content" class="list-group-item">收费管理</a>
				<a href="${pageContext.request.contextPath}/updateuser1.action" target="content" class="list-group-item">修改密码</a>
				<a href="${pageContext.request.contextPath }/uploadhead.action" target="content" class="list-group-item">修改头像</a>
				<a href="fakuanlist.html" target="content" class="list-group-item">违章罚款</a>
				<a href="login.html" target="_top" class="list-group-item">退出登录</a>
			</div>
		</div>
	</div>

	<!--引入jquery-->
	<script src="js/jquery.js"></script>
	<!-- 引入全局公共js文件 -->
	<script type="text/javascript" src="js/global.js"></script>
	<!--引入bootstrap的js功能-->
	<script src="js/bootstrap/js/bootstrap.js"></script>
	<!-- 引入layer弹出层js功能 -->
	<script type="text/javascript" src="js/layer/layer.js"></script>
	<script type="text/javascript">
		$(document).ready(function() {
					
			//显示当前登录用户名
			$.get(baseUrl + '/emp/getLoginName',function(data) {
				
				$('#empLoginName').text(data);

			});


			//显示当前登录用户头像
			$.get(baseUrl + '/emp/queryPic',function(data) {

				if (data && data != 'null') {					
					$('#empPic').attr('src',data);
				} 

			});

		});
	</script>
</body>
</html>