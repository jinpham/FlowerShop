<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<c:url value = "/view/client/assets" var="url"/>

<!-- Start header section -->
  <jsp:include page = "./header/mainHeader.jsp" flush = "true" />
  <!-- / header section -->
  
 <section id="aa-catg-head-banner">
   <img src="${pageContext.request.contextPath}/view/client/assets/images/home.jpg" alt="banner sản phẩm">
   <div class="aa-catg-head-banner-area">
     <div class="container">
      <div class="aa-catg-head-banner-content">
        <h2>Trang cá nhân</h2>
        <ol class="breadcrumb">
          <li><a href="${pageContext.request.contextPath}/">Trang chủ</a></li>      
          <li style="color:#fff">Trang cá nhân</li>   
        </ol>
      </div>
     </div>
   </div>
  </section> 
<!--  content -->
   <section id="aa-myaccount">
   <div class="container">
     <div class="row">
       <div class="col-md-12">
        <div class="aa-myaccount-area">         
            <div class="row">
              <div class="col-md-8 col-md-push-2">
                <div class="aa-myaccount-login">
                <h4>Thông tin cá nhân</h4>
                <form class="aa-login-form" method="get" action="${pageContext.request.contextPath}/view/client/personal-page">
                
                
                <label for="input-1">Tên khách hàng</label>
                    <input type="text" class="form-control"   value="${USER.name}">
                
                <label for="input-1">Email</label>
                    <input type="text" class="form-control"  value="${USER.email}">
                
                <label for="input-1">Số điện thoại</label>
                    <input type="text" class="form-control"  id="input-1" value="${USER.phone}">
                
                <label for="input-2" class="col-form-label">Tên đăng nhập</label>
                    <input type="text" class="form-control"  id="input-1"  value="${USER.username}">
                <div class="form-group">
                    <label for="input-4">Mật khẩu</label>
                    <input type="password" class="form-control" id="myinput" placeholder="Mật khẩu" value="${USER.password}" name="user-password">
					<input type="checkbox" onclick="myFunction1()">Hiển thị mật khẩu
					<script>function myFunction1() {
                    	  var x = document.getElementById("myinput");
                    	  if (x.type === "password") {
                    	    x.type = "text";
                    	  } else {
                    	    x.type = "password";
                    	  }
                    	}
					</script>                   
                  </div>    
                 
                <label for="input-2" class="col-form-label">Ngày tạo tài khoản</label>
                  <input type="text" class="form-control"  id="input-1" name="order-phone" value="${USER.created}">
                       
		             <button type="submit" class="aa-browse-btn">Cập nhật</button>
		                
                  </form>
                </div>
              </div>
            </div>          
         </div>
       </div>
     </div>
   </div>
 </section>
<!--  end content-->

<!--  footer-->
 <jsp:include page = "./footer/footer.jsp" flush = "true" />
<!-- end footer-->