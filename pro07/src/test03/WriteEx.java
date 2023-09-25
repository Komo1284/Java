package test03;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteEx {

	public static void main(String[] args) {
		try {
			OutputStream os = new FileOutputStream("/Users/komorebi/Desktop/IT Study/GitHub/Java/test1.db");
			
			byte a = 10;
			byte b = 20;
			byte c = 30;
			
			os.write(a);
			os.write(b);
			os.write(c);
			
			os.flush();
			os.close();
		} catch(IOException e) {
			e.printStackTrace();
		}

	}

}
