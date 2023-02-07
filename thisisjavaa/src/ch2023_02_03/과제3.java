package ch2023_02_03;

import java.util.Iterator;
import java.util.Scanner;

public class 과제3 {

	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("카운트다운");
		int x;
		do {
			System.out.println("양의 정숫값");
			x = stdIn.nextInt();
		} while (x < 0);
		
		for (; x > -1; x--)
			System.out.println(x);
		
	}

}
