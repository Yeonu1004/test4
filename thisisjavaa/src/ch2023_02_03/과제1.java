package ch2023_02_03;

import java.util.Scanner;

public class 과제1 {

	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		int n;
		do {
			System.out.println("양의 정숫값");
			n = stdIn.nextInt();
		} while (n <= 0);
		
		int factoral = 1;
		int i = 1;
		
		while (i <= n) {
			factoral *= i;
			i++;
		}
		System.out.println("1~"+n+" 까지의 곱은 " + factoral);
	}

}
