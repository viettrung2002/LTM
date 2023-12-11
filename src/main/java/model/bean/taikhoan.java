package model.bean;

public class taikhoan {
	private String TenTaiKhoan;
	private String MatKhau;
	private String MaNguoiDung;
	private String TrangThai;
	
	
	public String getTenTaiKhoan() {
		return TenTaiKhoan;
	}


	public void setTenTaiKhoan(String tenTaiKhoan) {
		TenTaiKhoan = tenTaiKhoan;
	}


	public String getMatKhau() {
		return MatKhau;
	}


	public void setMatKhau(String matKhau) {
		MatKhau = matKhau;
	}


	public String getMaNguoiDung() {
		return MaNguoiDung;
	}


	public void setMaNguoiDung(String maNguoiDung) {
		MaNguoiDung = maNguoiDung;
	}


	public String getTrangThai() {
		return TrangThai;
	}


	public void setTrangThai(String trangThai) {
		TrangThai = trangThai;
	}


	public taikhoan(String tenTaiKhoan, String matKhau, String maNguoiDung, String trangThai) {
		super();
		TenTaiKhoan = tenTaiKhoan;
		MatKhau = matKhau;
		MaNguoiDung = maNguoiDung;
		TrangThai = trangThai;
	}


	@Override
	public String toString() {
		return "taikhoan [TenTaiKhoan=" + TenTaiKhoan + ", MatKhau=" + MatKhau + ", MaNguoiDung=" + MaNguoiDung
				+ ", TrangThai=" + TrangThai + "]";
	}


	public taikhoan() {
		// TODO Auto-generated constructor stub
	}
}