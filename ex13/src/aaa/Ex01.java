package aaa;

public class Ex01 {

    public static void main(String[] args) {
        Product products[] =
                new Product[5];

//        for (int i = 0; i < products.length; i++) {
        products[0] = new Product(1,"노트북",1200000,5);
        products[1] = new Product(2,"키보드",80000,12);
        products[2] = new Product(3,"마우스",40000,20);
        products[3] = new Product(4,"모니터",350000,8);
        products[4] = new Product(5,"헤드셋",100000,15);
//        }

//        1 노트북 1200000 5
//        2 키보드 80000 12
//        3 마우스 40000 20
//        4 모니터 350000 8
//        5 헤드셋 100000 15

        for (int i = 0; i < products.length; i++) {
            System.out.println(products[i]);
//            System.out.println(products[i].productNo);
        }

        int total = 0; // 전체 판매금액
        int total_sales = 0; // 전체 판매수량
        for (int i = 0; i < products.length; i++) {
            total = total + (products[i].price * products[i].sales);
            total_sales = total_sales + products[i].sales;
        }

    }
}
