import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        Product chicken = new Chicken(1, "Chicken");
        Product rice = new Rice(2, "Rice");
        Product book = new Book(3, "Book");
        Product pen = new Pen(4, "Pen");
        Product laptop = new Laptop(5, "Laptop");
        Product phone = new Phone(6, "Phone");
        List<Product> products = new ArrayList<>();
        products.add(chicken); products.add(rice);
        products.add(book); products.add(pen);
        products.add(laptop); products.add(phone);
        
        System.out.println("\tID\tNAME\tCATEGORY" );
        for (Product p : products){
            System.out.println(p);
        }


    }
}
