package ch01_과제2;

import java.util.Scanner;

public class two2 {

	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("실수 a :"); double a = stdIn.nextDouble();
		System.out.print("실수 a :"); double b = stdIn.nextDouble();
		
		double max;
		if (a > b) {
			max = a;
		}else if (a < b) {
			max = b;
		}else {
			max = a = b;
		}
		System.out.println(max);
		
		System.out.print("실수 a :"); double c = stdIn.nextDouble();
		System.out.print("실수 a :"); double d = stdIn.nextDouble();
		
		double max2 = c > d ? c : d;
		System.out.println(" 큰 쪽의 값 : " + max2);
		
		
		

	}

}
