package test01;

public class CalEx {

	public static void main(String[] args) {
		//Calculator ��ü ����
		Calculator myCalc = new Calculator();
		
		//���ϰ��� ���� powerOn() �޼ҵ� ȣ��
		myCalc.powerOn();
		
		//plus �޼ҵ� ȣ�� �� 5��6�� �Ű������� �����ϰ�,
		//���� ����� ���� �޾� result1 ������ ����
		int result1 = myCalc.plus(5,6);
		System.out.println("result1: " + result1);
		
		int x = 10;
		int y = 4;
		//divide() �޼ҵ� ȣ�� �� ���� x�� y�� ���� �Ű������� �����ϰ�,
		//������ ����� ���� �޾� result2 ������ ����
		double result2 = myCalc.divide(x, y);
		System.out.println("result2: " + result2);
		
		//���ϰ��� ���� powerOff() �޼ҵ� ȣ��
		myCalc.powerOff();

	}

}
