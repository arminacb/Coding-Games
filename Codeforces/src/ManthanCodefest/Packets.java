package ManthanCodefest;

import java.util.Scanner;

public class Packets {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		long input = s.nextLong();
		int counter = 0;
		
		int i = 0;
		
		do {
			input = input - (long) Math.pow(2, i);
			counter++;	
			i++;
			}
			while(input > 0); 
		System.out.println(counter);
		}
		
	
	
}
