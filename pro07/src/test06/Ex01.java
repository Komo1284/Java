package test06;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class Ex01 {

	public static void main(String[] args) {
		write("문자 변환 스트림을 사용합니다.");
		String data = read();
		System.out.println(data);

	}
	
	public static void write(String str) throws Exception {
		OutputStream os = new FileOutputStream("/Users/komorebi/Desktop/IT Study/GitHub/Java/pro07/test.rtf");
		Writer writer = new OutputStreamWriter(os, "UTF-8");
		writer.write(str);
		writer.flush();
		writer.close();
	}
	
	public static String read() throws Exception{
		InputStream is = new FileInputStream("/Users/komorebi/Desktop/IT Study/GitHub/Java/pro07/test.rtf");
		Reader reader = new InputStreamReader(is, "UTF-8");
		char[] data = new char[100];
		int num = reader.read(data);
		reader.close();
		String str = new String(data,0,num);
		return str;
	}

}
