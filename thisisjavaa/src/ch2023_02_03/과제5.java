package ch2023_02_03;

import java.util.Iterator;
import java.util.Scanner;

public class 과제5 {

	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("1부터 n까지의 합을 구합니다");
		
		int n;
		do {
			System.out.println("n의 값 :");
			n = stdIn.nextInt();
		} while (n <= 0);
		
		int sum = 0;
		for ( int i = 0; i <= n; i++)
			sum += i; //sum에 i를더한다
		System.out.println("1부터 " + n + "까지의 합은 " + sum+"입니다.");
		
	}

}
