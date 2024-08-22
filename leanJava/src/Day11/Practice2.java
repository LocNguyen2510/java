package Day11;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Practice2 {
	public static void main(String[] args) {
		Pattern pattern = Pattern.compile("\\d{12}");
		Matcher matcher = pattern.matcher("123123123123");
		System.out.println("Ket qua: " + matcher.matches());
		System.out.println("du lieu: " + matcher);
	}
}
