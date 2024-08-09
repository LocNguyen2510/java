package day4;

import java.util.Arrays;

public class practice16 {
	public static void main(String[] args) {
		String[] cars = { "bmw", "Volvo", "Mec", "KIA", "Toyota" };
		for (int i = 0; i < cars.length; i++) {
			System.out.println(cars[i]);

		}
		int[] clubs = { 5, 1, 10, 20, 3 };
		System.out.println(clubs);
		Arrays.sort(clubs);
		System.out.println(Arrays.toString(clubs));
	}
}
