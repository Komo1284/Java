package test10;

public class Counter2 {
	static int count = 0;
	
	Counter2() {
		this.count++;
		System.out.println(this.count);
	}
	
	public static void main(String[] args) {
		Counter2 c1 = new Counter2();
		Counter2 c2 = new Counter2();

	}

}