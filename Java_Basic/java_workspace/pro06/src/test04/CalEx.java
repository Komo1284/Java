package test04;

public class CalEx {

	public static void main(String[] args) {
		//객체생성
		Calculator myCalcu = new Calculator();
		
		//정사각형의 넓이 구하기
		double result1 = myCalcu.areaRectangle(10);
		
		//직사각형의 넓이 구하기
		double result2 = myCalcu.areaRectangle(10,20);
		
		System.out.println("정사각형 넓이=" + result1);
		System.out.println("직사각형 넓이=" + result2);

	}

}
