package test05;

public class Ex02 {

	public static void main(String[] args) {
		//길이가 3인 배열
		int[] oldIntArray2 = {1,2,3};
		//길이가 5인 배열을 새로 생성
		int[] newIntArray2 = new int[5];
		//배열 항목 복사
		for(int i=0; i<oldIntArray2.length; i++) {
			newIntArray2[2] = oldIntArray2[i];
		}
		//배열 항목 출력
		for(int i=0; i<newIntArray2.length; i++) {
			System.out.print(newIntArray2[i] + ", ");
		}

	}

}
