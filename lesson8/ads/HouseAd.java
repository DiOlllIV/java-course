package lesson8.ads;

public class HouseAd extends Ad {
    String ownerName;
    String address;
    double square;
    int floors;


    public HouseAd(long id, int price, String address, double square, int floors) {
        super(id, price);
        this.address = address;
        this.square = square;
        this.floors = floors;
    }

    boolean checkOwnerOfAdd() {
        Owners owners = new Owners();
        for (String owner : owners.owners) {
            if (ownerName == owner)
                return true;
        }
        return false;
    }
}
