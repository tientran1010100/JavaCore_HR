package project3;

public class Department {
	private String maBP;
	private String tenBP;
	private int soNV;

	public Department(String maBP, String tenBP) {
		super();
		this.maBP = maBP;
		this.tenBP = tenBP;

	}

	public String getMaBP() {
		return maBP;
	}

	public void setMaBP(String maBP) {
		this.maBP = maBP;
	}

	public String getTenBP() {
		return tenBP;
	}

	public void setTenBP(String tenBP) {
		this.tenBP = tenBP;
	}

	public int getSoNV() {
		return soNV;
	}

	public void setSoNV(int soNV) {
		this.soNV = soNV;
	}

	public String toString() {
		return "ma bo phan la: " + getMaBP() + ", Ten bo phan: " + getTenBP() + ", so nhan vien la: " + getSoNV();

	}

//them 1 nv
	public void themNV() {
		this.soNV += 1;
	}

	public void inBP() {
		System.out.println("ma bo phan la: " + this.getMaBP() + ", Ten bo phan: " + this.getTenBP()
				+ ", so nhan vien la: " + this.getSoNV());
	}

}