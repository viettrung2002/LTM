package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.bean.sanpham;
import model.bean.taikhoan;
import model.bo.sanpham_bo;
import model.bo.taikhoan_bo;


/**
 * Servlet implementation class TaiKhoan_Servlet
 */
@WebServlet("/TaiKhoan_Servlet")
public class TaiKhoan_Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TaiKhoan_Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String destination = null;
		
		String tenTK = request.getParameter("tenTK");
		String password = request.getParameter("password");
		System.out.println(tenTK);
		System.out.println(password);
		taikhoan_bo checkBO = new taikhoan_bo();
		ArrayList<taikhoan> taikhoanList = null;
	
		
		
		if(checkBO.isValidUser(tenTK,password)) {
			taikhoanList  = checkBO.getAllTaiKhoan();
			request.setAttribute("taikhoanList",taikhoanList);
			sanpham_bo SanPhamBO = new sanpham_bo();
			ArrayList<sanpham> listSanPham = SanPhamBO.getAllSanPhamDienThoai();
			request.setAttribute("listSanPham",listSanPham);
			ArrayList<sanpham> listDongHo = SanPhamBO.getAllSanPhamDongHo();
			request.setAttribute("listDongHo",listDongHo);
			ArrayList<sanpham> listLaptop = SanPhamBO.getAllSanPhamLaptop();
			request.setAttribute("listLaptop",listLaptop);
			taikhoan_bo TaiKhoanBO = new taikhoan_bo();
			taikhoan taiKhoan = TaiKhoanBO.GetTaiKhoanByUserName(tenTK);
			request.setAttribute("taiKhoan", taiKhoan);
			System.out.println(taiKhoan.getMaNguoiDung());
			String maNV = SanPhamBO.GetSanPhamCuoi();
			request.setAttribute("maNV", maNV);
			if(checkBO.isAdminRole(tenTK,password)) {
				destination = "/Admin.jsp";
			}else {
				String checkLogin = "true";
				request.setAttribute("checkLogin",checkLogin);
				destination ="/Index.jsp";
			}
			RequestDispatcher rd = getServletContext().getRequestDispatcher(destination);
			System.out.println("xuat");
			rd.forward(request,response);
			
		}else {
			destination = "/Login.jsp";
			RequestDispatcher rd = getServletContext().getRequestDispatcher(destination);
			System.out.println("test2");
			rd.forward(request,response);
		}
	}
	}