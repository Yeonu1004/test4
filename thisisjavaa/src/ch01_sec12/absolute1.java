package ch01_sec12;

import java.util.Scanner;

public class absolute1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("정수값 : ");
		int n = stdIn.nextInt();
		
		if (n >= 0) {
			System.out.println("절댓값은 " + n + "입니다.");
		}else {
			System.out.println("절댓값은 " + -n + "입니다");
		}
		
		System.out.println("숫자 입력");
		int n1 = stdIn.nextInt();
		System.out.println("두 번째 숫자 입력");
		int n2 = stdIn.nextInt();
		
		if (n1 > n2) {
			System.out.println(n2 + " 숫자보다 " + n1 + " 숫자가 더 큽니다");
		}if (n1 < n2) {
			System.out.println(n1 + " 숫자보다 " + n2 + " 숫자가 더 큽니다");
		} else {
			System.out.println(" 두 숫자가 같습니다 " + n1 + " == " + n2);
		}
		
		
	}

}
