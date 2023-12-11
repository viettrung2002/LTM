package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.bo.sanpham_bo;

/**
 * Servlet implementation class AddSanPham_Servlet
 */
@WebServlet("/AddSanPham_Servlet")
public class AddSanPham_Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddSanPham_Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		try {
//			String destination = null;
//			
//			String MaSanPham = request.getParameter("maSanPham");
//			String TenSanPham = request.getParameter("tenSanPham");
//			String TheLoai = request.getParameter("theloaiSanPham");
//			String Gia = request.getParameter("giaSanPham");
//			String MoTa = request.getParameter("motaSanPham");
//			String Anh = request.getParameter("hinhanhSanPham");
//			
//			sanpham_bo bo = new sanpham_bo();
//			bo.addSanPham(MaSanPham, TenSanPham, TheLoai, Gia, MoTa, Anh, "active");
//			destination = "/index.jsp";
//			RequestDispatcher rd = getServletContext().getRequestDispatcher(destination);
//			response.sendRedirect(destination);
//		} catch (Exception e) 
//		{
//			System.out.println("update error");
//		}
//	}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			String destination = null;
			
			String MaSanPham = request.getParameter("maSanPham");
			String TenSanPham = request.getParameter("tenSanPham");
			String TheLoai = request.getParameter("theloaiSanPham");
			String Gia = request.getParameter("giaSanPham");
			String MoTa = request.getParameter("motaSanPham");
			String Anh = request.getParameter("hinhanhSanPham");
			String role = "admin";
			sanpham_bo bo = new sanpham_bo();
			bo.addSanPham(MaSanPham, TenSanPham, TheLoai, Gia, MoTa, Anh, "active");
			request.setAttribute("role", role);
			destination = "/TestAdmin_Servlet";
			RequestDispatcher rd = getServletContext().getRequestDispatcher(destination);
			rd.forward(request,response);
//			response.sendRedirect(destination);
		} catch (Exception e) 
		{
			System.out.println("update error");
			
		}
	}

}
