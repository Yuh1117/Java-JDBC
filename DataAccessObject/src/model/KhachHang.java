package model;

import java.sql.Date;

public class KhachHang {
	private int id;
	private String hoVaTen;
	private Date ngaySinh;
	private String diaChi;

	public KhachHang() {

	}

	public KhachHang(int id, String hoVaTen, Date ngaySinh, String diaChi) {
		this.setId(id);
		this.setHoVaTen(hoVaTen);
		this.setNgaySinh(ngaySinh);
		this.setDiaChi(diaChi);
	}

	private String getDiaChi() {
		return diaChi;
	}

	private void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	private Date getNgaySinh() {
		return ngaySinh;
	}

	private void setNgaySinh(Date ngaySinh) {
		this.ngaySinh = ngaySinh;
	}

	private String getHoVaTen() {
		return hoVaTen;
	}

	private void setHoVaTen(String hoVaTen) {
		this.hoVaTen = hoVaTen;
	}

	private int getId() {
		return id;
	}

	private void setId(int id) {
		this.id = id;
	}

}
