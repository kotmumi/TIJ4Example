package thinking._05_initialization.StaticInitialization;

public class Cupboard {
	Bowl bowl3 = new Bowl(3);
	static Bowl bowl4 = new Bowl(4);

	public Cupboard() {
		System.out.println("Cupboard()");
		bowl4.f1(2);
	}

	public void f3(int marker) {
		System.out.println("f3(" + marker + ")");
	}

	static Bowl bowl5 = new Bowl(5);

}
