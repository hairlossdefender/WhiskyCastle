package WhiskLV1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class WhiskySorter {
	private ArrayList<Whisky> whiskies;
    private int count;

    public WhiskySorter(ArrayList<Whisky> whiskies) {
    	
        this.whiskies = whiskies;
        this.count = whiskies.size();
    }

    public ArrayList<Whisky> SortedWhiskies(int select, boolean print) {
    	 Comparator<Whisky> comparator = null;
    
    	 switch (select) {
         case 1:
        	 if(print) {
        	 System.out.println("Whisky in decending order of scores");}
             comparator = Comparator.comparingInt(Whisky::getScore).reversed();
             break;
         case 2:
        	 if(print) {
        	 System.out.println("Whisky in ascending order of scores");}
             comparator = Comparator.comparingInt(Whisky::getScore);
             break;
         case 3:
        	 if(print) {
        	 System.out.println("Whisky in decending order of alc volume");}
             comparator = Comparator.comparingDouble(Whisky::getVol).reversed();
             break;
         case 4:
        	 if(print) {
        	 System.out.println("Whisky in ascending order of alc volume");}
             comparator = Comparator.comparingDouble(Whisky::getVol);
             break;
         case 5:
        	 if(print) {
        	 System.out.println("Whisky in decending order of price");}
             comparator = Comparator.comparingDouble(Whisky::getVol).reversed();
             break;
         case 6:
        	 if(print) {
        	 System.out.println("Whisky in ascending order of price");}
             comparator = Comparator.comparingDouble(Whisky::getVol);
             break;
    	 
    	 }
    	 if (comparator == null) {
    	        System.out.println("Invalid selection");
    	        return null;
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
        return (ArrayList<Whisky>) sortedWhiskies;
    }
	
    
    


}