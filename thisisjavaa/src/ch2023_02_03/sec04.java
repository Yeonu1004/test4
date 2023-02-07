package ch2023_02_03;

import java.util.Iterator;

public class sec04 {

	public static void main(String[] args) {
		
		for (int i = 0; i <= 10; i+=2) {
			
			if (i==0) {
				continue;
			}
			
			System.out.println(i+ " ");
		}

	}

}
