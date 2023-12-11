package model.bean;

public class nguoidung {

	private String MaNguoiDung;
	private String TenNguoiDung;
	private String SoDienThoai;
	private String PhanQuyen;
	private String DiaChi;
	
	public nguoidung()
	{
		
	}
	public String getMaNguoiDung()
	{
		return MaNguoiDung;
	}
	public String getTenNguoiDung()
	{
		return TenNguoiDung;
	}
	public String getPhanQuyen()
	{
		return PhanQuyen;
	}
	public String getSoDienThoai()
	{
		return SoDienThoai;
	}
	public String getDiaChi()
	{
		return DiaChi;
	}

	public void setMaNguoiDung(String MaNguoiDung)
	{
		this.MaNguoiDung = MaNguoiDung;
	}
	public nguoidung(String maNguoiDung, String tenNguoiDung, String soDienThoai, String phanQuyen, String diaChi) {
		super();
		MaNguoiDung = maNguoiDung;
		TenNguoiDung = tenNguoiDung;
		SoDienThoai = soDienThoai;
		PhanQuyen = phanQuyen;
		DiaChi = diaChi;
	}
	public void setTenNguoiDung(String TenNguoiDung)
	{
		this.TenNguoiDung = TenNguoiDung;
	}
	public void setPhanQuyen(String PhanQuyen)
	{
		this.PhanQuyen = PhanQuyen;
	}
	public void setSoDienThoai(String SoDienThoai)
	{
		this.SoDienThoai = SoDienThoai;
	}
	public void setDiaChi(String DiaChi)
	{
		this.DiaChi = DiaChi;
	}	
}