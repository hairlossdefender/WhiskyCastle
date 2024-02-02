package WhiskLV1;

import java.util.ArrayList;

public class Library {//���̺귯���� ��� ���� ���� ����Ű���� ������ ������ �س��� ����
	private ArrayList<User> users;
    private ArrayList<LiquorShop> shops;
    private ArrayList<Whisky> whiskies;

    public Library() {
        users = new ArrayList<>();
        shops = new ArrayList<>();
        whiskies = new ArrayList<>();
    }
//�Ʒ� �޼ҵ�� �ߺ��˻� �ʿ�
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
