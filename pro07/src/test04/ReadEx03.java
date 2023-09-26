package test04;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class ReadEx03 {

	public static void main(String[] args) throws Exception {
		String originalFileName = "/Users/komorebi/Desktop/IT Study/GitHub/Java/pro07/test01.jpeg";
		String targetFileName = "/Users/komorebi/Desktop/IT Study/GitHub/Java/pro07/test02.jpeg";
		
		InputStream is = new FileInputStream(originalFileName);
		OutputStream os = new FileOutputStream(targetFileName);
		
		byte[] data = new byte[1024];
		while(true) {
			int num = is.read(data);
			if(num == -1) break;
			os.write(data,0,num);
		}
		os.flush();
		os.close();
		is.close();
		
		System.out.println("복사가 잘 되었습니다.");

	}

}
