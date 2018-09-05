package trailCatCoder;

public class Line {

	private int a, b, c;
	
	public void getabc(int xA, int yA, int xB, int yB) {
		a = yB - yA;
		b = xB - xA;
		c = yA * xB - yB * xA;
		
	}
}
