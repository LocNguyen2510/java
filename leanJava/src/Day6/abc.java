package Day6;

public class abc {
	int sum(int a, int b) {
		return a + b;
	}

	public static void main(String[] args) {
		System.out.println("Run main");
		Student loc = new Student();
		loc.name = "Loc";
		loc.age = 25;
		System.out.println("Student with name: " + loc.name + " Age : " + loc.age);
		abc test = new abc();
		int a = test.sum(5, 9);
		System.out.println("check sum: " + a);
	}
}
