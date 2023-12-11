package model.bo;

import java.util.ArrayList;

import model.bean.sanpham;
import model.dao.sanpham_dao;

public class sanpham_bo {
	sanpham_dao dao_SanPham = new sanpham_dao();

    public ArrayList<sanpham> getAllSanPhamDienThoai() {
        return dao_SanPham.getAllSanPhamDienThoai();
    }

    public ArrayList<sanpham> getAllSanPhamDongHo() {
        return dao_SanPham.getAllSanPhamDongHo();
    }

    public ArrayList<sanpham> getAllSanPhamLaptop() {
        return dao_SanPham.getAllSanPhamLaptop();
    }

    public void DeleteSanPham(String sanPhamID) {
        dao_SanPham.DeleteSanPham(sanPhamID);
    }

    public void addSanPham(String MaSanPham, String TenSanPham, String TheLoai, String Gia, String MoTa, String Anh, String TrangThai) {
        dao_SanPham.addSanPham(MaSanPham, TenSanPham, TheLoai, Gia, MoTa, Anh, TrangThai);
    }

    public void updateSanPham(String MaSanPhamUpdate, String TenSanPham, String TheLoai, String Gia, String MoTa, String Anh) {
        dao_SanPham.updateSanPham(MaSanPhamUpdate, TenSanPham, TheLoai, Gia, MoTa, Anh);
    }

    public sanpham GetSanPhamByID(String id) {
        return dao_SanPham.GetSanPhamByID(id);
    }
    public String GetSanPhamCuoi() {
    	return dao_SanPham.GetSanPhamCuoi();
    }
}
