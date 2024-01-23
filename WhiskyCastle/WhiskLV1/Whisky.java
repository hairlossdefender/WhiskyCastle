package WhiskLV1;

public class Whisky {
	  
		private String name;
	    private int score;
	    private double vol;
	    public Whisky(String name, int score, double vol) {
	        this.name = name;
	        this.score = score;
	        this.vol = vol;
	    }

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