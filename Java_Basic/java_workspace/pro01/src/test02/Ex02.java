package test02;

public class Ex02 {
	public static void main(String[] args) {
		
		long sum = 0;
		long a = 100;
		for (int i=1; i<=30; i++) {
			sum += a;
			a = a + a;
			System.out.println(i+"일차 금액은 "+sum+"원");
		}
		
	}

}
 //유튜브에서 투자관련 영상보는데 10억을 받을래?
 // 첫날 100원 2일차에는 200원 3일차는 400원처럼 다음날되면 배로 받을수있는걸 받을래?
 // 라는걸보고 30일차때 1000억이 된다고 해서 실제로 계산해보고 싶어서 만든 식