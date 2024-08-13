package Day8_Practice;

public class Practice2 {
	public static void main(String[] args) {
		System.out.println("run Practice2");
		Practice1 test = new Practice1();
		Practice1 pr1 = test.nhapThongTin("computer", 150, 0.2);
		test.xuatThongTin(pr1);
		System.out.println("tax = " + test.getTaxPrice(pr1.getPrice(), pr1.getTax()));
	}
}
