package model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import model.bean.taikhoan;
import model.bean.taikhoan;

public class taikhoan_dao {
	Connection conn = null;  		
	PreparedStatement ps = null;   
	ResultSet rs = null; 	
public boolean isExistUser(String TenTaiKhoan, String MatKhau) {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/laptrinhmang","root","");
			Statement stmt = conn.createStatement();
			PreparedStatement ps;
			ps = conn.prepareStatement("SELECT * from taikhoan where TenTaiKhoan='"+TenTaiKhoan+"' and MatKhau='"+ MatKhau+"'");
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				return true;
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Error" + e);
		}
		return false;
	}
public boolean isAdminRole(String TenTaiKhoan, String MatKhau) {
	
	try {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/laptrinhmang","root","");
		Statement stmt = conn.createStatement();
		PreparedStatement ps;
		ps = conn.prepareStatement("SELECT * FROM nguoidung WHERE PhanQuyen='admin' AND MaNguoiDung IN (SELECT MaNguoiDung from taikhoan where TenTaiKhoan='"+TenTaiKhoan+"' and MatKhau='"+ MatKhau+"')");
		ResultSet rs = ps.executeQuery();
		while(rs.next()) {
			return true;
		}
	} catch (Exception e) {
		// TODO Auto-generated catch block
		System.out.println("Error" + e);
	}
	return false;
}
public ArrayList<taikhoan> getAllTaiKhoan(){
	ArrayList<taikhoan> result = new ArrayList<taikhoan>();
	String query ="SELECT * from taikhoan";
	try {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/laptrinhmang","root","");
		ps= conn.prepareStatement(query);
		rs = ps.executeQuery();
		while(rs.next()) {
			result.add(new taikhoan(rs.getString(1)
					,rs.getString(2)
					,rs.getString(3)
					,rs.getString(4)));
		}
	} catch (Exception e) {
		// TODO: handle exception
		System.out.println("error: "+ e);
	}
	return result;
}

public void updateTaiKhoan(String MaNguoiDungUpdate, String MatKhau)
{
	//Loi so sanh bang
	try
	{
		String query = "UPDATE `taikhoan` SET `MatKhau`='" + MatKhau +"' WHERE `MaNguoiDung`='" + MaNguoiDungUpdate + "';";
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/laptrinhmang", "root", "");
		Statement stmtt  = (Statement) con.createStatement();
		stmtt.executeUpdate(query);
		stmtt.close();
		
	} catch (Exception e) {
		System.out.println("error: "+ e);
	}
}
public taikhoan GetTaiKhoanByID(String maNguoiDung) {
	taikhoan result = new taikhoan();
	String query = "SELECT * from taikhoan where MaNguoiDung='"+ maNguoiDung +"'";
	try {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/laptrinhmang","root","");
		ps= conn.prepareStatement(query);
		rs = ps.executeQuery();
		while(rs.next()) {
			result.setMaNguoiDung(rs.getString(2));
			result.setTenTaiKhoan(rs.getString(2));
			result.setMatKhau(rs.getString(3));
			result.setTrangThai(rs.getString(4));
			
		}
	} catch (Exception e) {
		System.out.println("error when get product by id"+ e);
	}
	
	return result;
}
public taikhoan GetTaiKhoanByUserName(String tenTaiKhoan) {
	taikhoan result = new taikhoan();
	String query = "SELECT * from taikhoan where TenTaiKhoan='"+ tenTaiKhoan +"'";
	try {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/laptrinhmang","root","");
		ps= conn.prepareStatement(query);
		rs = ps.executeQuery();
		while(rs.next()) {
			result.setMaNguoiDung(rs.getString(1));
			result.setTenTaiKhoan(rs.getString(2));
			result.setMatKhau(rs.getString(3));
			result.setTrangThai(rs.getString(4));
			
		}
	} catch (Exception e) {
		System.out.println("error when get product by id"+ e);
	}
	
	return result;
}


public static void main(String[] args) {
	taikhoan_dao dao = new taikhoan_dao();
	System.out.println(dao.isAdminRole("minh","minh"));
}
}