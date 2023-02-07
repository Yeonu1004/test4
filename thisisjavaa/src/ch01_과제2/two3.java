package ch01_과제2;

import java.util.Scanner;

public class two3 {

	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		
		//정수 a값 입력받기
		System.out.println("정수 a : "); int a = stdIn.nextInt();
		
		//정수 b값 입력받기
		System.out.println("정수 b : "); int b = stdIn.nextInt();
		
		// 변수 diff는 조건문 a가 b랑 같거나 크다면,
		// a - b의 true 조건문 실행,
		// 조건문이 틀리다면 b - a false 조건문 실행
		int diff = a >= b ? a - b : b - a; 
		
		//diff 값 입력받기
		System.out.println("두 값의 차이는 " + 
		// diff값이 10 이하라면 true값인 "10이하" 출력
		// diff값이 10 이상이라면 false값인 "10이상" 출력
		(diff <= 10 ? "10이하" : "11이상") + "입니다");

	}

}
