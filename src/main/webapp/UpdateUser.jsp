<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@page import="model.bean.nguoidung"%>
<%@page import="model.bean.taikhoan"%>
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
    <link rel="stylesheet" href="./assetss/css/Login.css">
    <link rel="stylesheet" href="./assetss/css/Update.css">

    <link rel="stylesheet" href="https://unpkg.com/swiper@8/swiper-bundle.min.css" />
    
</head>

<body>
    <div class="main">
        <div class="grid wide">
            <div class="main-header">
                <div class="header">
                    <div class="header-left-wrap">
                         <a href="TestAdmin_Servlet">
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
                        
                    </div>
                    <div class="header-right-wrap">
                        <div class="account">
                            <div class="account-logo">
                                <iconify-icon icon="ph:user-circle-bold" class="account-icon-login"></iconify-icon>
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
            
            <div class="content" style = "height: 650px">
                <div class="form-container" >
                    <h2 class="form-title">
                        Thông tin người dùng
                    </h2>
					<%  nguoidung nguoiDung = (nguoidung)request.getAttribute("nguoiDung");
						taikhoan taiKhoan = (taikhoan)request.getAttribute("taiKhoan");
					%>
                    <form action="HandleUpdateNguoiDung" class="form-login" method="post">
                    	<div class="form-input-group">
                            <div class="form-label">Mã người dùng</div>
                            <input type="text" value = "<%=nguoiDung.getMaNguoiDung() %>" name="maND" class="form-input" readonly="readonly">
                        </div>
                        <div class="form-input-group">
                            <div class="form-label">Họ và tên</div>
                            <input type="text" value = "<%=nguoiDung.getTenNguoiDung()%>" placeholder="Nhập họ và tên tại đây" name="tenND" class="form-input">
                        </div>
                        <div class="form-input-group">
                            <div class="form-label">Số điện thoại</div>
                            <input type="tel" value = "<%=nguoiDung.getSoDienThoai()%>" placeholder="Nhập số điện thoại tại đây"  name="SDT" class="form-input">
                        </div>
                        <div class="form-input-group">
                            <div class="form-label">Địa chỉ</div>
                            <input type="text" value = "<%=nguoiDung.getDiaChi()%>" placeholder="Nhập địa chỉ tại đây" name="diaChi" class="form-input"
                                rows="3">
                        </div>
                        
                        <div class="form-input-group">
                            <div class="form-label">Mật khẩu</div>
                            <input type="password" value ="<%taiKhoan.getMatKhau(); %>" placeholder="Nhập mật khẩu của bạn tại đây" name="password" 
                                class="form-input">
                        </div>
                        <button class="btn-login" type="submit">Cập nhật</button>
                    </form>
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
</body>

</html>