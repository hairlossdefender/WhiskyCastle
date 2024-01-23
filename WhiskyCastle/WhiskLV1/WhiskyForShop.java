package WhiskLV1;

public class WhiskyForShop extends Whisky {

    private double price;

    public WhiskyForShop(String name, int score, double vol, double price) {
        super(name, score, vol);
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}