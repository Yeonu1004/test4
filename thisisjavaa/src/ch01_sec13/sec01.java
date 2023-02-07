package ch01_sec13;

import java.util.Scanner;

public class sec01 {

	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		int retry = 1; // 다시 한 번?
		
		do {
			System.out.println("정숫값 : ");
			int n = stdIn.nextInt();
			
			if (n > 0) { // n이 0보다 크다면
				System.out.println("이 값은 양수입니다. " + n);
			}else if (n < 0) { //n보다 0이 크다면
				System.out.println(" 이 값은 음수입니다. " + n);
			}else {
				System.out.println(" 이 값은 0입니다. ");
			}
			
			
		} while ( retry == 1);
		
	}

}
