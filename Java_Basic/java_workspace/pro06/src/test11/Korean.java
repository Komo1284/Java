package test11;

public class Korean {
	//인스탠스 final 필드 선언
	final String nation = "대한민국";
	final String ssn;
	
	//인스탠스 필드 선언
	String name;
	
	//생성자 선언
	public Korean(String ssn, String name) {
		this.ssn = ssn;
		this.name = name;
	}
}
