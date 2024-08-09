package day4;

import java.util.Arrays;

public class practice18 {
	public static void main(String[] args) {

		int[] clubs = { 5, 1, 10, 20, 3 };
		for (int i = 0; i < clubs.length; i++) {
			for (int j = i + 1; j < clubs.length; j++) {
				if (clubs[i] > clubs[j]) {
					int temp = clubs[i];
					clubs[i] = clubs[j];
					clubs[j] = temp;
				}

			}
		}
		System.out.println(Arrays.toString(clubs));

	}
}
