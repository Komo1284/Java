package test03;

public class CarEx {

	public static void main(String[] args) {
		//Car ��ü ����
		Car myCar = new Car();
		
		//���ϰ��� ���� setGas() �޼ҵ� ȣ��
		myCar.setGas(5);
		
		//isLeftGas() �޼ҵ带 ȣ���ؼ� ���� ���ϰ��� true
		if(myCar.isLeftGas()) {
			System.out.println("����մϴ�.");
			
			//���ϰ��� ���� run() �޼ҵ� ȣ��
			myCar.run();
		}
		
		System.out.println("gas�� �����ϼ���.");

	}

}
