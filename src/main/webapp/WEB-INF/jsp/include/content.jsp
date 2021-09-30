<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>    

  <div>
     <div class="d-flex justify-content-center mt-4">
       <div class="imageBox">
        <img src="https://www.10wallpaper.com/wallpaper/1920x1080/1604/Push_up_Workout-Sports_Poster_Wallpapers_1920x1080.jpg" width="1550" height="700">        
       </div> 
     </div>
     
     <div class="d-flex justify-content-center mt-4">
       <div class="partBox d-flex justify-content-around  mt-4">
          <div class="middleBox">
	           <a href="/product/himssen_upperBody_view" class="middleText text-dark">
	           <img src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQjn9k72FiOHd2vVaxn18bSFySFtYrpERXAkw&usqp=CAU" alt="상체운동 이미지" width="450" height="200">
	           상체 운동</a>	           
          </div>
        
          <div class="middleBox">
	           <a href="/product/himssen_lowerBody_view " class="middleText text-dark" >
	           <img src="https://post-phinf.pstatic.net/MjAxNzEyMjlfMjkg/MDAxNTE0NTM1MTEyMTk4.I2cSI2y_mm5qEEN7r70T8VrKl5QTqo8c4lmnmrNKVGUg.orhlQY0KcaLmlKpbAxEe8cwLwUzo5KeCwqVx8r4GCmkg.PNG/u1.png?type=w1200" alt="하체운동 이미지" width="450" height="200">
	           하체 운동</a>
          </div>
        
       	  <div class="middleBox">
	            <a href="/product/himssen_abdominal_view" class="middleText text-dark">
	            <img src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTIEXMsIMa5sRJaNm8dloOHQsqLhaS_GZPQ7A&usqp=CAU" alt="상체운동 이미지" width="450" height="200">
	            복부 운동</a>
          </div>    
       </div> 
     </div><br><br>
  </div>   
     <hr>
     <br><br>
     
     <div>
	       <div class="d-flex justify-content-center">
	        
				<div>
				  <div class="bottom-imageBox d-flex justify-content-between">
					<div class="detail1">
					 <c:forEach var="item" items="${productList}">
					   ${item.productName}
					 </c:forEach>
						<a href="/product/detail_view" class="text-blue">
						<img src="https://image.g9.co.kr/g/2173112733/n?ts=1627629743000" alt="" width="450px" height="450px">
					   	<div class="font-weight-bold mt-4"><h4>딥스바 푸쉬업바 가정용 헬스기구</h4></div></a><br>
						<div class="text-danger"><h4>75,300원</h4></div>
					    
					</div>

					<div class="detail2">
						<a href="" class="text-blue">
						<img src="https://thumbnail10.coupangcdn.com/thumbnails/remote/492x492ex/image/vendor_inventory/e0d0/fb2e4e49164cbc56ca2e783f24b189b6f0c9cf296741e42ad0c0d0801f22.png" alt="" width="450px" height="450px" alt="" width="450px" height="450px">
						<div class="font-weight-bold mt-4"><h4>힙딥밴드 하체근력 운동기구</h4></div></a><br>
						<div class="text-danger"><h4>30,000원</h4></div>
					</div>

					<div class="detail3">
						<a href="" class="text-blue">
						<img src="http://static.fv-cdn.com/caz/1_koharu/thumb/ABS_04.jpg" alt="" width="450px" height="450px" alt="" width="450px" height="450px">
						<div class="font-weight-bold mt-4"><h4>듀얼 바퀴 복근운동기구</h4></div></a><br>
						<div class="text-danger"><h4>18,500원</h4></div>
					</div>
				  </div>
				</div>
				      
	       </div>
       </div>

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



				      

      
  