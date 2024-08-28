package Day14;

class Animal {
	void eat() {
		System.out.println("animal eating");
	}
}

class Dog extends Animal {
	void eat() {
		System.out.println("Dog eating");
	}
}

class babyDog extends Dog {
	void eat() {
		System.out.println("BabyDog eating");
	}
}

public class Practice1 {
	public static void main(String[] args) {
		Animal a = new babyDog();
		a.eat();
	}

}
