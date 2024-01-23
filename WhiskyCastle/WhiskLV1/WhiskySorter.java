package WhiskLV1;

import java.util.Comparator;
import java.util.PriorityQueue;

public class WhiskySorter {
    private Whisky[] whiskies;
    private int count;

    public WhiskySorter(Whisky[] whiskies, int count) {
    	
        this.whiskies = whiskies;
        this.count = count;
    }

    public void printSortedWhiskiesByScore() {
  
    	 Comparator<Whisky> comparator = Comparator.comparingInt(Whisky::getScore).reversed();
         
         PriorityQueue<Whisky> sortedWhiskies = new PriorityQueue<>(comparator);

         for (Whisky whisky : whiskies) {
             if (whisky != null) {
                 sortedWhiskies.add(whisky);
             }
         }
        System.out.println("Whisky names and scores in ascending order of scores");
        for (Whisky whisky : sortedWhiskies) {
            if (whisky != null) {
                System.out.println(whisky.getName() + ": alcVol: " + whisky.getVol() + " scores: " + whisky.getScore());
            } else {
                // Handle the case where the whisky object is null
                System.out.println("done");
            }
        }
    }
    
    

class WhiskyVolumeSorter {
    private Whisky[] whiskies;

    public WhiskyVolumeSorter(Whisky[] whiskies) {
        this.whiskies = whiskies;
    }

    public void printVolumeSortedWhiskies() {
        for (int i = 0; i < whiskies.length; i++) {
            for (int j = i+1; j < whiskies.length; j++) {
                if (whiskies[i].getVol() > whiskies[j].getVol()) {
                    Whisky temp = whiskies[i];
                    whiskies[i] = whiskies[j];
                    whiskies[j] = temp;
                }
            }
        }

        for (Whisky whisky : whiskies) {
            System.out.println(whisky.getName() + ": alcVol" + whisky.getVol() + "  " + whisky.getScore());
        }
    }
     }
}