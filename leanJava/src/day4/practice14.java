package day4;

import java.util.Arrays;

public class practice14 {
	public static void main(String[] args) {
		String[] club = { "Banh", "keo", "com" };
		System.out.println("chuoi string la: " + Arrays.toString(club));
		club[0] = "An vat";
		System.out.println("chuoi string 1 la: " + club[0]);
		System.out.println("chuoi string la: " + Arrays.toString(club));

	}
}
