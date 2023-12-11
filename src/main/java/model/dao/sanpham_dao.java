package model.dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import model.bean.sanpham;
public class sanpham_dao {
	Connection conn = null;
	PreparedStatement ps = null;
	ResultSet rs = null;
	
	public ArrayList<sanpham>getAllSanPhamDienThoai() {
		ArrayList<sanpham> ArrayList = new ArrayList<>();
		String query = "SELECT * FROM sanpham Where TrangThai='active' and TheLoai='dienthoai'";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/laptrinhmang","root","");
			ps= conn.prepareStatement(query);
			rs = ps.executeQuery();
			while(rs.next()) {
				ArrayList.add(new sanpham(
						rs.getString(1),
						rs.getString(2),
						rs.getString(3),
						rs.getInt(4),
						rs.getString(5),
						rs.getString(6)
						));
			}
		} catch (Exception e) {
			System.out.println("error while get all ArrayList sanpham" + e);
		}
		
		
		
		
		return ArrayList;
	}
	
	public ArrayList<sanpham>getAllSanPhamDongHo() {
		ArrayList<sanpham> ArrayList = new ArrayList<>();
		String query = "SELECT * FROM sanpham Where TrangThai='active' and TheLoai='dongho'";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/laptrinhmang","root","");
			ps= conn.prepareStatement(query);
			rs = ps.executeQuery();
			while(rs.next()) {
				ArrayList.add(new sanpham(
						rs.getString(1),
						rs.getString(2),
						rs.getString(3),
						rs.getInt(4),
						rs.getString(5),
						rs.getString(6)
						));
			}
		} catch (Exception e) {
			System.out.println("error while get all ArrayList sanpham" + e);
		}
		
		
		
		
		return ArrayList;
	}
	
	public ArrayList<sanpham>getAllSanPhamLaptop() {
		ArrayList<sanpham> ArrayList = new ArrayList<>();
		String query = "SELECT * FROM sanpham Where TrangThai='active' and TheLoai='laptop'";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/laptrinhmang","root","");
			ps= conn.prepareStatement(query);
			rs = ps.executeQuery();
			while(rs.next()) {
				ArrayList.add(new sanpham(
						rs.getString(1),
						rs.getString(2),
						rs.getString(3),
						rs.getInt(4),
						rs.getString(5),
						rs.getString(6)
						));
			}
		} catch (Exception e) {
			System.out.println("error while get all ArrayList sanpham" + e);
		}
		
		
		
		
		return ArrayList;
	}
	
	
	
	public void addSanPham(String MaSanPham, String TenSanPham, String TheLoai, String Gia, String MoTa, String Anh, String TrangThai)
	{
		try
		{
			
			try
			{
				String query = "INSERT INTO `sanpham`(`MaSanPham`, `TenSanPham`, `TheLoai`, `Gia`, `MoTa`, `Anh`, `TrangThai`) VALUES ('" + MaSanPham +"','" + TenSanPham + "','" + TheLoai + "','" + Gia + "','" + MoTa +"','" + Anh +"','" + TrangThai + "');";
				Class.forName("com.mysql.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/laptrinhmang", "root", "");
				Statement stmtt  = (Statement) con.createStatement();
				stmtt.executeUpdate(query);
				stmtt.close();
				
			} catch (Exception e) {
				System.out.println("error: "+ e);
			}
		} catch (Exception e) {
			System.out.println("error while delete "+ e);
		}
	}
	
	public void updateSanPham(String MaSanPhamUpdate, String TenSanPham, String TheLoai, String Gia, String MoTa, String Anh)
	{
		try
		{
			
			try
			{
				String query = "UPDATE `sanpham` SET `TenSanPham`='" + TenSanPham + "',`TheLoai`='" + TheLoai + "',`Gia`='" + Gia + "',`MoTa`='" + MoTa + "',`Anh`='" + Anh + "' WHERE `MaSanPham`='" + MaSanPhamUpdate + "';";
				Class.forName("com.mysql.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/laptrinhmang", "root", "");
				Statement stmtt  = (Statement) con.createStatement();
				stmtt.executeUpdate(query);
				stmtt.close();
				
			} catch (Exception e) {
				System.out.println("error: "+ e);
			}
		} catch (Exception e) {
			System.out.println("error while delete "+ e);
		}
	}

	public void DeleteSanPham(String masanpham) {
		try {
			String query ="UPDATE sanpham set TrangThai='noactive' WHERE MaSanPham='"+ masanpham+"'";
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/laptrinhmang","root","");
			Statement smtt = (Statement) conn.createStatement();
			smtt.executeUpdate(query);
			smtt.close();
		} catch (Exception e) {
			System.out.println("error while delete" + e);
		}
	}
	public sanpham GetSanPhamByID(String maSanPham) {
		sanpham result = new sanpham();
		String query = "SELECT * from sanpham where MaSanPham='"+ maSanPham +"'";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/laptrinhmang","root","");
			ps= conn.prepareStatement(query);
			rs = ps.executeQuery();
			while(rs.next()) {
				result.setMaSanPham(rs.getString(1));
				result.setTenSanPham(rs.getString(2));
				result.setTheLoai(rs.getString(3));
				result.setGia(rs.getInt(4));
				result.setMoTa(rs.getString(5));
				result.setAnh(rs.getString(6));
				
			}
		} catch (Exception e) {
			System.out.println("error when get product by id"+ e);
		}
		
		return result;
	}
	
	
	public ArrayList<sanpham> SearchSanPham(){
		ArrayList<sanpham> result = new ArrayList<sanpham>();
		
		
		return result;
	}
	
	public static void main(String[] args) {
		sanpham_dao dao = new sanpham_dao();
		System.out.println(dao.GetSanPhamByID("pz001"));
  }
}
