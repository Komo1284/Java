package test04;

public class Ex01 {
	public static void main(String[] args) {
		
		//문자열 -> 기본타입으로 변환
		String var1 = "10";
		int value1 = Integer.parseInt(var1);
		String var2 = "3.14";
		double value2 = Double.parseDouble(var2);
		String var3 = "true";
		boolean value3 = Boolean.parseBoolean(var3);
		
		System.out.println("value1: " + value1);
		System.out.println("value2: " + value2);
		System.out.println("value3: " + value3);
		
		//기본타입 -> 문자열로 변환
		int var4 = 10;
		String str1 = String.valueOf(var4);
		double var5 = 3.14;
		String str2 = String.valueOf(var5);
		boolean var6 = true;
		String str3 = String.valueOf(var6);
		
		System.out.println("str1: " + str1);
		System.out.println("str2: " + str2);
		System.out.println("str3: " + str3);
		
	}

}
