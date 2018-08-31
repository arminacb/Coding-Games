package bear;
import java.util.Scanner;

public class A {
	public void getYear() {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		int year = 0;

		do {
			a*=3;
			b*=2;
			year++;
			if(a==b) {
				year++;
			}
		}
		while(a < b);

		System.out.println(year);
	}

}
