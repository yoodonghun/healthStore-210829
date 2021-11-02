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

<link rel="stylesheet" type="text/css" href="/static/css/admin_style.css">
</head>
<body>
   <div id="wrap">
      <div class="d-flex">
         <div class="leftBox">
            <div class="text-white text-center mt-4 logo">HIM-SSEN</div>
            <div class="emptyBox"></div>
            <div>
	           <ul class="nav flex-column mt-4 text-center">
	             <li class="nav-item text-weight-bold  mt-4"><a href="/admin/userList_view" class="nav-link text-white">회원목록</a></li>
	             <li class="nav-item text-weight-bold  mt-4"><a href="/admin/sale_view" class="nav-link text-white">판매</a></li>
	             <li class="nav-item text-weight-bold  mt-4"><a href="/admin/saleList_view" class="nav-link text-white">판매목록</a></li>
	             <li class="nav-item text-weight-bold  mt-4"><a href="/admin/adminInfo_view" class="nav-link text-white">관리자정보</a></li>
	           </ul>
            </div>
                        
         </div>
         
         <div>
           <div>
	           <div class="d-flex justify-content-center ml-4 mt-4">
	             <div class="innerBox">
	                <div class="topEmptyBox"></div>
	                <div class="topText ml-4 mb-2">상품 판매</div>
	                <hr>
	                <div class="topEmptyBox"></div>
	                
	                <div>
	                  <div class="d-flex justify-content-center">
	                    <div class="saleBox d-flex">
	                       <img src="" alt="" width= "500px" height="500px">
	                       <div class="centerEmpty"></div>
	                       
	                       <div class="detailBox">
	                         <input type="text" name="productName" class="form-control" placeholder="상품 이름">
	                         
	                         <div class="d-flex mt-4">
	                           <input type="text" name="price" class="form-control mr-4" placeholder="상품 가격">
	                           <div class="mt-2">원</div>
	                         </div>
	                         
	                         <div class="d-flex mt-4">
	                           <div class="deleveryPrice  mr-4">배송비</div>
	                           <div class="ml-4">무료</div>
	                         </div>
	                           
	                         <div class="d-flex mt-4">
	                           <div class="benefits  mr-4">혜택</div>
	                           <div class="ml-4"> 회원가입 시 5,000원 쿠폰 지급</div>
	                         </div>
	                         
	                         <div class="file-upload btn clearfix mt-4 ">
	                           <input id="image" name="image" type="file" class="float-right mr-3" accept=".jpg,.jpeg,.png,.gif">
	                         </div>
	                          
	                         
	                         <div class="registration d-flex  mt-4">
	                           <button type="button" id="cancleBtn" class=" form-control col-6">모두 지우기</button>
	                            
	                            <button type="submit" id="registBtn" class=" form-control col-6 mr-2 text-white">등록하기</button>
	                         </div>  
	                       </div>
	                    </div>
	                    
	                  </div>
	                </div>

	             </div>
	           </div>
           </div>
         </div>       
      </div>
   </div>
   
   <script>
      $(document).ready(function(){   	     	 
    	 $("#cancleBtn").on("click", function(){
    		 $("input[name=productName]").val('');
    		 $("input[name=price]").val('');
    		 $("input[name=image]").val('');
    		 
    	 });
    	 
    	  $("#registBtn").on("click", function(){
    		 let productName = $('input[name=productName]').val().trim();
    		 if(productName == ''){
    			 alert("상품 이름을 입력해주세요");
    			 return;
    		 }
    		 
    		 let price = $('input[name=price]').val().trim();
    		 if(price == ''){
    			 alert("가격을 입력해주세요");
    			 return;
    		 } 
    		 
    		 let file = $('input[name=image]').val();
    		 
    		 if (file != ''){
    			 let ext = file.split('.').pop().toLowerCase();
    			 if ($.inArray(ext, ['gif', 'jpg', 'jpeg', 'png']) == -1) {
    				 alert("gif, jpg, jpeg, png 파일만 업로드 할 수 있습니다");
    				 $("input[name=image]").val('');
    				 return;
    			 }
    		 }
    		 
    		 let formData = new FormData();
    		 formData.append("productName", productName);
    		 formData.append("price", price);
    		 formData.append("file", $('input[name=image]')[0].files[0]);
    		 
    		 $.ajax({
    			      url:"/post/create"
    				 ,method: 'post'
    				 ,data: formData
    				 ,processData: false
    				 ,contentType: false
    				 ,enctype: 'multipart/form-data'
    				 ,success: function(data) {
    					 if(data.result == 'success'){
    						 alert("상품이 등록되었습니다");
    						 location.href = "/product/main_page_view"
    					 }
    				 }
    		         ,error: function(e){
    		        	 alert("상품 등록에 실패했습니다. ");
    		         }
    		 });
    	 }); 
      });
   </script>
</body>
</html>
     