package model.dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import model.bean.nguoidung;
import model.bean.nguoidung;
import model.bean.taikhoan;

public class nguoidung_dao {
	Connection conn = null;
	PreparedStatement ps = null;
	ResultSet rs = null;
	
	public void addNguoiDung(String MaNguoiDung, String TenNguoiDung, String SoDienThoai, String DiaChi, String PhanQuyen)
	{
		try
		{
			try
			{
				String query = "INSERT INTO `nguoidung`(`MaNguoiDung`, `TenNguoiDung`, `SoDienThoai`, `DiaChi`, `PhanQuyen`) VALUES ('" + MaNguoiDung +"','" + TenNguoiDung + "','" + SoDienThoai + "','" + DiaChi + "','" + PhanQuyen+ "');";
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
	
	public void updateNguoiDung(String MaNguoiDungUpdate, String TenNguoiDung, String SoDienThoai, String DiaChi)
	{
		try
		{
			try
			{
				String query = "UPDATE `nguoidung` SET`TenNguoiDung`='" + TenNguoiDung + "',`SoDienThoai`='" + SoDienThoai +"',`DiaChi`='" + DiaChi + "' WHERE `MaNguoiDung`='" + MaNguoiDungUpdate + "';";
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
	public ArrayList<nguoidung> getAllNguoiDung() {
		ArrayList<nguoidung> arrayList = new ArrayList<nguoidung>();
		String query = "SELECT * FROM nguoidung where TrangThai = 'active' ";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/laptrinhmang","root","");
			ps= conn.prepareStatement(query);
			rs = ps.executeQuery();
			while(rs.next()) {
				arrayList.add(new nguoidung(
						rs.getString(1)
						,rs.getString(2)
						,rs.getString(3)
						,rs.getString(4)
						,rs.getString(5)));
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return arrayList;
	}
	public nguoidung GetNguoiDungByID(String maNguoiDung) {
		nguoidung result = new nguoidung();
		String query = "SELECT * from nguoidung where MaNguoiDung='"+ maNguoiDung +"'";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/laptrinhmang","root","");
			ps= conn.prepareStatement(query);
			rs = ps.executeQuery();
			while(rs.next()) {
				result.setMaNguoiDung(rs.getString(1));
				result.setTenNguoiDung(rs.getString(2));
				result.setSoDienThoai(rs.getString(3));
				result.setDiaChi(rs.getString(4));
				result.setPhanQuyen(rs.getString(5));
				
			}
		} catch (Exception e) {
			System.out.println("error when get product by id"+ e);
		}
		
		return result;
	}
	
}