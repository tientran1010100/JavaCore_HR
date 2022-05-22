package project3;
public abstract class Staff implements Comparable<Staff>{
@Override
// dung interface collections sort luong
	public int compareTo(Staff o) {
		// TODO Auto-generated method stub
		return (int) (luong -o.luong);
	}

	private String maNV;
	private String tenNV;
	private int tuoiNV;
	private double hsLuong;
	private String ngayVao;
	private String bpLamviec;
	private int ngayNghi;
	private int luong;

	abstract void displayInformation();
	public String getMaNV() {
		return maNV;
	}
	public void setMaNV(String maNV) {
		this.maNV = maNV;
	}
	public String getTenNV() {
		return tenNV;
	}
	public void setTenNV(String tenNV) {
		this.tenNV = tenNV;
	}
	public int getTuoiNV() {
		return tuoiNV;
	}
	public void setTuoiNV(int tuoiNV) {
		this.tuoiNV = tuoiNV;
	}
	public double getHsLuong() {
		return hsLuong;
	}
	public void setHsLuong(double hsLuong) {
		this.hsLuong = hsLuong;
	}
	public String getNgayVao() {
		return ngayVao;
	}
	public void setNgayVao(String ngayVao) {
		this.ngayVao = ngayVao;
	}
	public String getBpLamviec() {
		return bpLamviec;
	}
	public void setBpLamviec(String bpLamviec) {
		this.bpLamviec = bpLamviec;
	}
	public int getNgayNghi() {
		return ngayNghi;
	}
	public void setNgayNghi(int ngayNghi) {
		this.ngayNghi = ngayNghi;
	}
	public int getLuong() {
		return luong;
	}
	public void setLuong(int luong) {
		this.luong = luong;
	};
	
}
