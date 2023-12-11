package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.bean.nguoidung;
import model.bo.nguoidung_bo;
import model.bean.taikhoan;
import model.bo.taikhoan_bo;

/**
 * Servlet implementation class UpdateSanPham_Servlet
 */
@WebServlet("/UpdateNguoiDung_Servlet")
public class UpdateNguoiDung_Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateNguoiDung_Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			String maNguoiDung = request.getParameter("maNguoiDung");
			System.out.println("test");
			nguoidung_bo bo = new nguoidung_bo();
			taikhoan_bo bo_tk = new taikhoan_bo();
			System.out.println("test");
			nguoidung nguoiDung = bo.GetNguoiDungByID(maNguoiDung);
			taikhoan taiKhoan = bo_tk.GetTaiKhoanByID(maNguoiDung);
			System.out.println("test");
			System.out.println("Ma nguoi dung :" +nguoiDung.getMaNguoiDung());
			request.setAttribute("nguoiDung",nguoiDung);
			request.setAttribute("taiKhoan",taiKhoan);
			
			request.getRequestDispatcher("/UpdateUser.jsp").forward(request, response);
		} catch (Exception e) {
			System.out.println("error");
		}
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			String maNguoiDung = request.getParameter("maNguoiDung");
			System.out.println("test");
			nguoidung_bo bo = new nguoidung_bo();
			taikhoan_bo bo_tk = new taikhoan_bo();
			System.out.println("test");
			nguoidung nguoiDung = bo.GetNguoiDungByID(maNguoiDung);
			taikhoan taiKhoan = bo_tk.GetTaiKhoanByID(maNguoiDung);
			System.out.println("test");
			request.setAttribute("nguoiDung",nguoiDung);
			request.setAttribute("taiKhoan",taiKhoan);
			
			request.getRequestDispatcher("/UpdateUser.jsp").forward(request, response);
		} catch (Exception e) {
			System.out.println("error");
		}
	}

}
