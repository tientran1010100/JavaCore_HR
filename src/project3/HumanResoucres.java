package project3;

import java.text.NumberFormat;  
import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;
import java.util.Scanner;

public class HumanResoucres {
	public static Scanner sc;

	static ArrayList<Staff> nvArr = new ArrayList<Staff>();
	static ArrayList<Department> bpArr = new ArrayList<Department>();

	/**
	 *  vong lap chon lai chuogn trinh
	 * @return true: chay lai
	 * false thi ket thuc ct
	 */
	public static boolean continueOrNot() {
		sc = new Scanner(System.in);

		System.out.println("Ban co muon tim thong tin khac khong ? (y/n)");
		String temp1 = sc.nextLine();
		if (temp1.equalsIgnoreCase("yes") || temp1.equalsIgnoreCase("y")) {

			return true;
		} else {

			System.out.println("KET THUC CHUONG TRINH");

			return false;
		}
	};


	// (4) nhap nhan vien moi
	/**
	 * nhap cac thong tin nv dung Scanner
	 * tung nv vao nvArr
	 * loop bpArr, them nv vao bo phan dung .themNV()
	 */
	public static void nhapNV() {
		boolean check = false;
		do {
			System.out.println("nhap thong tin nhan vien: 1. nhan vien, 2. quan ly");
			int temp = sc.nextInt();
			sc.nextLine();

			if (temp == 1) {
				// code nhap nhan vien
				check = true;
				System.out.println(
						"nhap thong tin nhan vien: ma NV, ten NV, tuoi NV, HSL, ngay vao, bo phan, so ngay nghi phep, gio lam them");
				System.out.println("#ma NV#");
				String maNV = sc.nextLine();
				System.out.println("#ten NV#");
				String tenNV = sc.nextLine();

				System.out.println("#tuoi#");
				int tuoiNV = sc.nextInt();
				sc.nextLine();
				System.out.println("#HSL#");
				double hsL = sc.nextDouble();
				sc.nextLine();
				System.out.println("#ngay vao#");
				String ngayVao = sc.nextLine();
				System.out.println("#bo phan (Ke toan/ban hang/bao ve/IT)#");
				String bpLamviec = sc.nextLine();
				System.out.println("#ngay  nghi#");
				int ngayNghi = sc.nextInt();
				System.out.println("#gio lam them#");
				int gioLamThem = sc.nextInt();

				Employee tempNV = new Employee(maNV, tenNV, tuoiNV, hsL, ngayVao, bpLamviec, ngayNghi, gioLamThem);
				tempNV.displayInformation();
				nvArr.add(tempNV);
				for (int j = 0; j < bpArr.size(); j++) {
					if (bpArr.get(j).getTenBP().equalsIgnoreCase(bpLamviec)) {
						bpArr.get(j).themNV();
					}
					;
				}
				;

			} else if (temp == 2) {
				// code nhap quan ly
				// co them chuc danh
				check = true;
				System.out.println(
						"nhap thong tin nhan vien: ma NV, ten NV, tuoi NV, HSL, ngay vao, bo phan, so ngay nghi phep, chuc danh");
				System.out.println("#ma NV#");
				String maNV = sc.nextLine();
				System.out.println("#ten NV#");
				String tenNV = sc.nextLine();
				System.out.println("#tuoi#");
				int tuoiNV = sc.nextInt();
				System.out.println("#HSL#");
				double hsL = sc.nextDouble();
				System.out.println("#ngay vao#");
				String ngayVao = sc.next();
				System.out.println("#bo phan (Ke toan/ban hang/bao ve/IT)#");
				sc.nextLine();
				String bpLamviec = sc.nextLine();
				System.out.println("#ngay  nghi#");
				int ngayNghi = sc.nextInt();
				sc.nextLine();
				System.out.println("#chuc  danh#");
				String chucDanh = sc.nextLine();

				Manager tempQL = new Manager(maNV, tenNV, tuoiNV, hsL, ngayVao, bpLamviec, ngayNghi, chucDanh);
				tempQL.displayInformation();
				nvArr.add(tempQL);
				for (int j = 0; j < bpArr.size(); j++) {
					if (bpArr.get(j).getTenBP().equalsIgnoreCase(bpLamviec)) {
						bpArr.get(j).themNV();
					}
					;
				}
				;
			}
		} while (check == false);

	}
	// (9) tim luong cu the

	//public static void displayLuong(ICalculator i) {
	//	System.out.println(i.calculateSalary());
	//}

	// (1) in ds nhan vien hien co ok
	/**
	 * loop nvArr in tat ca nv dung .displayInformation()
	 */
	public static void inDSNV() {
		System.out.println("Cac nhan vien trong cong ty la:");
		for (int i = 0; i < nvArr.size(); i++) {
			nvArr.get(i).displayInformation();

		}
	}

	// (5) tim nhan vien theo ten hoac ma nv ok
	/**
	 * them checkNV (T/F) de thong bao co nv nhu yeu cau ko
	 * user dien thong tin
	 * loop nvArr de tim 
	 * in ra nhan vien can tim dung .displayInformation()
	 */
	public static void timNV() {
		boolean check = false; // chi nhap duoc so 1 hoac 2
		boolean checkNV = false; // neu co nv thì true
		do {
			System.out.println("Tim nhan vien theo: 1. Ten, 2. Ma nhan vien.");
			int temp = sc.nextInt();
			sc.nextLine();
			if (temp == 1) {
				check = true;

				System.out.println("Nhap Ten nhan vien: ");
				String checkTen = sc.nextLine();
				for (int i = 0; i < nvArr.size(); i++) {
					if (checkTen.equalsIgnoreCase(nvArr.get(i).getTenNV())) {
						nvArr.get(i).displayInformation();
						checkNV = true;
					}
				}
				;
				if (checkNV == false) {
					System.out.println("Khong co nhan vien nhu thong tin");
				}

			} else if (temp == 2) {
				check = true;

				System.out.println("Nhap ma nhan vien: ");
				String checkID = sc.nextLine();
				for (int i = 0; i < nvArr.size(); i++) {
					if (checkID.equalsIgnoreCase(nvArr.get(i).getMaNV())) {
						nvArr.get(i).displayInformation();
						checkNV = true;
					}
				}
				;
				if (checkNV == false) {
					System.out.println("Khong co nhan vien nhu thong tin");
				}
			}
		} while (check == false);
	}

	// (6) in bang luong toan cty ok
	public static void inBangLuongCty() {
		int tongLuong = 0;
		for (int i = 0; i < nvArr.size(); i++) {
			tongLuong += nvArr.get(i).getLuong();

		}

		System.out.println("Tong luong cong ty bang so la: " + tongLuong);
		System.out.println("Tong luong cong ty bang chu la: " + tongLuong / 1000000 + " trieu dong");
	}

	// (2) in cac bo phan trong cty ok
	/**
	 * loop arraylist bpArr in ra tung ten bp dung .toString()
	 */
	public static void inCacBoPhan() {

		for (int i = 0; i < bpArr.size(); i++) {
			System.out.println(bpArr.get(i).toString());
		}
	}

	// (3) in nhan vien theo bo phan ok
	/**
	 * net loop de so sanh bo phan
	 * in ra tung bo phan
	 * in ra tung nhan vien trong pb do dung .displayInformation()
	 */
	public static void inNVTheoBP() {
		// System.out.println(bpArr.size());
		for (int i = 0; i < bpArr.size(); i++) {
			System.out.println(bpArr.get(i).getTenBP() + ":");
			for (int j = 0; j < nvArr.size(); j++) {

				if (bpArr.get(i).getTenBP().equalsIgnoreCase(nvArr.get(j).getBpLamviec())) {
					nvArr.get(j).displayInformation();
				}
			}
			;

		}

	}

	// (7) sort theo tien luong tang dan
	/**
	 * sort dung interface collections.sort()
	 * in ra tung nhan vien dung .displayInformation()
	 */
	public static void sortLuongUp() {
		Collections.sort(nvArr);
		for (int i = 0; i < nvArr.size(); i++) {
			nvArr.get(i).displayInformation();
		}

	}

	// (8) sort theo tien luong giam dan :
	/**
	 * dung collections.sort reverseOrder
	 * in ra tung nv dung .displayInformation()
	 */
	public static void sortLuongDown() {
		
		Collections.sort(nvArr, Collections.reverseOrder());
		for (int i = 0; i < nvArr.size(); i++) {
			nvArr.get(i).displayInformation();
		}
	}

	// (0)dummy data/////////////////////////////////////////////////////
	/**
	 * them 5 NV ngau nhien
	 * tao new employee va them vao nvArr
	 * loop bpLamviec de them nv vao bo phan dung .themNV() 
	 * 
	 */
	public static void addDummyData() {
		Employee e1 = new Employee("nv1", "Nguyen van A", 25, 1.6, "2018", "IT", 3, 10);
		Employee e2 = new Employee("nv2", "Tran van B", 21, 1.2, "2018", "ke toan", 2, 9);
		Employee e3 = new Employee("nv3", "Do van C", 22, 1.4, "2018", "ban hang", 2, 8);
		Employee e4 = new Employee("nv4", "Ly van D", 28, 1.1, "2018", "bao ve", 2, 7);
		Manager m1 = new Manager("nv5", "Le van E", 27, 1.5, "2010", "ban hang", 4, "project leader");
		nvArr.add(e1);
		nvArr.add(e2);
		nvArr.add(e3);
		nvArr.add(e4);
		nvArr.add(m1);
		System.out.println("Da them " + nvArr.size() + " nhan vien");

		for (int i = 0; i < nvArr.size(); i++) {

			for (int j = 0; j < bpArr.size(); j++) {
				if (nvArr.get(i).getBpLamviec().equalsIgnoreCase(bpArr.get(j).getTenBP())) {
					bpArr.get(j).themNV();
				}
				;
			}
			;

		}
		;
	}
	////////////////////////////////////////////////////////////////

	/////////////////// MAIN PROGRAM/////////////////////////
	public static void main(String[] args) {
		// NumberFormat currentLocale = NumberFormat.getInstance();
		// Locale localeVN =new Locale("vn","VN");
		// NumberFormat vn = NumberFormat.getInstance(localeVN);

		Department ketoan = new Department("BP1", "ke toan");
		Department banhang = new Department("BP2", "ban hang");
		Department baove = new Department("BP3", "bao ve");
		Department it = new Department("BP4", "IT");
		bpArr.add(ketoan);
		bpArr.add(banhang);
		bpArr.add(baove);
		bpArr.add(it);

		System.out.println("##################################");
		System.out.println("## CHUONG TRINH QUAN LY NHAN SU ##");
		System.out.println("##################################");
		System.out.println("##################################");

		do {

			System.out.println("Lua chon chuong trinh: ");
			System.out.println("1. in danh sach nhan vien hien co:");
			System.out.println("2. in cac bo phan trong cong ty: ");
			System.out.println("3. in cac nhan vien theo tung bo phan: ");
			System.out.println("4. them nhan vien moi: ");
			System.out.println("5. tim thong tin nhan vien theo ten/ma nhan vien: ");
			System.out.println("6. in bang luong toan cong ty: ");
			System.out.println("7. bang luong nhan vien theo thu tu tang dan: ");
			System.out.println("8. bang luong nhan vien theo thu tu giam dan: ");
			System.out.println("0. them vai nhan vien vi du: ");

			sc = new Scanner(System.in);
			int chonCT = sc.nextInt();
			switch (chonCT) {
			case 1:
				inDSNV();
				break;
			case 2:
				inCacBoPhan();
				break;
			case 3:
				inNVTheoBP();
				break;
			case 4:
				nhapNV();
				break;
			case 5:
				timNV();
				break;
			case 6:
				inBangLuongCty();
				break;
			case 7:
				sortLuongUp();
				break;
			case 8:
				sortLuongDown();
				break;
			case 0:
				addDummyData();
				sc.nextLine();

			}
			;
		} while (continueOrNot());

	}
}
