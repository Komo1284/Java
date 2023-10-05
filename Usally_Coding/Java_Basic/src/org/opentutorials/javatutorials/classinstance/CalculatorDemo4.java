package org.opentutorials.javatutorials.classinstance;

class C1{
	static int static_variable = 1;
	int instance_variable =2;
	static void static_static() {
		System.out.println(static_variable);
	}
	static void static_instance() {
		// 클래스 메소드에서는 인스턴스 변수에 접근 할 수 없다.
		//System.out.println()
	}
}

public class CalculatorDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
