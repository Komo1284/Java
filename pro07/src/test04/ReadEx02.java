package test04;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class ReadEx02 {

	public static void main(String[] args) {
		try {
			InputStream is = new FileInputStream("/Users/komorebi/Desktop/IT Study/GitHub/Java/pro07/test2.db");
			
			byte[] data = new byte[100];
			
			while(true) {
				int num = is.read(data);
				if(num == -1) break;
				
				for(int i=0; i<num; i++) {
					System.out.println(data[i]);
				}
			}
			
			is.close();
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}

	}

}
