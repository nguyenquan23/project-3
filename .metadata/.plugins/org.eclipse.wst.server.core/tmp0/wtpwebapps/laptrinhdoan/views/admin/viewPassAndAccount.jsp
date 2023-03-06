<%@page import="persistence.Inspect"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/common/taglib.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Trang chủ</title>
<link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<style type="text/css">
.get-in-touch {
  max-width: 800px;
  margin: 50px auto;
  position: relative;
  background-image: url(https://img.lovepik.com/free-png/20211225/lovepik-security-inspectors-png-image_400381051_wh860.png);

}
.get-in-touch .title {
  text-align: center;
  text-transform: uppercase;
  letter-spacing: 3px;
  font-size: 3.2em;
  line-height: 48px;
  padding-bottom: 48px;
     color: #5543ca;
    background: #5543ca;
    background: -moz-linear-gradient(left,#f4524d  0%,#5543ca 100%) !important;
    background: -webkit-linear-gradient(left,#f4524d  0%,#5543ca 100%) !important;
    background: linear-gradient(to right,#f4524d  0%,#5543ca  100%) !important;
    -webkit-background-clip: text !important;
    -webkit-text-fill-color: transparent !important;
}

.contact-form .form-field {
  position: relative;
  margin: 32px 0;
}
.contact-form .input-text {
  display: block;
  width: 100%;
  height: 36px;
  border-width: 0 0 2px 0;
  border-color: #5543ca;
  font-size: 18px;
  line-height: 26px;
  font-weight: 400;
}
.contact-form .input-text:focus {
  outline: none;
}
.contact-form .input-text:focus + .label,
.contact-form .input-text.not-empty + .label {
  -webkit-transform: translateY(-24px);
          transform: translateY(-24px);
}
.contact-form .label {
  position: absolute;
  left: 20px;
  bottom: 11px;
  font-size: 18px;
  line-height: 26px;
  font-weight: 400;
  color: #5543ca;
  cursor: text;
  transition: -webkit-transform .2s ease-in-out;
  transition: transform .2s ease-in-out;
  transition: transform .2s ease-in-out, 
  -webkit-transform .2s ease-in-out;
}
.contact-form .submit-btn {
  display: inline-block;
  background-color: #000;
   background-image: linear-gradient(125deg,#a72879,#064497);
  color: #fff;
  text-transform: uppercase;
  letter-spacing: 2px;
  font-size: 16px;
  padding: 8px 16px;
  border: none;
  width:200px;
  cursor: pointer;
}

</style>
</head>
<body>
 <!--important link source from "https://bootsnipp.com/snippets/A36DP"-->

<!------ Include the above in your HEAD tag ---------->

<section class="get-in-touch">

   <h1 class="title">Chỉnh Sửa Thông Tin Thanh Tra </h1>
   <form class="contact-form row"  action="<c:url value='/admin-change?action=change'/>"  method="get">
   
    
       <div class="form-field col-lg-6 ">
       <label >Tài khoản</label>
         <input id="phone" class="input-text js-input" type="text" required name="username" >
        
      </div>
      <div class="form-field col-lg-12">
      <label >Mật khẩu</label>
         <input id="message" class="input-text js-input" type="text" required name="password" >
      
      </div>
      
      
     
          <input id="company" class="input-text js-input" type="hidden" required name="inspectId" value="<%=request.getParameter("inspectId") %>">
         <input id="company" class="input-text js-input" type="hidden" required name="action" value="change"> 
     
    
      
       <div class="form-field col-lg-6">
         <input class="submit-btn" type="submit" value="register">
      </div>
        <div class="form-field col-lg-6">
         <input class="submit-btn" type="reset" value="reset">
      </div>
      
   </form>
</section>
</body>