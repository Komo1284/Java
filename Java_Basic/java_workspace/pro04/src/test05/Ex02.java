package test05;

public class Ex02 {

	public static void main(String[] args) {
		//���̰� 3�� �迭
		int[] oldIntArray2 = {1,2,3};
		//���̰� 5�� �迭�� ���� ����
		int[] newIntArray2 = new int[5];
		//�迭 �׸� ����
		for(int i=0; i<oldIntArray2.length; i++) {
			newIntArray2[2] = oldIntArray2[i];
		}
		//�迭 �׸� ���
		for(int i=0; i<newIntArray2.length; i++) {
			System.out.print(newIntArray2[i] + ", ");
		}

	}

}
