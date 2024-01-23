package WhiskLV1;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;


//

public class WPR {

	public static void main(String[] args) {
	    // TODO Auto-generated method stub
	    Scanner scanner = new Scanner(System.in);
	    int size =1;
	    ArrayList<Whisky> whiskies = new ArrayList<>();
	    int count=0;
	    for (int i = 0; i < size; i++) {
	        System.out.print("Enter the name of the whisky " + (1 + i));
	        String name = scanner.nextLine();
	        System.out.print("Enter the alcohol volume of the whisky " + (1 + i));
	        double vol = scanner.nextDouble();
	        System.out.print("Enter the score " + (1 + i));
	        int score = scanner.nextInt();
	        scanner.nextLine();
	        whiskies.add(new Whisky(name, score, vol));
	        count++;

	        if (count >= size) {
	            size *= 2;
	        }
	        System.out.print("Enter 1 to continue or 2 to exit: ");
	        int con = scanner.nextInt();
	        scanner.nextLine();
	        if (con == 2)
	            break;
	    }
	    
	    
	    Whisky[] whiskiesArray = whiskies.toArray(new Whisky[whiskies.size()]);

	    
	 
	    WhiskySorter sorter = new WhiskySorter(whiskies,count);
	    sorter.printSortedWhiskies(1);
	}
}
   
