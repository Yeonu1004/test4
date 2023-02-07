package ch01_sec11;

public class Scopeexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int v1 = 15;
		
		int v2 = v1-10;
		
		if (v1>10) {
			v2 = v1-10;
		}
		int v3= v1+v2+5;
		System.out.println(v2);
		System.out.println(v3);

	}

}
