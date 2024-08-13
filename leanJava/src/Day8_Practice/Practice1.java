package Day8_Practice;

public class Practice1 {
	private double price;
	private double tax;
	private String name;

	public Practice1() {
	}

	public Practice1(String name, double price, double tax) {
		this.name = name;
		this.price = price;
		this.tax = tax;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Practice1 nhapThongTin(String name, double price, double tax) {
		Practice1 pr = new Practice1(name, price, tax);
		return pr;
	}

	public void xuatThongTin(Practice1 pr) {
		System.out.println("Tên Sản Phẩm là : " + pr.getName());
		System.out.println("Giá Sản Phẩm là : " + pr.getPrice());
		System.out.println("Thuế Sản Phẩm là : " + pr.getTax());
	}

	public double getTaxPrice(double price, double tax) {
		return price * tax;
	}

//	public static void main(String[] args) {
//
//		System.out.println("run Practice");
//
//	}

}