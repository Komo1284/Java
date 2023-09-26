package test03;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Write3Ex {

	public static void main(String[] args) {
		try {
			OutputStream os = new FileOutputStream("/Users/komorebi/Desktop/IT Study/GitHub/Java/pro07/test3.db");
			
			byte[] array = {10,20,30,40,50};
			
			os.write(array,1,3);
			
			os.flush();
			os.close();
		} catch(IOException e) {
			e.printStackTrace();
		}

	}

}
