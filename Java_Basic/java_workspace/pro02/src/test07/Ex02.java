package test07;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		//당신의 이름을 입력하세요.
		//홍길동
		//당신의 나이를 입력하세요.
		//10
		//당신의 이름은 홍길동 입니다.
		//당신의 나이는 10세 입니다.
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("당신의 이름을 입력하세요.");
		String name = scanner.nextLine();
		System.out.println("당신의 나이를 입력하세요.");
		int age = scanner.nextInt();
		
		System.out.printf("당신의 이름은 %s 입니다.\n", name);
		System.out.printf("당신의 나이는 %d세 입니다.\n", age);
		
		scanner.close();

	}

}
