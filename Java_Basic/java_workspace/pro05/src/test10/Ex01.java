package test10;

public class Ex01 {

	public static int add(int a, int b) {
		return a+b;
	}
	
	public static int sub(int a, int b) {
		return a-b;
	}
	
	public static int mul(int a, int b) {
		return a*b;
	}
	
	public static int div(int a, int b) {
		return a/b;
	}
	
	public static void main(String[] args) {
		System.out.println("a��b�� ���� ��: " + add(10,2));
		System.out.println("a��b�� �� ��: " + sub(10,2));
		System.out.println("a��b�� ���� ��: " + mul(10,2));
		System.out.println("a��b�� ���� ��: " + div(10,2));

	}

}
