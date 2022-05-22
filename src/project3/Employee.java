package project3;
public class Employee extends Staff implements ICalculator {
	private int gioLamThem;
	
	
	public int getgioLamThem() {
		return gioLamThem;}
	public void setgioLamThem(int gioLamThem) {
		this.gioLamThem = gioLamThem;}
	//constructor
	public Employee(int gioLamThem){		
		this.gioLamThem=gioLamThem;
	}
	public Employee(String maNV, String tenNV, int tuoiNV,double hsLuong,String ngayVao,String bpLamviec,int ngayNghi, int gioLamThem) {
		super.setMaNV(maNV);
		super.setTenNV(tenNV);
		super.setTuoiNV(tuoiNV);
		super.setHsLuong(hsLuong);
		super.setNgayVao(ngayVao);
		super.setBpLamviec(bpLamviec);
		super.setNgayNghi(ngayNghi);
		this.setgioLamThem(gioLamThem);
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
		System.out.print("So gio lam them: "+this.getgioLamThem()+". ");
		System.out.print("Luong nhan vien: "+super.getLuong()+". \n");

	}
	//method
	/** Ham tinh luong
	 * ref:........
	 * return luong
	 */ 
	
	public double calculateSalary() {
		
		super.setLuong((int) (super.getHsLuong()*LCB_NV+this.gioLamThem*LLT_NV));
		
		return super.getLuong();
	}

	
}