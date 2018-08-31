/*
 * A. Vanya and Fence
 * 	
 * Vanya and his friends are walking along the fence of height h
and they do not want the guard to notice them.
In order to achieve this the height of each of the friends
should not exceed h. If the height of some person is greater
than h he can bend down and then he surely won't be noticed by the guard.
The height of the i-th person is equal to ai.*/
package vanya;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class A {
	
	public static void main(String[] args) {
	      Scanner in = new Scanner(System.in);
	     
	      List<String> list = new ArrayList<String>( );
	      
	      boolean loop = true;
	        while(loop)
	        {
	          String s = in.nextLine( );
	 
	            if(s.equals("")|s.equals("pl exit"))
	            {
	              break;    
	            }
	            else
	            {
	              list.add(s);
	            }
	        }
		int total = getWidth(list);
		System.out.println(total);
		
	}
	

	
	public static int getWidth(List<String> list) {
		String[] rows = list.toArray(new String[0]);
		
		
		for(String str : rows)
			str.replace(" ", "");
		
		String fr = rows[0];
		String sr = rows[1];
		
		String[] firstRow = fr.split("\\s");
		String[] secondRow = sr.split("\\s");
		
		int n = Integer.parseInt(firstRow[0]);
		int h = Integer.parseInt(firstRow[1]);	
		
		int counter = 0;
		
		for(int i = 0; i < n; i++) {
			int a = Integer.parseInt(secondRow[i]);
			if(a<=h) {
				counter++;
			}
			else
				counter = counter +2;
		}
		
		return counter;
		
	}


	
}