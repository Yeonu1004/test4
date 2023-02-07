package ch01_과제4;

import java.util.Iterator;
import java.util.Scanner;

public class sec05 {

	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("피라미드를 표시합니다");
		System.out.println(" 단수 입력 ");
		int n = stdIn.nextInt();
		
		for ( int i = 1; i <= n; i++) {
			for ( int j = 1; j <= n-i; j++)
				System.out.print(' ');
			for ( int j = 1; j <= 2*i-1; j++)
				System.out.print('*');
			System.out.println();
		}

	}

}
