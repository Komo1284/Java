package test01;

public class Ex01 {

	public static void main(String[] args) {
		// �迭 ���� ����� �迭 ����
		int[] scores = {95,71,84,93,87};
		// �迭 �׸� ��ü �� ���ϱ�
		int sum = 0;
		for (int score : scores) {
			sum += score;
		}
		System.out.println("���� ����= " + sum);
		// �迭 �׸� ��ü ��� ���ϱ�
		double avg = (double) sum / scores.length;
		System.out.println("���� ��� = " + avg);

	}

}
