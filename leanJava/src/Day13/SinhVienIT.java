package Day13;

public class SinhVienIT extends SinhVien {
	private String language;

	public void infor() {
		this.getMoney();
		super.getMoney();
	}

	public void getMoney() {
		System.out.println("SinhVienIT");

	}
}
