package WhiskLV1;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;


//

public class WPR {

	public static void main(String[] args) {
	    // TODO Auto-generated method stub
	   ArrayList<Whisky> whiskies;
	   Options option = new Options();
	   whiskies=option.archivist();
	   option.getWhisky(2);
	   option.SortWhiskies(whiskies);
	}
}
   
