package ch01_과제3;

import java.util.Random;
import java.util.Scanner;

public class sec02 {

	public static void main(String[] args) {

		Random random = new Random();
		Scanner stdIn = new Scanner(System.in);
		
		int no = 10 + random.nextInt(1000);
		System.out.println("시작합니다");
		
		int x;
			do {
				x = stdIn.nextInt();
				
				if (x > no) {
					System.out.println("더 작은 숫자입니다.");
				}else if (x < no) {
					System.out.println("더 큰 숫자입니다.");
				}
				//정답이 아니면 반복
			} while (x != no);
			System.out.println("정답." + no);

	}

}
