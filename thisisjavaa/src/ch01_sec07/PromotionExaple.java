package ch01_sec07;

public class PromotionExaple {

	public static void main(String[] args) {
		// 자동 타입 선언
		
		byte bytevalue = 10;
		int intvalue = bytevalue;
		System.out.println("intValue :" + intvalue);
		
		//강제형 반환
		int var1 = 10;
		byte var2 = (byte)var1;
		System.out.println(var1);
		
		int var5 = 65;
		char var6 = (char)var5;
		System.out.println(var6);
		
		int a = 5;
		int b = 2;
		
		System.out.println("a/b => " + a/(float)b);
		
		int value1 = Integer.parseInt("10");
		double value2 = Double.parseDouble("3.14");
		boolean value3 = Boolean.parseBoolean("true");
		
		System.out.println("value1 : " + value1);
		System.out.println("value2 : " + value2);
		System.out.println("value3 : " + value3);
	}

}
