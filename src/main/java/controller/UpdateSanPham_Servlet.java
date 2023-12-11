package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.bean.sanpham;
import model.bo.sanpham_bo;

/**
 * Servlet implementation class UpdateSanPham_Servlet
 */
@WebServlet("/UpdateSanPham_Servlet")
public class UpdateSanPham_Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateSanPham_Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			String maSanPham = request.getParameter("maSanPham");
			System.out.println("test");
			sanpham_bo bo = new sanpham_bo();
			System.out.println("test");
			sanpham sanPham = bo.GetSanPhamByID(maSanPham);
			System.out.println("test");
			request.setAttribute("sanPham",sanPham);
			request.getRequestDispatcher("/UpdateSanPham.jsp").forward(request, response);
		} catch (Exception e) {
			System.out.println("error");
		}
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			String maSanPham = request.getParameter("maSanPham");
			System.out.println("test");
			sanpham_bo bo = new sanpham_bo();
			System.out.println("test");
			sanpham sanPham = bo.GetSanPhamByID(maSanPham);
			System.out.println("test");
			request.setAttribute("sanPham",sanPham);
			request.getRequestDispatcher("/UpdateSanPham.jsp").forward(request, response);
		} catch (Exception e) {
			System.out.println("error");
		}
	}

}
