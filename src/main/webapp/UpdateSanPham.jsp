<%@page import="model.bean.sanpham"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
    <link rel="stylesheet" href="./assetss/css/Login.css">
    <link rel="stylesheet" href="./assetss/css/addProduct.css">

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
                            alt="Logo pizza">
                    </a>
                    </div>
                  

                </div>
                <div class="header-navbar">
                    <div class="header-navbar-menu-type">
                        
                        <a href="" class="header-navbar-menu">Quản lý sản phẩm</a>
                        <a href="" class="header-navbar-menu">Quản lý người dùng</a>
                        
                    </div>
                    
                </div>
            </div>
            
            <div class="content">
                <div class="form-container">
                    <h2 class="form-title">
                        Cập nhật sản phẩm
                    </h2>

                    <form action="HandleUpdateSanPham" class="form-login" method="post">
                        <div class="form-input-group">
                        <%sanpham sanPham = (sanpham)request.getAttribute("sanPham");
                    		String phoneSelected = "";
                    		String watchSelected = "";
                    		String laptopSelected = "";
                    		if(sanPham.getTheLoai() == "dienthoai"){
                    			phoneSelected = "selected";
                    		} if(sanPham.getTheLoai() == "dongho"){
                    			watchSelected = "selected";
                    		} if(sanPham.getTheLoai() =="laptop") {
                    			laptopSelected="selected";
                    		}
                    		%>
                            <div class="form-label">Mã sản phẩm</div>
                            <input type="text" value="<%=sanPham.getMaSanPham() %>" placeholder="Nhập mã sản phẩm tại đây" name="maSanPham" class="form-input" readonly>
                        </div>
                        <div class="form-input-group">
                            <div class="form-label">Tên sản phẩm</div>
                            <input type="text" value="<%=sanPham.getTenSanPham()%>" placeholder="Nhập tên sản phẩm tại đây" name="tenSanPham" class="form-input">
                        </div>
                        <div class="form-input-group">
                            <div class="form-label">Thể loại sản phẩm</div>
                            <Select class="userCbb" name="theloaiSanPham">
                                <option value="dienthoai" <%=phoneSelected %>>Điện thoại</option>
                                <option value="dongho" <%=watchSelected %>>Đồng hồ</option>
                                <option value="laptop" <%=laptopSelected %>>Laptop</option>
                            </Select>
                        </div>
                        <div class="form-input-group">
                            <div class="form-label">Giá sản phẩm</div>
                            <input type="text" value="<%=sanPham.getGia()%>" placeholder="Giá sản phẩm" name="giaSanPham" class="form-input">
                        </div>
                        <div class="form-input-group">
                            <div class="form-label">Mô tả</div>
                            <input type="text" value="<%=sanPham.getMoTa()%>" placeholder="Mô tả của sản phẩm" name="motaSanPham" class="form-input"
                                rows="3">
                        </div>
                        <div class="form-input-group">
                            <div class="form-label">Link hình ảnh sản phẩm</div>
                            <input type="text" value="<%=sanPham.getAnh() %>" placeholder="Hình ảnh sản phẩm" name="hinhanhSanPham" class="form-input">
                        </div>
                        <button class="btn-login"  type="submit">Cập nhật</button>
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