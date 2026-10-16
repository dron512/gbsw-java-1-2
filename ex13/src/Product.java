public class Product {

    // 1. toString, 2. 생성자, 3. setter getter

    private int productNo;
    private String name;
    private int price;
    private int sales;

    @Override
    public String toString() {
        return "Product{" +
                "productNo=" + productNo +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", sales=" + sales +
                '}';
    }
    public Prodxuct(){}
    // 다른생성자 선언시 기본생성자 생략불가...
    public Product(int productNo, String name, int price, int sales) {
        this.productNo = productNo;
        this.name = name;
        this.price = price;
        this.sales = sales;
    }

    public int getProductNo() {
        return productNo;
    }

    public void setProductNo(int productNo) {
        this.productNo = productNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getSales() {
        return sales;
    }

    public void setSales(int sales) {
        this.sales = sales;
    }
}
