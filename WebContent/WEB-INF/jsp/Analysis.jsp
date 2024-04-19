<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta charset="UTF-8">
	<!--设置浏览器的布局视口，只在移动端浏览器起作用-->
	<meta name="viewport" content="width=width-device,initial-scale=1,user-scalable=no" />
	<!--引入bootstrap的核心css-->
	<link rel="stylesheet" href="${pageContext.request.contextPath}/js/bootstrap/css/bootstrap.css" />
	<title>查询员工列表</title>
	<!--判断如果是IE9以下，引入兼容h5标签的js文件，注意空格的位置-->		
	<!--[if lt IE 9]>
	
	<script src="js/bootstrap/js/respond.min.js"></script>
	<script src="js/bootstrap/js/html5shiv.min.js"></script>		
	<![end if] -->

	<style type="text/css">
		.pagination {
			margin: 0!important;
		}
	}
	</style>
</head>
<body>
	<div class="container">
		
		<ol class="breadcrumb">
			<li>站点管理</li>
		</ol>

		<h2 class="page-header">站点列表</h2>
        <div class="row">
			<div class="col-sm-offset-8 col-sm-4">
				<a href="AddStation.html" class="btn btn-success btn-block">增加新站点</a>
			</div>
		</div>
		<table class="table table-bordered table-striped" id="dataTable">
			<thead>
				<tr>
					<th>站号</th>
					<th>名称</th>
					<th>收费金额</th>
					<th>操作</th>
				</tr>
			</thead>
			<tbody>
					<c:forEach items="${list.list }" var="sta">	
						<tr>
							<td>${sta.sid}</td>
							<td>${sta.sname}</td>
							<td>${sta.price}</td>
							<td>
								<a href="updateStation.action?sname=${sta.sname}&price=${sta.price}&sid=${sta.sid}" class="btn btn-primary btn-sm update-btn">修改</a>
								<a href="javascript:del(${sta.sid });" class="btn btn-danger btn-sm del-btn" data-id="6">删除</a>
								
							</td>
						</tr>	
					</c:forEach>
			</tbody>
		</table>
			<div>
					一共${list.total }条记录，当前第${list.pageNum}页
					<c:if test="${list.pageNum == 1 }">
						<input type="submit" value="上一页">
					</c:if>
					<c:if test="${list.pageNum != 1 }">
						<input type="submit" value="上一页" onclick="changepage(-1)">
					</c:if>
					<c:if test="${list.pageNum == list.pages }">
						<input type="submit" value="下一页">
					</c:if>
					<c:if test="${list.pageNum != list.pages }">
						<input type="submit" value="下一页" onclick="changepage(1)">
					</c:if>
			</div>
		
	
	<!--引入jquery-->
	<script src="${pageContext.request.contextPath}/js/jquery.js"></script>
	<!-- 引入全局公共js文件 -->
	<script type="text/javascript" src="${pageContext.request.contextPath }/js/global.js"></script>
	<!--引入bootstrap的js功能-->
	<script src="${pageContext.request.contextPath}/js/bootstrap/js/bootstrap.js"></script>
	<!-- 引入layer弹出层js功能 -->
	<script type="text/javascript" src="${pageContext.request.contextPath}/js/layer/layer.js"></script>
	<script>
	
	      function del(sid){
			  var result = confirm("确认删除吗");
			  if(result){
				  location.href="${pageContext.request.contextPath}/station/del.action?sid="+sid;
			  }else{
				  
			  }
		  }
	      
	      function changepage(next){
	    	  var num = ${list.pageNum} + next;
	    	  location.href	="${pageContext.request.contextPath}/station/stationlist.action?pageNum="+num;
	      }
	</script>
</body>
</html>