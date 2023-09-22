package org.opentutorials.javatutorials.io;

import java.util.Scanner;

public class Scanner2Demo {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println(sc.next());
		while (sc.hasNext()) {
			System.out.println(sc.nextInt()*1000);
		}
		sc.close();

	}

}
