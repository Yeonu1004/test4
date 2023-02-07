package ch01_sec12;

import java.util.Scanner;

public class scanner1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("정수값 : ");
		int n = stdIn.nextInt();
		
		if (n < 0) {
			System.out.println(" 이 값은 음의 값입니다.");
		}else {
			System.out.println(" 이 값은 양의 값입니다");
		}
		
		
	}

}
