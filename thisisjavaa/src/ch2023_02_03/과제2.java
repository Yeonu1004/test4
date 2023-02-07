package ch2023_02_03;

import java.util.Iterator;
import java.util.Scanner;

public class 과제2 {

	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		System.out.println("출력할 # 갯수 입력");
		
		int n = stdIn.nextInt();
		if (n > 0) {
			for (int i = 0; i < n; i++) {
				System.out.print("#");
				
			}
		}

	}

}
