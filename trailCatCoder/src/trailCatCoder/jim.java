package trailCatCoder;

import java.util.Arrays;

interface actions {
	int getPerimeter(String input);
	int getSurface(String input);
	double getTotalSurface(String input);
	int getPockets();
}

public class jim extends trailUtils implements actions{

	public int getPerimeter(String input) {
		int total = 0;
		int f = 0;
		String[] str = getFullInput(input);
		
		for(int i = 0; i < str.length; i++) {
			String arrayElement = str[i];
			f = getFreq(arrayElement, 'F');
			total = total + f;
		}
		return total;
	}

	@Override
	public int getSurface(String input) {
		int totalSurface = 0;
		
		int[][] xyCoordonates = getCoordonates(input);
		int[] xCoordonates = coordonatesOf(xyCoordonates, 'X');
		int[] yCoordonates = coordonatesOf(xyCoordonates, 'Y');
		
		int maxX, minX, maxY, minY;
		
		maxX = Arrays.stream(xCoordonates).max().getAsInt();
		minX = Arrays.stream(xCoordonates).min().getAsInt();
		
		maxY = Arrays.stream(yCoordonates).max().getAsInt();
		minY = Arrays.stream(yCoordonates).min().getAsInt();
		
		totalSurface = (Math.abs(maxX) + Math.abs(minX))*(Math.abs(maxY) + Math.abs(minY));
		return totalSurface;
		
	}

	@Override
	public double getTotalSurface(String input) {
		int[][] xyCoordonates = getCoordonates(input);
		int[] X = coordonatesOf(xyCoordonates, 'X');
		int[] Y = coordonatesOf(xyCoordonates, 'Y');
		
	    double area = 0.0;
	    int n = X.length;
	    
	    // Calculate value of shoelace formula
	    int j = n - 1;
	    for (int i = 0; i < n; i++)
	    {
	        area += (X[j] + X[i]) * (Y[j] - Y[i]);
	        j = i;  // j is previous vertex to i
	    }
	 
	    // Return absolute value
	    return Math.abs(area / 2.0);
		
	}

	@Override
	public int getPockets() {
		// TODO Auto-generated method stub
		return 0;
	}

}
