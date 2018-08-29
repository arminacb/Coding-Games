package trailCatCoder;


interface actions {
	int getPerimeter(String input);
	int getSurface(String input);
	void getTotalSurface();
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
		
		int maxX = getMax(xCoordonates);
		int maxY = getMax(yCoordonates);
		
		int minX = getMin(xCoordonates);
		int minY = getMin(yCoordonates);
		
		totalSurface = (Math.abs(maxX) + Math.abs(minX))*(Math.abs(maxY) + Math.abs(minY));
		return totalSurface;
		
	}

	@Override
	public void getTotalSurface() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getPockets() {
		// TODO Auto-generated method stub
		return 0;
	}

}
