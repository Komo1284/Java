package test03;

public class Ex07 {

	public static void main(String[] args) {
		String subject = "�ڹ� ���α׷���";
		
		int location = subject.indexOf("���α׷���");
		System.out.println(location);
		String substring = subject.substring(location);
		System.out.println(substring);
		//--------------------------------------------------
		location = subject.indexOf("�ڹ�");
		if(location != -1) {
			System.out.println("�ڹٿ� ���õ� å�̱���.");
		} else {
			System.out.println("�ڹٿ� ���� ���� å�̱���.");
		}

	}

}
