package controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.bean.nguoidung;
import model.bean.sanpham;
import model.bean.taikhoan;
import model.bo.sanpham_bo;
import model.bo.nguoidung_bo;
import model.bo.taikhoan_bo;
import model.dao.sanpham_dao;

/**
 * Servlet implementation class testAdminServlet
 */
@WebServlet("/testAdminServlet")
public class testAdminServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public testAdminServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		sanpham_bo bo = new sanpham_bo();
		nguoidung_bo bo_nd = new nguoidung_bo();
		taikhoan_bo bo_tk = new taikhoan_bo();
		ArrayList<sanpham> listSanPham = bo.getAllSanPhamDienThoai();
		request.setAttribute("listSanPham",listSanPham);
		ArrayList<sanpham> listDongHo = bo.getAllSanPhamDongHo();
		request.setAttribute("listDongHo",listDongHo);
		ArrayList<sanpham> listLaptop = bo.getAllSanPhamLaptop();
		request.setAttribute("listLaptop",listLaptop);
		
		ArrayList<nguoidung> listNguoiDung = bo_nd.getAllNguoiDung();
		request.setAttribute("listNguoiDung", listNguoiDung);
		
		ArrayList<taikhoan> listTaiKhoan = bo_tk.getAllTaiKhoan();
		request.setAttribute("listTaiKhoan", listTaiKhoan);
		String destination = "/index.jsp";
		System.out.println("xuat");
		RequestDispatcher rd = getServletContext().getRequestDispatcher(destination);
		rd.forward(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		sanpham_bo bo = new sanpham_bo();
		ArrayList<sanpham> listSanPham = bo.getAllSanPhamDienThoai();
		request.setAttribute("listSanPham",listSanPham);
		ArrayList<sanpham> listDongHo = bo.getAllSanPhamDongHo();
		request.setAttribute("listDongHo",listDongHo);
		ArrayList<sanpham> listLaptop = bo.getAllSanPhamLaptop();
		request.setAttribute("listLaptop",listLaptop);
		String destination = "/index.jsp";
		System.out.println("xuat");
		RequestDispatcher rd = getServletContext().getRequestDispatcher(destination);
		rd.forward(request,response);
	}

}
