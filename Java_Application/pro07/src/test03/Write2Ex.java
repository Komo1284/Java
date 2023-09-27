package test03;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Write2Ex {

	public static void main(String[] args) {
		try {
			OutputStream os = new FileOutputStream("/Users/komorebi/Desktop/IT Study/GitHub/Java/pro07/test2.db");
			
			byte[] array = {10,20,30};
			
			os.write(array);
			
			os.flush();
			os.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}