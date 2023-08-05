package test05;

public class Ex03 {
	public static void main(String[] args) {
		
		long var1 = 10; 			//자동타입 변환(int)
		long var2 = 20L; 			//값이 long
	//	long var3 = 1000000000000; 	//컴파일러는 int로 간주하기 때문에 에러 발생
		long var4 = 1000000000000L; //값자체를 자바에서는 Literal 이라고한다.
		long var5 = 1_000_000;
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var4);
		System.out.println(var5);
	}

}
