package trailCatCoder;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class trailUtils {
	
	
	public static int getMax(int[] a) {

        int max = Arrays.stream(a).max().getAsInt();
        return max;

	}
	
	protected static int getMin(int[] a) {

        int min = Arrays.stream(a).min().getAsInt();
        return min;

	}
	
	private static int getAbsoluteValue(int a, int b) {
		Math.abs(a);
		Math.abs(b);
		int s = 0;
		s= a+b;
		return s;
	}
	private static int getLastDigit(String s) {

			String lastCharacter = s.substring(s.length() -2  , s.length());
//			System.out.println(lastCharacter);
			int temp = Integer.parseInt(lastCharacter.replaceAll(" ", ""));
			
			return temp;
		}
	protected static int getFreq(String s, char c) {
		
		int f=0; 
		for(int j = 0; j < s.length(); j++)	{
			if(s.charAt(j) == c) {
				f++;
			}
		}
		return f;
	}

	private static String getJustLetters(String s) {
		String[] inputArray = s.split("(?<!\\G)\\s\\d");

		String result = String.join("", inputArray).replaceAll(" ", "").replaceAll("\\d", "");
		return result;
	}
	
	private static String repeatString(String s, int a) {
		String repeated = new String(new char[a]).replace("\0", s);
		return repeated;
		}
	
	private	static String[] getPairs(String input) {
	    String front = input.substring(0, 2);
	    String back = input.substring(2, input.length());
	    
	    
		String[] inputArray = back.split("(?<!\\G\\w+)\\s");
		
		List<String> list = new ArrayList<String>(Arrays.asList(inputArray));
		list.remove("");
		
		inputArray = list.toArray(new String[0]);
		return inputArray;
	}
	
	/*Returns an array of the form:
	 * FFF
	 * RFFFF
	 * LFF
	 * etc... 
	 */
	protected static String[] getFullInput(String s) {
		String[] inputArray = getPairs(s);
		ArrayList<String> ar = new ArrayList<String>();
		String fi = "";
		
		for(int i = 0; i<inputArray.length; i++) {
			String arrayElement = inputArray[i];
			String str = getJustLetters(arrayElement);
			int ld = getLastDigit(arrayElement);
			fi = repeatString(str, ld);
			ar.add(fi);
		}
		
		String finals = String.join("", ar);

		String[] finalInput = finals.split("(?=[LR])");
		return finalInput;
	}

	private static int[] toArray(List<Integer> x) {
		int[] arrayX = x.stream().mapToInt(k->k).toArray();
		return arrayX;
	}

	private static int[][] to2DArray(int[] a, int[] b){
		int size = a.length;
		int[][] A = new int[size][2];
		
		for(int i = 0; i < size; i++) {
			A[i][0] = a[i];
			A[i][1] = b[i];
		}
		return A;
		
	}
	protected int[] coordonatesOf(int[][] A, char c) {
		int[] x = new int[A.length];
		int[] y = new int[A.length];
		
		if(c == 'X') {
			for(int i = 0; i < A.length; i++) {
				x[i] = A[i][0];
			}
			return x;
		}
		if(c == 'Y') {
			for(int i = 0; i < A.length; i++) {
				y[i] = A[i][1];
			}
			return y;
		}
		else
			return null;
			
			
	}
	protected int[][] getCoordonates(String s) {
		String[] input = getFullInput(s);
		//get character frequency
		int totalRightTurns = 0, totalLeftTurns = 0;
		int L = 0, R = 0 , F = 0, d = 0;
		int inputLenght = input.length;
		int x = 0, y = 0;
		
		List<Integer> xCoordonates = new ArrayList<Integer>();
		List<Integer> yCoordonates = new ArrayList<Integer>();
		
		int[] X = new int[inputLenght];
		int[] Y = new int[inputLenght];
		
		int[][] A;
		
		for(int i = 0; i < inputLenght; i++) {
			String currentRow = input[i];
			
			L = getFreq(currentRow,'L');
			R = getFreq(currentRow,'R');
			F = getFreq(currentRow,'F');
			
			totalRightTurns = totalRightTurns + R;
			totalLeftTurns = totalLeftTurns + L;
			
			totalRightTurns = totalRightTurns % 4;
			totalLeftTurns = totalLeftTurns % 4;
		
			d = totalRightTurns * 10 + totalLeftTurns;
			
			if(d == 03 || d == 10 || d == 21 || d == 32)
				x = x + F;
			else if(d == 01 || d == 12 || d == 23 || d == 30)
				x = x - F;
			else if(d == 00 || d == 11 || d == 22 || d == 33)
				y = y + F;
			else if(d == 02 || d == 13 || d == 20 || d == 31)
				y = y - F;
			
			xCoordonates.add(x);
			yCoordonates.add(y);
			
			
		}
		X = toArray(xCoordonates);
		Y = toArray(yCoordonates);
		A = to2DArray(X,Y);
		return A;

	}
	
}
