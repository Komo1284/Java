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
		System.out.println("a와b를 더한 값: " + add(10,2));
		System.out.println("a와b를 뺀 값: " + sub(10,2));
		System.out.println("a와b를 곱한 값: " + mul(10,2));
		System.out.println("a와b를 나눈 값: " + div(10,2));

	}

}
