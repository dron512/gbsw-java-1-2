public class Product {
    private String name;
    private int price;
    private int sales;

    public Product(String name, int price, int sales) {
        this.name = name;
        this.price = price;
        this.sales = sales;
    }

    public int getSales() {
        return sales;
    }

    @Override
    public String toString() {
//        return "Product{" +
//                "name='" + name + '\'' +
//                ", price=" + price +
//                ", sales=" + sales +
//                '}';
        return "상품이름 "+ name+" 상품가격 "+ price+"원 상품 판매량 "+ sales;
    }

    //    public String toString() {
//        return "이거 출력됨";
//    }

}
