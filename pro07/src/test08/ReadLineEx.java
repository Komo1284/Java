package test08;

import java.io.BufferedReader;
import java.io.FileReader;

public class ReadLineEx {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(
				new FileReader("/Users/komorebi/Desktop/IT Study/GitHub/Java/pro07/src/test08/ReadLineEx.java")
			);
		
		int lineNo = 1;
		while(true) {
			String str = br.readLine();
			if(str == null) break;
			System.out.println(lineNo + "\t" + str);
			lineNo++;
		}
		
		br.close();

	}

}
