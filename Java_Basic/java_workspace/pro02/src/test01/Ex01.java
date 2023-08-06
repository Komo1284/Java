package test01;

public class Ex01 {

	public static void main(String[] args) {
		
		byte byteValue = 10;	//리터럴(Literal) = 값자체를 의미함
		int intValue = byteValue;	//byte -> int 자동 타입 변환
		System.out.println("intValue: " + intValue);
		
		char charValue = '가';
		intValue = charValue;	//char -> int 자동 타입 변환
		System.out.println("가의 유니코드: " + intValue);
		
		intValue = 50;
		long longValue = intValue;	//int -> long 자동 타입 변환
		System.out.println("longValue: " + longValue);
		
		intValue = 100;
		float floatValue = longValue;	//long -> float 자동 타입 변환
		System.out.println("floatValue: " + floatValue);
		
		floatValue = 100.5f;
		double doubleValue = floatValue;	//float -> double 자동 타입 변환
		System.out.println("doubleValue: " + doubleValue);
		

	}

}
