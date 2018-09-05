package AuctionBidding;

import java.util.Scanner;

public class level1 {

	public static void main(String[] args) {
		system();
	}
	
	public static void system() {
		String input = "1,A,5,B,10,A,8,A,17,B,17 ";
		String sBid = input.substring(0,1);
		int startingBid = Integer.parseInt(sBid);
		
		
		
		
		String[] str = input.split(",");
		int l = str.length;
		for(int i = 1; i < l; i++) {
			
			String bidder = ;
			int bid = startingBid;
			if(i%2 == 1)
				bidder = str[i];
			else if(i%2 == 0)
				bid = Integer.parseInt(str[i]);
		}
		
		
	}
}
