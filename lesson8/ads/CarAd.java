package lesson8.ads;

public class CarAd extends Ad {
    int yearOfmManufacturing;
    String ownerName;
    String color;
    double weight;
    int horsePower;

    public CarAd(long id, int price) {
        super(id, price);
    }
    void confirmAd() {
        // some logic
    }
}
