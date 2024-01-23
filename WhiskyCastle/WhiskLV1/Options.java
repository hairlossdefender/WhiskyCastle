package WhiskLV1;

public class Options {
	public Whisky getWhisky(Whisky[] whiskies, int index) {
	    if (index < 0 || index >= whiskies.length) {
	        throw new IndexOutOfBoundsException("Index " + index + " is out of bounds");
	    }
	    return whiskies[index];
	}}

