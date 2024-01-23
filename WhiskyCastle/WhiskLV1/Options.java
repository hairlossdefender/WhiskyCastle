package WhiskLV1;

import java.util.ArrayList;
import java.util.Scanner;

public class Options {//사용자가 이용할 옵션들
	private WhiskySorter sorter;
	public Options() {
		sorter=null;
	}
	public ArrayList<Whisky> archivist(int a) {
		 Scanner scanner = new Scanner(System.in);
		    int size =1;
		    ArrayList<Whisky> whiskies = new ArrayList<>();
		    int count=0;
		    System.out.print("Enter 1 to start or 2 to exit: ");
	        int con = scanner.nextInt();
	        scanner.nextLine();
	        if (con == 2) {
	            return null;}
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
		        con = scanner.nextInt();
		        scanner.nextLine();
		        if (con == 2)
		            break;
		    }
		    
		  
		    Whisky[] whiskiesArray = whiskies.toArray(new Whisky[whiskies.size()]);    
		    
		    sorter = new WhiskySorter(whiskies,count);  
		    sorter.printSortedWhiskies(a);
		    
		    return whiskies;
	}
	public Whisky getWhisky( int index) {
		if(sorter==null) {
			System.out.print("there is no whisky recorded");
			return null;
		}
		else {
	    if (index < 0 || index >= ((WhiskySorter) sorter).getSorted().size()) {
	        throw new IndexOutOfBoundsException("Index " + index + " is out of bounds");
	    }
	    return sorter.getSorted().get(index);}
	}
	
	}

