<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
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
	<div class="container">
		
		<ol class="breadcrumb">
			<li>驾驶员管理</li>
		</ol>

		<h2 class="page-header">驾驶员列表</h2>
        <div class="row">
			<div class="col-sm-offset-8 col-sm-4">
				<a href="${pageContext.request.contextPath}/driver/addjsy.action" class="btn btn-success btn-block">增加驾驶员</a>
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
				<c:forEach items="${pageinfo.list}" var = "b">
					<tr>
						<td>${b. dno}</td>
						<td>${b. dname}</td>
						<td>${b. idcard}</td>
						<td>${b. sex}</td>
						<td>${b. score}</td>
						<td>${b. tel}</td>
						<td>${b. money}</td>
						<td>
							<a href="${pageContext.request.contextPath}/driver/update.action?dno=${b. dno}&dname=${b. dname}&idcard=${b. idcard}&sex=${b. sex}&tel=${b. tel}&money=${b. money}" class="btn btn-primary btn-sm update-btn">修改</a>
							<a href="javascript:del('${b. dno}');" class="btn btn-danger btn-sm del-btn" data-id="6">删除</a>
							<a href="${pageContext.request.contextPath}/driver/chongzhi.action?tel=${b. tel}&dno=${b. dno}&dname=${b. dname}" class="btn btn-danger btn-sm del-btn" data-id="6">充值</a>
								</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		<div>
					一共${pageinfo.total }条记录，当前第${pageinfo.pageNum}页
					<c:if test="${pageinfo.pageNum == 1 }">
						<input type="submit" value="上一页">
					</c:if>
					<c:if test="${pageinfo.pageNum != 1 }">
						<input type="submit" value="上一页" onclick="changepage(-1)">
					</c:if>
					<c:if test="${pageinfo.pageNum == list.pages }">
						<input type="submit" value="下一页">
					</c:if>
					<c:if test="${pageinfo.pageNum != list.pages }">
						<input type="submit" value="下一页" onclick="changepage(1)">
					</c:if>
			</div>
	
	<!--引入jquery-->
	<script src="${pageContext.request.contextPath}/js/jquery.js"></script>
	<!-- 引入全局公共js文件 -->
	<script type="text/javascript" src="${pageContext.request.contextPath}/js/global.js"></script>
	<!--引入bootstrap的js功能-->
	<script src="${pageContext.request.contextPath}/js/bootstrap/js/bootstrap.js"></script>
	<!-- 引入layer弹出层js功能 -->
	<script type="text/javascript" src="${pageContext.request.contextPath}/js/layer/layer.js"></script>
	<script>
	
	      function del(dno){
			  var result = confirm("确认删除吗");
			  if(result){
				  location.href="${pageContext.request.contextPath}/driver/del.action?dno="+dno;
			  }else{
				  
			  }
		  }
	      
	      function changepage(next){
	    	  var num = ${pageinfo.pageNum} + next;
	    	  location.href	="${pageContext.request.contextPath}/driver/Jsylist.action?pageNum="+num;
	      }
	</script>
</body>
</html>
