package trailCatCoder;

import java.util.Scanner;

public class play {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int option;
		jim j = new jim();
		String input = s.nextLine();
		int p = j.getPerimeter(input);
		System.out.println(p);
		int s1 = j.getSurface(input);
		System.out.println(s1);
		
		
//==========================MAIN MENU===================================
		
/*	    String mainMenu = ("Select the level: \n" 
	            + "1. Level 1 - Perimeter\n" 
	            + "2. Level 2 - Surface of rectangle\n"
	            + "3. Level 3 - Trail surface\n" 
	            + "4. Level 4 - Pockets\n"
	            + "5. Exit");
		do {			    	
			System.out.println("Enter the input: ");
			String input = s.nextLine();
			System.out.println(mainMenu);
			option = s.nextInt();
			
			switch (option) 
			{
			    case 1: 

			        int p = j.getPerimeter(input);
			        System.out.println(p);
			        break;
			    case 2:
			        break;
			    case 3: 
			        break;
			    case 4:
			        break;
			    case 5:
			    	System.exit(0);
			        break;
			    default:
			        break;
			}
		}
		while(option != 5);*/
	}
}
