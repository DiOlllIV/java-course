package lesson8.phonesExample;

public class Demo {
    public static void main(String[] args) {
        IPhone iPhone = new IPhone(1000, 2, "China", true);
        iPhone.deleteIPhoneFromDb();
    }
}
