package LearnPracticeAboutString;

import java.util.Scanner;

public class RemoveChartString {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap chuoi X");
		String x = scanner.nextLine();
		System.out.println("ban muon xoa ki tu bao nhieu");
		int re = scanner.nextInt();
		System.out.println(removeCharAt(x, re));
		scanner.close();
	}

	public static String removeCharAt(String x, int pos) {
		return x.substring(0, pos) + x.substring(pos + 1);
	}

}
