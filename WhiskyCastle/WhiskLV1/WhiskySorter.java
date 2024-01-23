package WhiskLV1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class WhiskySorter {
	private ArrayList<Whisky> whiskies;
    private int count;

    public WhiskySorter(ArrayList<Whisky> whiskies2, int count) {
    	
        this.whiskies = whiskies2;
        this.count = count;
    }

    public void printSortedWhiskies(int select) {
    	 Comparator<Whisky> comparator = null;
    
    	 switch (select) {
         case 1:
        	 System.out.println("Whisky names and scores in decending order of scores");
             comparator = Comparator.comparingInt(Whisky::getScore).reversed();
             break;
         case 2:
        	 System.out.println("Whisky names and scores in ascending order of scores");
             comparator = Comparator.comparingInt(Whisky::getScore);
             break;
         case 3:
        	 System.out.println("Whisky names and scores in decending order of alc volume");
             comparator = Comparator.comparingDouble(Whisky::getVol).reversed();
             break;
         case 4:
        	 System.out.println("Whisky names and scores in ascending order of alc volume");
             comparator = Comparator.comparingDouble(Whisky::getVol);
             break;
         case 5:
        	 System.out.println("Whisky names and scores in decending order of price");
             comparator = Comparator.comparingDouble(Whisky::getVol).reversed();
             break;
         case 6:
        	 System.out.println("Whisky names and scores in ascending order of price");
             comparator = Comparator.comparingDouble(Whisky::getVol);
             break;
    	 
    	 }
    	 if (comparator == null) {
    	        System.out.println("Invalid selection");
    	        return;
    	    }
    	 
    	 List<Whisky> sortedWhiskies = new ArrayList<>(whiskies);
         Collections.sort(sortedWhiskies, comparator);
        
        for (Whisky whisky : sortedWhiskies) {
            if (whisky != null) {
                System.out.println(whisky.getName() + ": alcVol: " + whisky.getVol() + " scores: " + whisky.getScore());
            } else {
                // Handle the case where the whisky object is null
                System.out.println("done");
            }
        }
    }
	public ArrayList<Whisky> getSorted() {
		// TODO Auto-generated method stub
		return whiskies;
	}
    
    


}