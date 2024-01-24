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
		    
		  
		    Whisky[] whiskiesArray = whiskies.toArray(new Whisky[whiskies.size()]); //필요시 사용할 위스키 배열   
		    
		    return whiskies;
	}
	public void SortWhiskies(ArrayList<Whisky> whiskies) {
		int n=0;
		Scanner scanner = new Scanner(System.in);
		System.out.print("1. order of scores\n 2. order of scores\n 3. order of volume");
		int num1 = scanner.nextInt();
		 n=n+num1;
		 System.out.print("1. decending order\n 2. ascending order ");
		 int num2 = scanner.nextInt();
		 WhiskySorter sorter= new WhiskySorter(whiskies);
		 if(num2==1) {
			 sorter.SortedWhiskies(num1, true);
		 }
		 else {
			 sorter.SortedWhiskies(num1+1, true);
		 }
	}
	public Whisky getWhisky( int index) {
		if(sorter==null) {
			System.out.print("there is no whisky recorded");
			return null;
		}
		else {
	    if (index < 0 || index >= ((WhiskySorter) sorter).SortedWhiskies(index, false).size()) {
	        throw new IndexOutOfBoundsException("Index " + index + " is out of bounds");
	    }
	    return sorter.SortedWhiskies(index, false).get(index);}
	}
	
	}

