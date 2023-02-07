package ch2023_02_03;

import java.util.Scanner;

import com.sun.java.swing.action.NextAction;

import jdk.jfr.events.SocketReadEvent;

public class sec01 {

	public static void main(String[] args) {
		
		// char grade = ( score > 90 ) ? 'A' : ( (score > 80) ? 'B' : 
		// (score > 70) ? 'C' : 'D');
		Scanner stdIn = new Scanner(System.in);
		System.out.println("점수를 입력해주세요");
		int score = stdIn.nextInt();
		
		int jumsu = score/10;
		char grade = 'A';
		
		switch (jumsu) {
		case 10:
			grade = 'A';
			break;
		case 9:
			grade = 'A';
			break;
		case 8:
			grade = 'B';
			break;
		case 7:
			grade = 'C';
			break;
		case 6:
			grade = 'D';
			break;
		case 5:
			grade = 'E';
			break;

		default:
			grade = 'F';
			break;
		}
		
		
		System.out.println("입력하신 점수는 " + score + " 점 입니다.");
		System.out.println(score + " 점은 " + grade + "등급입니다");
		
	}

}
