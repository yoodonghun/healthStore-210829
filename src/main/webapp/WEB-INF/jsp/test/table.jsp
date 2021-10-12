<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
  <div>
    <table class="table">
       <thead>
         <tr>
           <td>작성자</td>          
           <td>가격</td>
           <td>리뷰</td>
           
         </tr>
       </thead>
       
	       <tbody>
	          <tr>
	            
	            <th>${review.writer}</th>
	            <th>${review.grade}</th>
	            <th>${review.review}</th>
	            
	          </tr>
	       </tbody>
       
    </table>
  </div>
</body>
</html>