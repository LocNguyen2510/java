package Day15;

public class RunSinhVien {
	public static void main(String[] args) {
//		int id, String name, String language, double scoreJava, double scoreHTML		
		SinhVienIT it = new SinhVienIT(12, "loc", "Java", 7, 9);

		System.out.println("Diem So Sinh Vien " + it.name + " la: " + it.getDiem());
		SinhVienCoKhi ck = new SinhVienCoKhi(13, "minh", "hàn", 8, 5);
		System.out.println("Diem So Sinh Vien " + ck.name + " la: " + ck.getDiem());
	}
}
