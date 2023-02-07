package ch01_과제4;

import java.util.Scanner;

public class sec04 {

	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("왼쪽 아래가 직각인 이등변 삼각형을 표시합니다.");
		System.out.print("단수는 ? :");
		int n = stdIn.nextInt(); // n에 입력받은 값 저장
		
		for ( int i = 1; i <= n; i++) { // i는 1부터 시작, 입력받은 값보다 작거나 같을때까지 증가한다
			for ( int j = 1; j <= i; j++) // j는 1부터 시작, i와 값이 같고 증가한다
				System.out.print('*');
			System.out.println();
		}

	}

}
