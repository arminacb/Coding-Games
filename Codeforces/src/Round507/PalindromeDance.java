package Round507;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PalindromeDance {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int white = s.nextInt();
		int black = s.nextInt();
		
		int cost = 0;
		
		List<Integer> initialList = new ArrayList<Integer>();

		for(int i = 0; i < n; i++)
			initialList.add(s.nextInt());
		
		int[] dancers = initialList.stream().mapToInt(i->i).toArray();
		
		 

		
		
		for(int i = 0; i < (n-1)/2; i++) {
			int d1 = dancers[i]; 
			int d2 = dancers[n-i-1];
			if((d1 == 2 && d2 != 2) || (d1 != 2 && d2 == 2)) {
				if(d2 == 1 || d1 == 1) {
					cost += white;
					dancers[i] = dancers[n-i-1];
				}
				else if(d2 == 0 || d1 == 0) {
					cost += black;
					dancers[i] = dancers[n-i-1];
					
				}
			}
				
			else if(d1 == 2 && d2 == 2) {
				if(white > black)
					cost += black;
				else 
					cost += white;
			}
		}
		
		for(int i = 0; i < n; i++) {
			if(dancers[i] != 2 && dancers[n-i-1] != 2 && dancers[i] != dancers[n-i-1])
				cost = -1;
		}		
		String str = "";
		for(int i : dancers)
			str = str + i;
		
		System.out.println(cost);
		
	}
}
