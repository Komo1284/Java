package test05;

public class Ex11 {

	public static void main(String[] args) {
		int num = (int)(Math.random()*6)+1;
		
		for (int i=1; i<=6; i++) {
			if (num == i) {
				System.out.printf("%d번이 나왔습니다.\n",i);
			}
		}

	}

}
