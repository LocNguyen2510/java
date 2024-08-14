package Day8_Practice;

public class Practice4 {
	public static void main(String[] args) {
		Practice3 in = new Practice3();
		Practice3 pr = in.nhapThongTin("Dinh Loc", 7.5, 2.3);
		in.xuatThongTin(pr);
		in.xepHang(pr.getDiemToan(), pr.getDiemVan());
		if (in.xepHang(pr.getDiemToan(), pr.getDiemVan()) < 5) {
			System.out.println("Khong dat tieu chuan len lop");
		} else {
			System.out.println("Duoc len lop");
		}
	}
}
