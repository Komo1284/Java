package org.opentutorials.javatutorials.array;

public class ForeachDemo {

	public static void main(String[] args) {
		String[] members = { "서강혁", "서강민", "김지연", "최현정", "대용환" };
		for (String e : members) {
			System.out.println(e + "이 상담을 받았습니다.");
		}

	}

}
