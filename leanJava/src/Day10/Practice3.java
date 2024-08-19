package Day10;

import java.util.Scanner;

public class Practice3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Practice2 in = new Practice2();

		for (int i = 0; i <= 4; i++) {
			Practice2 pr = in.tim(null, 0);
			System.out.println("nhap ten ");
			String na = scanner.nextLine();
			in.setName(na);
			System.out.println("nhap id ");
			int idt = scanner.nextInt();
			in.setId(idt);
			System.out.println(in.toString());
		}

	}
}
