//

public class Ex01 {
    /*
1 노트북 1200000 5
2 키보드 80000 12
3 마우스 40000 20
4 모니터 350000 8
5 헤드셋 100000 15
*/
    public static void main(String[] args) {
        Product product1 = new Product(1,"노트북" ,1200000,5);
        Product product2 = new Product(2,"키보드" ,80000,12);
        Product product3 = new Product(3,"마우스" ,40000,20);
        Product product4 = new Product(4,"모니터" ,350000,8);
        Product product5 = new Product(5,"헤드셋" ,100000,12);
        // 배열을 선언하고 for 구문으로 바꿔야 합니다.
//        System.out.println(product1);
        Product products[] = new Product[5];
//        System.out.println(products[0]);
        for (int i = 0; i < products.length; i++) {
            products[i] = new Product();
        }

        products[0].setProductNo(1);
        products[0].setName("노트북");
        products[0].setPrice(1200000);
        products[0].setSales(5);

        products[1].setProductNo(2);
        products[1].setName("키보드");
        products[1].setPrice(80000);
        products[1].setSales(12);

        products[2].setProductNo(3);
        products[2].setName("마우스");
        products[2].setPrice(40000);
        products[2].setSales(20);

        products[3].setProductNo(4);
        products[3].setName("모니터");
        products[3].setPrice(350000);
        products[3].setSales(8);

        products[4].setProductNo(5);
        products[4].setName("헤드셋");
        products[4].setPrice(100000);
        products[4].setSales(12);

        for (int i = 0; i < products.length; i++) {
            System.out.println(products[i]);
        }

        int 전체판매량 = 0;
        int 전체매출량 = 0;

        for (int i = 0; i < products.length; i++) {
            전체판매량 = 전체판매량 + products[i].getSales();
            전체매출량
                = 전체매출량 + products[i].getSales() * products[i].getPrice();
        }

        System.out.println("전체판매량 = "+전체판매량);
        System.out.println("전체매출량 = "+전체매출량);

        // 상품별 판매량
        // 상품별 전체 판매금액
        // 상품별 판매가 제일 많이된거
        // 상품별 판매개수가 제일 많이 된거를 찾아보라..

    }

}
