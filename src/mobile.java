
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class mobile {
    int price;
    String model;
    String brand;
    public mobile(int price,String model, String brand){
        this.price = price;
        this.model = model;
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "mobile{" +
                "price=" + price +
                ", model='" + model + '\'' +
                ", brand='" + brand + '\'' +
                '}';
    }
}


