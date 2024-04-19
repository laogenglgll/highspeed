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
	<title>出站管理</title>
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
			<li>出站管理</li>
		</ol>

		<h2 class="page-header">出站</h2>
        	<form name="form1" class="form-horizontal" method="post" 
		      action="${pageContext.request.contextPath}/fee/out.action" 
		      onSubmit="return valid();">
		    <div class="form-group">
				<label for="" class="col-sm-2">车牌号<span style="color:red">*</span></label>
				<div class="col-sm-10">
					<input type="text" 
					   name="zid" class="form-control" value="${cno}" onblur="jiaoyanzid()" readonly/>
				</div>
								
			</div>	
			<div class="form-group">
				<label for="" class="col-sm-2">进站点<span style="color:red">*</span></label>
				<div class="col-sm-10">
					<input type="text" id="zname" 
					 name="zname" value="${sname }" class="form-control" readonly/>
					
				</div>	
								
			</div>	
			<div class="form-group">
				<label for="" class="col-sm-2">出站点<span style="color:red">*</span></label>
				<div class="col-sm-10">
					<select name="dept.deptId" id="outId" onchange="fee1()" class="form-control">
							<option value="0">---请选着出站点---</option>
							<c:forEach items="${outlist }" var="o">
								<option value="${o.sid }">${o.sname }</option>
							</c:forEach>				
					</select>
				</div>	
								
			</div>
			<div class="form-group">
				<label for="" class="col-sm-2">收费金额<span style="color:red">*</span></label>
				<div class="col-sm-10">
					<input type="text" id="fee" name="zname" placeholder="请输入站点名称" class="form-control"/>
				</div>	
				</div>	
							
			
			<div class="form-group">
				<label for="" class="col-sm-2">驾驶员的余额<span style="color:red">*</span></label>
				<div class="col-sm-10">
					<input type="text" id="zname" name="zname"  value="${price }" class="form-control" readonly/>
					<span id="msg1"></span>
				</div>	
			</div>	
								
			
			
		
			<div class="form-group">					
				<div class="col-sm-10 col-sm-offset-2">
					<input type="submit"  value="出站" class="btn btn-success"/>
					<input type="button"  value="充值" class="btn btn-success"/>
					<input type="button"  value="取消" class="btn btn-danger" onclick="history.back();"/>
				</div>
			</div>	
			
			出站点： 只能是除了入站点以外的其他站点 <br>	
			出站点改变时： 重新计算收费金额<br>	
			当收费金额>驾驶员的余额， 不可以出站<br>	
			<hr>
			涉及到的表操作： 1. 修改收费记录表， 更新 出站点， 收费，状态  <br>
			                2. 修改驾驶员的余额。<br>
			                3. 资金记录表moneyrecord中，增加一条资金记录<br>
		</form>
	
	<!--引入jquery-->
	<script src="${pageContext.request.contextPath}/js/jquery.js"></script>
	<!-- 引入全局公共js文件 -->
	<script type="text/javascript" src="${pageContext.request.contextPath}/js/global.js"></script>
	<!--引入bootstrap的js功能-->
	<script src="${pageContext.request.contextPath}/js/bootstrap/js/bootstrap.js"></script>
	<!-- 引入layer弹出层js功能 -->
	<script type="text/javascript" src="${pageContext.request.contextPath}/js/layer/layer.js"></script>
	<script>
	
/* 	      function del(){
			  var result = confirm("确认删除吗");
			  if(result){
				  alert("删除成功");
			  }else{
				  
			  }
		  } */
	      
	      function fee1(){
	    	  var bid = ${inid};
	    	  var eid = $("#outId").val();
	    	  $.get("${pageContext.request.contextPath}/fee/fee1.action?beginid="+bid+"&endid="+eid,
	    			  function(response){
	    		  $("#fee").val(response.fee);
	    	  })
	      }
		  
		  function valid(){
			  var money = ${price};
			  if( money < $("#fee").val()){
				  $("#msg1").html("余额不足");
				  return false;
			  }
			  return true;
		  }
	</script>
</body>
</html>