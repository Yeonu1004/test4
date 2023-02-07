package ch01_sec04;

public class FloatDoubleExaple {

	public static void main(String[] args) {
		// 정밀도 확인
		float var1 = 0.1234567890123456789f;
		double var2 = 0.1234567890123456789;
		System.out.println("var1 : " + var1);
		System.out.println("var2 : " + var2);
		
		//10의 거듭제곡 
		
		double var3 = 3e6;
		float var4 = 3e6f;
		double var5 = 2e-3;
		
		System.out.println("var3 : " + var3);
		System.out.println("var4 : " + var4);
		System.out.println("var5 : " + var5);
		
		int var6 = 3;
		int var7 = 4;
		
		if (var6 >= 4 && var7 >= 4 ) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		
		boolean stop = false;
		if(stop) {
			System.out.println("중지합니다");
		}else {
			System.out.println("시작합니다");
		}
		
		int x = 10;
		boolean result1 = (x==20);
		boolean result2 = (x!=20);
		
		System.out.println("result1 " +result1);
		System.out.println("result2 " +result2);
		
		
	}

}
