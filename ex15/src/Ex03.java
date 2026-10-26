import java.util.ArrayList;
import java.util.List;

public class Ex03 {

    public static void main(String[] args) {
//        Product p = new Product("사과",1000,100);
//        System.out.println(p);
        List<Product> list = new ArrayList<>();

        list.add(new Product("사과",1000,100));
        list.add(new Product("바나나",2000,200));
        list.add(new Product("오렌지",3000,300));

        for (Product p : list) {
            System.out.println(p);
        }

        int sales_total = 0;
        for (Product p : list) {
            sales_total = sales_total + p.getSales();
        }

        System.out.println("총 판매량"+sales_total);

    }
}
