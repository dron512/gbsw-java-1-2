package aaa;

class Product {
    int productNo;
    String name;
    int price;
    int sales;

    public Product(int productNo, String name, int price, int sales) {
        this.productNo = productNo;
        this.name = name;
        this.price = price;
        this.sales = sales;
    }

    @Override
    public String toString() {
        return "상품번호=" + productNo +
                ", 이름='" + name + '\'' +
                ", 가격=" + price + "원"+
                ", 판매개수=" + sales +"개";
    }
}
