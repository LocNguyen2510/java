package Day6;

public class bcd {
	public static void main(String[] args) {
		Student st1 = new Student();
		Student st2 = new Student("loc", 25);
		System.out.println("Tên học sinh là : " + st2.name + "\nTuổi là : " + st2.age);
		Student st3 = new Student("Nguyen", 28, "@gmail.com");
		System.out.println("Họ của học sinh là: " + st3.firstName);
	}
}
