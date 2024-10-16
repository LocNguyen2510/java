package Day13;

public abstract class SinhVien {
	protected int id;
	protected String name;
	protected double price;
	protected double tax;

	abstract void tinhDiem();

	public double priceTax() {
		return this.price * this.tax;
	}

	public void getMoney() {
		System.out.println("SinhVien");
	}

	public SinhVien(int id, String name, double price, double tax) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.tax = tax;

	}
}
