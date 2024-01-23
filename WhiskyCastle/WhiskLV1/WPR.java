package WhiskLV1;


import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;


//

public class WPR {

	public static void main(String[] args) {
	    // TODO Auto-generated method stub
	    Scanner scanner = new Scanner(System.in);
	    int size =1;
	    Whisky[] whiskies = new Whisky[size];
	    vol);
	        count++;

	        if (count >= size) {
	            size *= 2;
	            Whisky[] newWhiskies = new Whisky[size];
	            for (int j = 0; j < whiskies.length; j++) {
	                newWhiskies[j] = whiskies[j];
	            }
	            whiskies = newWhiskies;
	        }
	        System.out.print("Enter 1 to continue or 2 to exit: ");
	        int con = scanner.nextInt();
	        scanner.nextLine();
	        if (con == 2)
	            break;
	    }
	    
	    
	 
	    WhiskySorter sorter = new WhiskySorter(whiskies,count);
	    sorter.printSortedWhiskiesByScore();
	}
}
   
