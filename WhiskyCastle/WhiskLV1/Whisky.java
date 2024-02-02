package WhiskLV1;

import java.util.HashMap;

public class Whisky {
	  
		private String name;
	    private int score;
	    private double vol;
	    private HashMap<String, String> tastingNote = new HashMap<>();
	    public Whisky(String name, int score, double vol) {
	        this.name = name;
	        this.score = score;
	        this.vol = vol;
	    }
//여기에 map 자료형을 추가하여 동적인 특성 할당
	    public String getName() {
	        return name;
	    }
	    public int getScore() {
	        return score;
	    }
	    public double getVol() {
	        return vol;
	    }
	    

}