package WhiskLV1;

import java.util.ArrayList;

public class User implements ID {//���� ����
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
