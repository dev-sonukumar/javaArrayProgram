package methos;

public class MethodClass {
	int age = 24;

	static void MethodClass() {
		System.out.println();
		System.out.println("i am constructor");
	}

	public static void main(String[] args) {
		MethodClass m = new MethodClass();
		System.out.println("Main Method");

//		System.out.println(m.age);
		m.MethodClass();
	}

}
