package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.bo.sanpham_bo;

/**
 * Servlet implementation class HandleDeleteSanPham_Servlet
 */
@WebServlet("/HandleDeleteSanPham_Servlet")
public class HandleDeleteSanPham_Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HandleDeleteSanPham_Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			String maSanPham = request.getParameter("maSanPham");
			System.out.println("delete ma mon an: "+ maSanPham);
			sanpham_bo bo = new sanpham_bo();
			bo.DeleteSanPham(maSanPham);
			request.setAttribute("tenTK","phu");
			request.setAttribute("password","phu");
			request.getRequestDispatcher("/TestAdmin_Servlet").forward(request, response);
		} catch (Exception e) {
			System.out.println("error when handle delete"+ e);
		}
	}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		try {
//			String maSanPham = request.getParameter("maSanPham");
//			System.out.println("delete ma mon an: "+ maSanPham);
//			sanpham_bo bo = new sanpham_bo();
//			bo.DeleteSanPham(maSanPham);
////			request.setAttribute("tenTK","phu");
////			request.setAttribute("password","phu");
//			request.getRequestDispatcher("/index.jsp").forward(request, response);
//		} catch (Exception e) {
//			System.out.println("error when handle delete"+ e);
//		}
//	}
	}
}
