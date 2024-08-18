package Day9;

import java.util.ArrayList;
import java.util.Scanner;

public class Practice2 {
	public static void main(String[] args) {
		ArrayList<Double> p2 = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("Nhập số cần tính");
			Double x = scanner.nextDouble();
			p2.add(x);
			scanner.nextLine();
			System.out.println("bạn có muốn nhập thêm? (y/n)");
			String option = scanner.nextLine();
			if (option.equals("N") || option.equals("n")) {
				break;
			}
		}
		double sum = 0;
		for (int i = 0; i < p2.size(); i++) {
			sum = sum + p2.get(i);
		}
		System.out.println("Check: " + p2.toString());
		System.out.println("Tổng là : " + sum);

	}
}
