package lesson7.hw;


import java.util.Date;

public class Demo {

    public static void main(String[] args) {
        createDealAndCallMethods();
        createDeal();
    }

    public static Deal createDeal() {
        Deal dealObject = new Deal(100, new Date(), false, null, "Dnipro", "Ukraine", "Buy");
        System.out.println(dealObject.isValidType());
        return dealObject;
    }

    public static Deal createDealAndCallMethods() {
        Deal dealObject = new Deal(100, new Date(), true, new Date(), "Kyiv", "Ukraine", "SomeValue");
        System.out.println(dealObject.checkPrice());
        dealObject.confirmDeal();
        System.out.println(dealObject.isValidType());
        return dealObject;
    }

}
