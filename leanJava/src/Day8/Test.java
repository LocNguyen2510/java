package Day8;

public class Test {
	public static void main(String[] args) {
		System.out.println("Run test ");
		Student st1 = new Student();
		Student st2 = new Student("Loc", 23);
		st2.setName("Minh");
		System.out.println("ten la: " + st2.getName() + " tuoi la " + st2.getAge());
	}
}
