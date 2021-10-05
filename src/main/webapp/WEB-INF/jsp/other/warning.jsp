<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.6.0.js" integrity="sha256-H+K7U5CnXl1h5ywQfKtSj8PCmoN9aaq30gDh27Xc0jk=" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>

<link rel="stylesheet" type="text/css" href="/static/css/main_style.css">
</head>
<body>
   <div id="wrap">
       <header>
          <jsp:include page="../include/logo.jsp" />
       </header>
       
       <nav>
          
       </nav>
      <div>
        <div class="d-flex justify-content-center mt-4">
           <div class="warningBox">
            <div class="emptyBox"></div>
         <div class="display-4 mt-4 text-center">로그인 후 사용해주세요</div>      
         <div class="emptyBox"></div>
         <div class="d-flex justify-content-center mt-4">
            
            <div class="backBtn d-flex" >            
             <a href="/user/sign_in_view">
             <button type="button" class="signInBtn form-control mr-4">
             로그인</button></a>
             <div class="empty"></div>
             <a href="/user/sign_up_view">
             <button type="button" class="signUpBtn form-control text-white">회원가입</button></a>
            </div>
           </div>
         </div>  
       </div> 
     </div>
      </div>
   </div>
</body>
</html>