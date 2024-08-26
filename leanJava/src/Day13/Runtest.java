package Day13;

public class Runtest {
	public static void main(String[] args) {
		System.out.println("runtest");
		SinhVienIT it = new SinhVienIT("java", 11, "loc", 120, 0.2);
		it.infor();
		System.out.println("language it la: " + it.getLanguage());
		SinhVienCoKhi cokhi = new SinhVienCoKhi("hàn", 12, "Minh", 130, 0.3);
		System.out.println("skill co khi la: " + cokhi.getSkill());
	}
}
