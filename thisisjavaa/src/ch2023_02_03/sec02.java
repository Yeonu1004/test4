package ch2023_02_03;

import java.util.Iterator;

public class sec02 {

	public static void main(String[] args) {
		
		int a = 100;
		int b = a - 15;
		
		switch (b) {
		case 90:
			System.out.println("90입니다");
			break;
		case 80:
			System.out.println("80입니다");
			break;
			
		default:
			System.out.println("그 이하입니다");
			break;
		}
		
		
	}

}
