package thinking._09_interfaces.RandomDoubles;

public class Test {
	public Test() {
		RandomDoubles rd = new RandomDoubles();
		for (int i = 0; i < 7; i++) {
			System.out.println(rd.next() + " ");
		}
	}
}
