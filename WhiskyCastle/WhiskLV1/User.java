package WhiskLV1;

import java.util.ArrayList;

public class User implements ID {//개별 유저
	private ArrayList<Whisky> whiskies;
	private String id;
	
	public User(String i) {
		this.id=i;
		whiskies=null;
	}
@Override
	public String getID() {
	// TODO Auto-generated method stub
	return id;
}
}
