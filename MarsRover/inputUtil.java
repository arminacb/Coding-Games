package MarsRover;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class inputUtil {
	
	
	
	public String[] getInput() {
		File file = new File("F:\\Users\\armin\\eclipse-workspace\\catCoder\\src\\MarsRover\\input.txt");
		Scanner s = null;
		try {
			s = new Scanner(file);
		} 

		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		List<String> list = new ArrayList<String>();
		String str;

		int counter = 0;
		while(s.hasNextLine()) {
				counter++;
				str = s.nextLine();
				list.add(str);
		}
		
		
	
		String[] finalinput = list.toArray(new String[counter]);
		
		
		
		return finalinput;
		
		
	}
}
