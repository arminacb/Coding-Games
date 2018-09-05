package MarsRover;
import java.util.Scanner;

import MarsRover.inputUtil;
public class level1 {

	static inputUtil iutil = new inputUtil();
	static String[] input = iutil.getInput();
	
	public static void main(String[] args) {

		radius();
	}
	
	public static void radius() {
		String[] inp = input;
		for(String str : inp) {	
				Scanner s = new Scanner(str);
				float WheelBase = s.nextFloat();
				float SteeringAngle = s.nextFloat();
				float sin = (float) Math.sin(Math.toRadians(SteeringAngle));
				float TurnRadius = WheelBase / sin;


				String result =  String.format("%.2f", TurnRadius);



				System.out.println(result);
		}
	}
}
