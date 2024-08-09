package Day2;

import java.util.Scanner;

public class practice6 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("nhap ten cua ban");
		String ten = scanner.nextLine();
		System.out.println("nhap diem cua ban: ");
		int diem = scanner.nextInt();
		System.out.println("Sinh vien " + ten + " co diem: " + diem);
		scanner.close();
	}
}
