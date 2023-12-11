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
		try {
			sanpham_bo SanPhamBO = new sanpham_bo();
			String destination = null;
			String maNV = SanPhamBO.GetSanPhamCuoi();
			System.out.println("Ma nhan vien: "+ maNV);
			String NV = maNV.substring(0, 2);
			String maNVmoi;
			String So = maNV.substring(2);
			int So_int = Integer.parseInt(So) + 1;
			if (So_int <= 9){
				maNVmoi = NV + "0" + So_int;
			} else {
				maNVmoi = NV + So_int;
			}
			request.setAttribute("maNVmoi", maNVmoi);	
			destination = "/AddSanPham.jsp";
			RequestDispatcher rd = getServletContext().getRequestDispatcher(destination);
			rd.forward(request,response);
//			response.sendRedirect(destination);
		} catch (Exception e) 
		{
			System.out.println("update error");
			
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			sanpham_bo SanPhamBO = new sanpham_bo();
			String destination = null;
			String maNV = SanPhamBO.GetSanPhamCuoi();
			System.out.println("Ma nhan vien: "+ maNV);
			String NV = maNV.substring(0, 2);
			String maNVmoi;
			String So = maNV.substring(2);
			int So_int = Integer.parseInt(So) + 1;
			if (So_int <= 9){
				maNVmoi = NV + "0" + So_int;
			} else {
				maNVmoi = NV + So_int;
			}
			request.setAttribute("maNVmoi", maNVmoi);	
			destination = "/AddSanPham.jsp";
			RequestDispatcher rd = getServletContext().getRequestDispatcher(destination);
			rd.forward(request,response);
//			response.sendRedirect(destination);
		} catch (Exception e) 
		{
			System.out.println("update error");
			
		}
	}

}
