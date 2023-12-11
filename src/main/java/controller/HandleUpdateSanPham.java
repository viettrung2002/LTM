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
 * Servlet implementation class HandleUpdateSanPham
 */
@WebServlet("/HandleUpdateSanPham")
public class HandleUpdateSanPham extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HandleUpdateSanPham() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			String destination = null;
			
			String MaSanPhamUpdate = request.getParameter("maSanPham");
			String TenSanPham = request.getParameter("tenSanPham");
			String TheLoai = request.getParameter("theloaiSanPham");
			String Gia = request.getParameter("giaSanPham");
			String MoTa = request.getParameter("motaSanPham");
			String Anh = request.getParameter("hinhanhSanPham");
			
			sanpham_bo bo = new sanpham_bo();
			bo.updateSanPham(MaSanPhamUpdate, TenSanPham, TheLoai, Gia, MoTa, Anh);
			//System.out.println(MaSanPham + " " + TenSanPham + " " + TheLoai + " " + Gia + " " + MoTa + " " + Anh + " " + TrangThai);
			destination = "/testAdminServlet";
			RequestDispatcher rd = getServletContext().getRequestDispatcher(destination);
			rd.forward(request,response);
		} catch (Exception e) 
		{
			System.out.println("update error");
		}
	}

}
