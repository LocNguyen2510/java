package Day11;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Practice3 {
	public static void main(String[] args) {
		Pattern pattern = Pattern.compile("^[A-Z a-z 0-9._%+-]+@[A-Z a-z 0-9.-]+\\.[A-Z a-z]{2,6}$");
		Matcher matcher = pattern.matcher("nguyenloc12@gmail.com");
		System.out.println("Ket qua: " + matcher.matches());
	}
}
