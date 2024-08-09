package Day2;

import java.util.Scanner;

public class practice5 {
	public static void main(String[] agrs) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap so A can so sanh");
		int a = scanner.nextInt();
		System.out.println("Nhap so B can so sanh");
		int b = scanner.nextInt();
		int c = Math.max(a, b);
		System.out.println("So lon nhat la: " + c);
		scanner.close();
	}

}
