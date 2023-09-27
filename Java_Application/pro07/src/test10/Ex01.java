package test10;

import java.io.File;
import java.sql.Date;
import java.text.SimpleDateFormat;

public class Ex01 {

	public static void main(String[] args) throws Exception {
		//File 객체 생성
		File dir = new File("/Users/komorebi/Desktop/IT Study/GitHub/Java/pro07/images");
		File file1 = new File("/Users/komorebi/Desktop/IT Study/GitHub/Java/pro07/file1.txt");
		File file2 = new File("/Users/komorebi/Desktop/IT Study/GitHub/Java/pro07/file2.txt");
		File file3 = new File("/Users/komorebi/Desktop/IT Study/GitHub/Java/pro07/file3.txt");
		
		//존재하지 않으면 디렉토리 또는 파일 생성
		if(dir.exists() ==  false) {dir.mkdirs();}
		if(file1.exists() == false) {file1.createNewFile();}
		if(file2.exists() == false) {file2.createNewFile();}
		if(file3.exists() == false) {file3.createNewFile();}
		
		//Temp 폴더의 내용을 출력
		File temp = new File("/Users/komorebi/Desktop/IT Study/GitHub/Java/pro07");
		File[] contents = temp.listFiles();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a HH:mm");
		for(File file : contents) {
			System.out.printf("%-24s", sdf.format(new Date(file.lastModified())));
			if(file.isDirectory()) {
				System.out.printf("%-10s%-20s", "<DIR>", file.getName());
			} else {
				System.out.printf("%-10s%-20s", file.length(), file.getName());
			}
			System.out.println();
		}

	}	

}
