<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@include file="/common/taglib.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="<c:url value='/template/homepage/style.css' />" rel="stylesheet" type="text/css" media="all"/>
</head>
<body>
	<div class="header">
	<div class="caption"> 
	<h1> trang quản lí vệ sinh an toàn thực phẩm thành phố 
	đà nẵng 
   </h1>
	
	
	
</div>
<div class="nav">
		<div class="subnav">
		 <a class="tag-a" href='<c:url value="/views/login.jsp"/>'>
			login
		</a>
		</div>
		<div class="subnav" >
		 <a class="tag-a" href='<c:url value="/views/login.jsp"/>'>
			dang ki
			</a>
		</div>
		
	</div>
</div>
<form action="<c:url value='/complain'/>" method="post">
<label>nhập thông tin khiếu nại</label>
	
<br>
	<textarea  class = "information" name="complain"></textarea>
	<br>
	<button type="submit">submit</button>
     </form>
</body>
</html>