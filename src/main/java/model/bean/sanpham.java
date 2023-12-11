package model.bean;

public class sanpham {
	String MaSanPham;
	private String TenSanPham;
	private String TheLoai;
	private int Gia;
	private String MoTa;
	private String Anh;
	
	public String getMaSanPham() {
		return MaSanPham;
	}
	public void setMaSanPham(String maSanPham) {
		MaSanPham = maSanPham;
	}
	public String getTenSanPham() {
		return TenSanPham;
	}
	public void setTenSanPham(String tenSanPham) {
		TenSanPham = tenSanPham;
	}
	public String getTheLoai() {
		return TheLoai;
	}
	public void setTheLoai(String theLoai) {
		TheLoai = theLoai;
	}
	public int getGia() {
		return Gia;
	}
	public void setGia(int gia) {
		Gia = gia;
	}
	public String getMoTa() {
		return MoTa;
	}
	public void setMoTa(String moTa) {
		MoTa = moTa;
	}
	public String getAnh() {
		return Anh;
	}
	public void setAnh(String anh) {
		Anh = anh;
	}
	@Override
	public String toString() {
		return "sanpham [MaSanPham=" + MaSanPham + ", TenSanPham=" + TenSanPham + ", TheLoai=" + TheLoai + ", Gia="
				+ Gia + ", MoTa=" + MoTa + ", Anh=" + Anh + "]";
	}
	public sanpham(String maSanPham, String tenSanPham, String theLoai, int gia, String moTa, String anh) {
		super();
		MaSanPham = maSanPham;
		TenSanPham = tenSanPham;
		TheLoai = theLoai;
		Gia = gia;
		MoTa = moTa;
		Anh = anh;
	}
	public sanpham() {
		
	}
	
	
}
