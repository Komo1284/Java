package test09;

public class CarEx {

	public static void main(String[] args) {
		//정적 메소드 호출
		Car.simulate();
		
		//객체생성
		Car myCar = new Car();
		//인스턴스 멤버 사용
		myCar.speed = 60;
		myCar.run();

	}

}
