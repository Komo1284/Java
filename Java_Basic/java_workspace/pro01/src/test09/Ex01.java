package test09;

public class Ex01 {

	public static void main(String[] args) {
		String name = "홍길동";	//기본타입(x), 참조타입(o)
		String job = "프로그래머";
		System.out.println(name);
		System.out.println(job);
		
		String str = "나는 \"자바\"를 배웁니다."; // \? => ?의 의미를 제거
		System.out.println(str);
		
		str = "번호\t이름\t직업 ";	// \t => tab만큼 띄우기
		System.out.println(str);
		
		System.out.println("나는\n");		// \n => 개행(다음행)
		System.out.println("자바를\n");
		System.out.println("배웁\r니다."); // \n과 \r은 같은 것
		System.out.println("2배웁\n\r니다.");
		System.out.println("3배웁\r\n니다."); // \r\n은 한번의 개행으로 침
	}

}
