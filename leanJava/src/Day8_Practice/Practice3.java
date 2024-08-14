package Day8_Practice;

public class Practice3 {
	private String ten;
	private double diemToan;
	private double diemVan;

	public Practice3() {

	}

	public Practice3(String ten, double diemToan, double diemVan) {
		this.ten = ten;
		this.diemToan = diemToan;
		this.diemVan = diemVan;
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public double getDiemToan() {
		return diemToan;
	}

	public void setDiemToan(double diemToan) {
		this.diemToan = diemToan;
	}

	public double getDiemVan() {
		return diemVan;
	}

	public void setDiemVan(double diemVan) {
		this.diemVan = diemVan;
	}

	public Practice3 nhapThongTin(String ten, double diemToan, double diemVan) {
		Practice3 pr = new Practice3(ten, diemToan, diemVan);
		return pr;

	}

	public void xuatThongTin(Practice3 pr) {
		System.out.println("Ten Hoc Sinh La: " + pr.ten);
		System.out.println("Diem Toan Hoc Sinh La: " + pr.diemToan);
		System.out.println("Diem Van Hoc Sinh La: " + pr.diemVan);
	}

	public double xepHang(double diemToan, double diemVan) {
		return (diemToan + diemVan) / 2;
	}
}