import java.util.ArrayList;
import java.util.List;

public class Phones {
    public static void main(String[] args) {
        List<mobile> mobileList = new ArrayList<mobile>();
        mobileList.add(new mobile(5000, "s4", "Samsung"));
        mobileList.add(new mobile(10000, "s5", "Redmi"));
        mobileList.add(new mobile(15000, "s7", "MI"));
        mobileList.add(new mobile(20000, "4", "Oneplus"));
        mobileList.add(new mobile(50000, "14", "Apple"));
        mobileList.stream().filter(i -> i.price >= 10000).forEach(i -> System.out.println(i.price + "  " + i.brand));
    }
}
