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
	<link rel="stylesheet" href="${pageContext.request.contextPath }/js/bootstrap/css/bootstrap.css" />
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
	</style>
</head>
<body>	
	<div class="container">
		
		<ol class="breadcrumb">
			<li>进站管理</li>
		</ol>

		<h2 class="page-header">进站车辆列表</h2>
        <div class="row">
        	<form class="form-inline" 	action="${pageContext.request.contextPath }/fee/in.action">
        		<div class="form-group">
        			<label for="">车牌号</label>
        			<select class="form-control" name="cno">					
        				<c:forEach items="${carlist }" var="c">
        					<option value="${c.cno }">${c.cno }</option>
        				</c:forEach>
        				
        			</select>
        		</div>
        		<div class="form-group">
        			<label for="">进站点</label>
        			<select class="form-control" name="beginid">					
        				<c:forEach items="${stationlist }" var="s">
        					<option value="${s.sid }">${s.sname }</option>
        				</c:forEach>
        			</select>
        		</div>	
        		<div class="form-group">
        			<div class="input-group">
        				
                    	<span class="input-group-btn">
                        	<button type="submit" class="btn btn-primary">进站</button>
                        </span>	                	
                    </div>					
        		</div>				
        	</form>
        </div>
		<table class="table table-bordered table-striped" id="dataTable">
			<thead>
				<tr>
					<th>车牌号</th>
				    <th>进站点</th>
					<th>出站点</th>
					<th>收费金额</th>
					<th>状态</th>
					<th>操作</th>
				</tr>
			</thead>
			<tbody>				
				<c:forEach items="${feelist }" var="f">
				<tr>
					 <td>${f.cno }</td>
					 <td>${f.in.sname }</td>
					 <td><c:if test="${f.state == 1 }">${f.out.sname }</c:if>
					 <th><c:if test="${f.state == 1 }">${f.price }</c:if>
					 <td><c:if test="${f.state == 0 }">已进站</c:if>
					 	<c:if test="${f.state == 1 }">已出站</c:if></td>
					 <th><c:if test="${f.state == 0 }">
							<a href="outstation.action?cno=${f.cno }&sname=${f.in.sname }&inid=${f.in.sid}" class="btn btn-primary btn-sm update-btn ">出站</a>					 	
					 	</c:if>
					 	
					 	<c:if test="${f.state == 1 }">
							<a href="outstation.action" class="btn btn-primary btn-sm update-btn ">删除</a>					 	
					 	</c:if>
				</tr>
				</c:forEach>
			</tbody>
		</table>
		
	
	<!--引入jquery-->
	<script src="${pageContext.request.contextPath }/js/jquery.js"></script>
	<!-- 引入全局公共js文件 -->
	<script type="text/javascript" src="${pageContext.request.contextPath }/js/global.js"></script>
	<!--引入bootstrap的js功能-->
	<script src="${pageContext.request.contextPath }/js/bootstrap/js/bootstrap.js"></script>
	<!-- 引入layer弹出层js功能 -->
	<script type="text/javascript" src="${pageContext.request.contextPath }/js/layer/layer.js"></script>
	<script>
	
	      function del(){
			  var result = confirm("确认删除吗");
			  if(result){
				  alert("删除成功");
			  }else{
				  
			  }
		  }
	</script>
</body>
</html>