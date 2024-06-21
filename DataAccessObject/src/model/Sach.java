package model;

public class Sach {
	private String id;
	private String tenSach;
	private Float giaBan;
	private int namXuatBan;

	public Sach() {

	}

	public Sach(String id, String tenSach, Float giaBan, int namXuatBan) {
		this.setId(id);
		this.setTenSach(tenSach);
		this.setGiaBan(giaBan);
		this.setNamXuatBan(namXuatBan);
	}

	private int getNamXuatBan() {
		return namXuatBan;
	}

	private void setNamXuatBan(int namXuatBan) {
		this.namXuatBan = namXuatBan;
	}

	private Float getGiaBan() {
		return giaBan;
	}

	private void setGiaBan(Float giaBan) {
		this.giaBan = giaBan;
	}

	private String getTenSach() {
		return tenSach;
	}

	private void setTenSach(String tenSach) {
		this.tenSach = tenSach;
	}

	private String getId() {
		return id;
	}

	private void setId(String id) {
		this.id = id;
	}
}
