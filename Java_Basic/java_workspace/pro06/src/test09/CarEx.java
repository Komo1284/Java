package test09;

public class CarEx {

	public static void main(String[] args) {
		//���� �޼ҵ� ȣ��
		Car.simulate();
		
		//��ü����
		Car myCar = new Car();
		//�ν��Ͻ� ��� ���
		myCar.speed = 60;
		myCar.run();

	}

}
