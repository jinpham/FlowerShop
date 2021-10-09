	<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<c:url value = "/view/client/assets" var="url"/>
  <!-- Start header section -->
  <jsp:include page = "./header/mainHeader.jsp" flush = "true" />
  
  
  <section id="aa-catg-head-banner">
   <img src="${pageContext.request.contextPath}/view/client/assets/images/banner.jpg" alt="banner sản phẩm">
   <div class="aa-catg-head-banner-area">
     <div class="container">
      <div class="aa-catg-head-banner-content">
        <h2>Giới thiệu</h2>
        <ol class="breadcrumb">
          <li><a href="${pageContext.request.contextPath}/">Trang chủ</a></li>      
          <li style="color:#fff">Giới thiệu</li>   
        </ol>
      </div>
     </div>
   </div>
  </section>
  <section id="aa-product-category">
    <div class="container">
      <div class="row">
      	<div>
      		<h1 style ="text-align: center; color : black;">FLOWER SHOP</h1>
      		<p>Chúng tôi hi vọng mang đến niềm vui cho bạn. <strong>Flower Shop</strong> luôn đem đến những mẫu hoa mới nhất nhằm phục vụ nhu cầu của khác hàng.</p>
      		<img src="${url}/images/introduce1.jpg" alt="Thực phẩm sạch" width= "1160" height= "600"/> <br/> <br>
      		<p>Với triết lý trong kinh doanh là tuân thủ và đảm bảo được chất lượng , nguồn gốc xuất xứ về sản phẩm rõ ràng.</p>
      		<img src="${url}/images/introduce2.jpg" alt="Thực phẩm sạch" width= "1160" height= "600"/> <br/> 
      	</div>
      </div>
     </div>
    </section>
    
<!--  footer-->
 <jsp:include page = "./footer/footer.jsp" flush = "true" />
<!-- end footer-->
      