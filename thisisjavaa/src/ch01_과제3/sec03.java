package ch01_과제3;

import java.util.Scanner;

public class sec03 {

	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("정수 A 입력"); int a = stdIn.nextInt();
		System.out.println("정수 B 입력"); int b = stdIn.nextInt();
		if (a > b) { //b보다 a가 크면 ) a 11 , b 9
			int t = a; // 두 값을 교환한다. t = 11
			a = b; // a = 9
			b = t; // b = 11
		}
		
		do {
			System.out.println(a + " +1 "); // a값을 입력받아라.
			a = a + 1; // >> a에서 숫자 1씩 더하라. 언제까지?
		} while (a <= b); // a가 b보다 크거나 같을때까지
		System.out.println();

	}

}
