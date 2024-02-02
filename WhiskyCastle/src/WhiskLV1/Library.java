package WhiskLV1;

import java.util.ArrayList;

public class Library {//라이브러리는 모든 유저 가게 위스키들의 정보를 총정리 해놓는 역할
	private ArrayList<User> users;
    private ArrayList<LiquorShop> shops;
    private ArrayList<Whisky> whiskies;

    public Library() {
        users = new ArrayList<>();
        shops = new ArrayList<>();
        whiskies = new ArrayList<>();
    }
//아래 메소드들 중복검사 필요
    public void addUser(User user) {
        users.add(user);
    }

    public void addShop(LiquorShop shop) {
        shops.add(shop);
    }

    public void addWhisky(Whisky whisky) {
        whiskies.add(whisky);
    }

   

    public ArrayList<User> getUsers() {
        return users;
    }

    public ArrayList<LiquorShop> getShops() {
        return shops;
    }

    public ArrayList<Whisky> getWhiskies() {
        return whiskies;
    }
}
