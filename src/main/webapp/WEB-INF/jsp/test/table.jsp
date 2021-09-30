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
           <td>상품 id</td>
           <td>상품이름</td>
           <td>가격</td>
           
         </tr>
       </thead>
       <c:forEach var="item" items="${productList}">
	       <tbody>
	          <tr>
	            <th>${item.productId}</th>
	            <th>${item.productName}</th>
	            <th>${item.price}</th>
	            
	          </tr>
	       </tbody>
       </c:forEach>
    </table>
  </div>
</body>
</html>