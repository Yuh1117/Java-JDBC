package DataAccessObject_PreparedStatement.model;

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

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTenSach() {
		return tenSach;
	}

	public void setTenSach(String tenSach) {
		this.tenSach = tenSach;
	}

	public Float getGiaBan() {
		return giaBan;
	}

	public void setGiaBan(Float giaBan) {
		this.giaBan = giaBan;
	}

	public int getNamXuatBan() {
		return namXuatBan;
	}

	public void setNamXuatBan(int namXuatBan) {
		this.namXuatBan = namXuatBan;
	}

	@Override
	public String toString() {
		return "Sach [id=" + id + ", tenSach=" + tenSach + ", giaBan=" + giaBan + ", namXuatBan=" + namXuatBan + "]";
	}
	
}
