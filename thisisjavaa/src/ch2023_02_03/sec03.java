package ch2023_02_03;

import java.util.Iterator;
import java.util.Random;

public class sec03 {

	public static void main(String[] args) {
		
		Random rand = new Random();
		int no = rand.nextInt(100);
		
		for (int i = 0; i < no; i++) {
			System.out.println(i);
			
		}
	}

}
