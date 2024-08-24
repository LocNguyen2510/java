package Day13;

public class SinhVien {
	protected int id;
	protected String name;
	protected double price;
	protected double tax;
	protected double prtx;

	public void priceTax() {
		prtx = price * tax;
		return;
	}

	public void getMoney() {
		System.out.println("SinhVien");
	}
}
