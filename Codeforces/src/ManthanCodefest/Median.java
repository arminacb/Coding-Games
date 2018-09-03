package ManthanCodefest;

import java.util.Arrays;
import java.util.Scanner;

public class Median {
	static int counter = 0;
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int target = s.nextInt();
		

		int[] array = new int[n];
		
		for(int i = 0; i < n; i++) {
			array[i] = s.nextInt();
		}

		findBalance(array,target,n);
		System.out.println(counter);


	}	
	
	
	public static void findBalance(int[] array, int target, int n) {

		Arrays.sort(array);
		int middle = array[(n-1)/2];
		
		if(middle == target)
			return;
		else if(middle < target) {
			counter += target - middle;
		}
		else if(middle > target) {
			counter += middle - target;
		}
		array[(n-1)/2] = target;
		findBalance(array,target,n);
		
	}
	
	

}
