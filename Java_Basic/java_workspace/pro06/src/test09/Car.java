package test09;

public class Car {
	//�ν��Ͻ� �ʵ� ����
	int speed;
	
	//�ν��Ͻ� �޼ҵ� ����
	void run() {
		System.out.println(speed + "���� �޸��ϴ�.");
	}
	
	static void simulate() {
		//��ü ����
		Car myCar = new Car();
		//�ν��Ͻ� ��� ���
		myCar.speed = 200;
		myCar.run();
	}
}
