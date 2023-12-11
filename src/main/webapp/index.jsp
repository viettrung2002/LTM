<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="model.bean.sanpham"%>
<%@page import="model.bean.taikhoan"%>
<%@page import="java.util.ArrayList"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Thegioididong </title>
    <script src="https://code.iconify.design/iconify-icon/1.0.1/iconify-icon.min.js"></script>
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Nunito:wght@200;300;400;500;600;700;800&display=swap"
        rel="stylesheet">
    <link rel="stylesheet" href="./assetss/css/grid.css">
    <link rel="stylesheet" href="./assetss/css/style.css">
    <link rel="stylesheet" href="https://unpkg.com/swiper@8/swiper-bundle.min.css" />
    
</head>

<body>
    <div class="main">
        <div class="grid wide">
            <div class="main-header">
                <div class="header">
                    <div class="header-left-wrap">
                            <a href="testAdminServlet">
                         	<img src="./assetss/img/logo.png" class="header-logo"
                            >
                            </a>
                    </div>
                    <div class="header-navbar-function">
                        <div class="header-navbar-search">
                            <iconify-icon icon="material-symbols:search-rounded"
                                class="account-icon icon-primary-color"></iconify-icon>
                            <input type="text" placeholder="Tìm kiếm sản phẩm" class="header-navbar-search-input ">
                        </div>
                        <div class="header-navbar-cart">
                            <iconify-icon icon="material-symbols:shopping-cart-outline"
                                class="account-icon icon-primary-color">
                            </iconify-icon>
                            <input type="text" placeholder="Giỏ hàng" class="header-navbar-search-input"
                                style="width: 80px; cursor: pointer;" readonly>
                            <a href="#" style="width:100%"></a>
                        </div>
                    </div>
                    <div class="header-right-wrap">
                        <div class="account">
                            <div class="account-logo">
                                <iconify-icon icon="ph:user-circle-bold" class="account-icon-login"></iconify-icon>
                            </div>
                            <div class="account-login-and-register">
								<%String checkLogin = (String)request.getAttribute("checkLogin");
								taikhoan taiKhoan = (taikhoan)request.getAttribute("taiKhoan");
								if(checkLogin =="true"){
								%>
								
								<a href="UpdateNguoiDung_Servlet?maNguoiDung=<%=taiKhoan.getMaNguoiDung()%>" class="account-login">Cập nhật tài khoản</a>
                                <span>/</span>
                                <a href="testAdminServlet" class="account-login account-register">Đăng xuất</a> 
								<%}else { %>
							   <a href="login.jsp" class="account-login">Đăng nhập</a>
                                <span>/</span>
                               <a href="" class="account-login account-register">Tạo tài khoản</a> 
								<%} %>
                            </div>
                        </div>
                    </div>

                </div>
                <div class="header-navbar">
                    <div class="header-navbar-menu-type">
                        <a href="" class="header-navbar-menu">Điện thoại</a>
                        <a href="" class="header-navbar-menu">Đồng hồ</a>
                        <a href="" class="header-navbar-menu">Laptop</a>
                        <a href="" class="header-navbar-menu">Liên hệ</a>
                    </div>
                    
                </div>
            </div>
            <div class="slider-main">
                <section id="slider">
                    
                    <label id="slide" >
                        <img src="./assetss/img/banner.png" alt="" height="100%" width="100%" class="img-banner">
                    </label>
                </section>
            </div>
            <div class="content">
                <div class="product-title"
                    style="border-bottom:3px solid var(--primary-color);width:250px;margin: 30px 0;">Tất cả sản phẩm 
                </div>

                <div class="product-content">
                    <div class="product-title">Điện thoại</div>
                        <div class="product-list">
                    	<%
						ArrayList<sanpham> sanPhamList = (ArrayList<sanpham>)request.getAttribute("listSanPham");
						int index =0;
							for(int i = 0 ; i < sanPhamList.size(); i++){
								index++;
								if(index == 5) break;
						%>
							<div class="product c-3 col">
		                            <div class="product-img-container">
		                                <a href="" class="product-img-link">
		                                    <img loadedimage="true" src="<%= sanPhamList.get(i).getAnh()%>" alt="" class="product-img">
		                                </a>
		                            </div>
		
		                            <div class="product-name">
		                                <a href="" class="product-link-name"><%=sanPhamList.get(i).getTenSanPham() %></a>
		                            </div>
		                            <div class="product-desc">
		                                <p class="product-desc-detail"><%=sanPhamList.get(i).getMoTa() %></p>
		                            </div>
		                            <div class="product-bottom">
		                                <div class="product-bottom-price">
		                                    
		                                    <p class="product-price"><%=sanPhamList.get(i).getGia()%>đ</p>
		                                </div>
		                                <div class="product-btn">
		                                    <a href="" class="btn-title">Mua ngay</a>
		                                    <iconify-icon icon="material-symbols:arrow-right-alt-rounded" class="account-icon">
		                                    </iconify-icon>
		                                </div>
		                            </div>
		                        </div>
						<% } %>
					</div>
                    
                    <div class="product-more">
                        <a href="" class="product-more-link">Xem thêm</a>
                        <iconify-icon icon="material-symbols:add" class="account-icon"></iconify-icon>

                    </div>
                </div>

            	<div class="product-content">
                    <div class="product-title">Đồng hồ</div>
                              <div class="product-list">
                    	<%
						ArrayList<sanpham> listDongHo = (ArrayList<sanpham>)request.getAttribute("listDongHo");
						index = 0;
							for(int i = 0 ;i < listDongHo.size(); i++){
								index++;
								if(index ==5) break;
						%>
							<div class="product c-3 col">
		                            <div class="product-img-container">
		                                <a href="" class="product-img-link">
		                                    <img loadedimage="true" src="<%= listDongHo.get(i).getAnh()%>" alt="" class="product-img">
		                                </a>
		                            </div>
		
		                            <div class="product-name">
		                                <a href="" class="product-link-name"><%=listDongHo.get(i).getTenSanPham() %></a>
		                            </div>
		                            <div class="product-desc">
		                                <p class="product-desc-detail"><%=listDongHo.get(i).getMoTa() %></p>
		                            </div>
		                            <div class="product-bottom">
		                                <div class="product-bottom-price">
		                                    
		                                    <p class="product-price"><%=listDongHo.get(i).getGia()%>đ</p>
		                                </div>
		                                <div class="product-btn">
		                                    <a href="" class="btn-title">Mua ngay</a>
		                                    <iconify-icon icon="material-symbols:arrow-right-alt-rounded" class="account-icon">
		                                    </iconify-icon>
		                                </div>
		                              
		                            </div>
		                        </div>
						<% }%>
					</div>
                    
                    <div class="product-more">
                        <a href="" class="product-more-link">Xem thêm</a>
                        <iconify-icon icon="material-symbols:add" class="account-icon"></iconify-icon>

                    </div>
                </div>
                <div class="product-content">
                    <div class="product-title">Laptop</div>
                              <div class="product-list">
                    	<%
						ArrayList<sanpham> listLaptop = (ArrayList<sanpham>)request.getAttribute("listLaptop");
						index = 0;
							for(int i = 0 ; i < listLaptop.size(); i++){
								index++;
								if(index ==5) break;
						%>
							<div class="product c-3 col">
		                            <div class="product-img-container">
		                                <a href="" class="product-img-link">
		                                    <img loadedimage="true" src="<%= listLaptop.get(i).getAnh()%>" alt="" class="product-img">
		                                </a>
		                            </div>
		
		                            <div class="product-name">
		                                <a href="" class="product-link-name"><%=listLaptop.get(i).getTenSanPham() %></a>
		                            </div>
		                            <div class="product-desc">
		                                <p class="product-desc-detail"><%=listLaptop.get(i).getMoTa() %></p>
		                            </div>
		                            <div class="product-bottom">
		                                <div class="product-bottom-price">
		                                    
		                                    <p class="product-price"><%=listLaptop.get(i).getGia()%>đ</p>
		                                </div>
		                                <div class="product-btn">
		                                    <a href="" class="btn-title">Mua ngay</a>
		                                    <iconify-icon icon="material-symbols:arrow-right-alt-rounded" class="account-icon">
		                                    </iconify-icon>
		                                </div>

		                            </div>
		                        </div>
		                    
						<% } %>
					</div>
                    
                    <div class="product-more">
                        <a href="" class="product-more-link">Xem thêm</a>
                        <iconify-icon icon="material-symbols:add" class="account-icon"></iconify-icon>

                    </div>
                </div>
            </div>
        </div>
        <div class="footer">
            <div class="footer-top  grid wide">
                <div class="footer-top-part col-3">
                    <img src="./assetss/img/logo.png" alt="" class="footer-logo">
                </div>
                <div class="footer-top-part col-3">
                    <p class="introduce">GIỚI THIỆU</p>
                    <a href="" class="introduce-link">Hệ thống cửa hàng</a>
                    <a href="" class="introduce-link">Câu chuyện thương hiệu</a>
                    <a href="" class="introduce-link">Ưu đãi thành viên</a>
                    <a href="" class="introduce-link">Tin tức & sự kiện</a>
                    <a href="" class="introduce-link">Tuyển dụng</a>
                    <p class="introduce">VĂN PHÒNG ĐẠI DIỆN</p>
                    <p>Công ty Cổ phần Viet Trung,   
                    Thạch Bàn, An Thủy, Lệ Thủy, Quảng Bình

                        SĐT: +84934413090

                        </p>
                </div>
                <div class="footer-top-part col-3">
                    <p class="introduce">LIÊN HỆ</p>
                    <div class="introduce-list">
                        <a href="" class="introduce-link">Liên hệ</a>
                        <a href="" class="introduce-link">Hướng dẫn mua hàng</a>
                        <a href="" class="introduce-link">Chính sách giao hàng</a>
                        <a href="" class="introduce-link">Chính sách bảo mật</a>
                        <a href="" class="introduce-link">Điều khoản và Điều kiện</a>
                        <p class="introduce">TỔNG ĐÀI HỖ TRỢ</p>
                        
                        <a href="" class="introduce-link">Khiếu nại: 1800.1062 (8:00 - 21:30)</a>
                        <a href="" class="introduce-link">Bảo hành: 1800.1064 (8:00 - 21:00)</a>
                    </div>

                </div>
                <div class="footer-top-part col-3">
                    <p class="introduce">LIÊN KẾT VỚI CHÚNG TÔI</p>
                    <div class="contact">
                        <div class="social-media">
                            <a href="" class="social-media-link">
                                <iconify-icon icon="ic:baseline-facebook" class="account-icon"></iconify-icon>
                                <iconify-icon icon="ri:instagram-fill" class="account-icon"></iconify-icon>
                                <iconify-icon icon="mdi:youtube" class="account-icon"></iconify-icon>
                            </a>
                        </div>

                    </div>
                    <img src="./assetss/img/certi.png" alt="" class="certi">
                </div>

            </div>
            

        </div>
    </div>
</body>

</html>