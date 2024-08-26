package Day13;

public class SinhVienIT extends SinhVien {
	private String language;

	public SinhVienIT(String language, int id, String name, double price, double tax) {
		super(id, name, price, tax);
		this.language = language;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public void infor() {
		this.getMoney();
		super.getMoney();
	}

	public void getMoney() {
		System.out.println("SinhVienIT");

	}
}
