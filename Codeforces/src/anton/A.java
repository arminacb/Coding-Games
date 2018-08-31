package anton;
import java.util.Scanner;

public class A {
	
	public static void getWinner() {
		
		Scanner s = new Scanner(System.in);
		//System.out.println("Input: ");
		int games = s.nextInt();
		String winners = s.next();
		
		//String[] parts = input.split("\n");
		//String part1 = parts[0];
		//String part2 = parts[1];
		int a = 0;
		int d = 0;
		
		for(int i = 0; i<winners.length();i++) {
			if(winners.charAt(i) == 'A')
				a++;
		}
		for(int i = 0; i<winners.length();i++) {
			if(winners.charAt(i) == 'D')
				d++;
		}
		

		if(a > d) {
			System.out.println("Anton");
		}
		else if(a == d) {
			System.out.println("Friendship");
		}
		else if(a < d)
			System.out.println("Danik");
	}

}
