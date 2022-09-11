package lesson8.phonesExample;

public class Phone {
    int price;
    double weight;
    String countryProduced;

    public Phone(int price, double weight, String countryProduced) {
        System.out.println("phone constructor was invoked");
        this.price = price;
        this.weight = weight;
        this.countryProduced = countryProduced;
    }

    public void orderPhone() {
        //
        System.out.println("order phone invoked");
    }
}
