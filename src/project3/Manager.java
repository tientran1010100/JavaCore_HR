package project3;

public class Manager extends Staff implements ICalculator  {
	private String chucDanh;
	public String getChucDanh() {
		return chucDanh;}
	public void setChucDanh(String chucDanh) {
		this.chucDanh = chucDanh;}
	
	
	public Manager(String chucDanh) {
		this.chucDanh=chucDanh;
	}
	public Manager(String maNV, String tenNV, int tuoiNV,double hsLuong,String ngayVao,String bpLamviec,int ngayNghi,String chucDanh) {
		super.setMaNV(maNV);
		super.setTenNV(tenNV);
		super.setTuoiNV(tuoiNV);
		super.setHsLuong(hsLuong);
		super.setNgayVao(ngayVao);
		super.setBpLamviec(bpLamviec);
		super.setNgayNghi(ngayNghi);
		this.setChucDanh(chucDanh);
		calculateSalary();
	}
	@Override
	void displayInformation() {
		// TODO Auto-generated method stub
		System.out.print("Ma nhan vien: "+this.getMaNV()+". ");
		System.out.print("Ten nhan vien: "+this.getTenNV()+". ");
		System.out.print("Tuoi nhan vien: "+this.getTuoiNV()+". ");
		System.out.print("He so luong: "+this.getHsLuong()+". ");
		System.out.print("Ngay vao lam: "+this.getNgayVao()+". ");
		System.out.print("Bo phan: "+this.getBpLamviec()+". ");
		System.out.print("So ngay nghi phep: "+this.getNgayNghi()+". ");
		System.out.print("Chuc danh: "+ this.chucDanh+". ");
		System.out.print("Luong nhan vien: "+super.getLuong()+". \n");

	}
	
	public double calculateSalary() {
		int luongTN = 0;
		if(getChucDanh().equalsIgnoreCase("Business Leader")) {
			luongTN= TN_BUSI;
		} else if(getChucDanh().equalsIgnoreCase("Project Leader")) {
			luongTN = TN_PROJ;
		} else if(getChucDanh().equalsIgnoreCase("Technical Leader")) {
			luongTN= TN_TECH;
		}
		super.setLuong((int) (super.getHsLuong()*LCB_QL+luongTN));
		return super.getLuong();
	}

}
