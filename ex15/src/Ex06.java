import java.util.Scanner;

public class Ex06 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DBManager dbManager = new DBManager();

        while(true) {
            System.out.println("""
                    1. 테이블 생성
                    2. 테이블 삭제
                    3. 행 입력
                    4. 행 조회
                    5. 종료
                    """);
            int menu = Integer.parseInt(scanner.nextLine());
            if( menu == 1 ){
                dbManager.createTable();
                System.out.println("테이블 생성");
            }
            else if( menu == 2 ){
                dbManager.dropTable();
                System.out.println("테이블 삭제");
            }
            else if( menu == 3 ){
                System.out.println("상품명 입력");
                String name = scanner.nextLine();
                System.out.println("가격 입력");
                int price = Integer.parseInt(scanner.nextLine());
                System.out.println("판매량 입력");
                int sales = Integer.parseInt(scanner.nextLine());

                dbManager.insertRow(name,price,sales);
                System.out.println("행 입력");
            }
            else if( menu == 4 ){ System.out.println("행 조회"); }
            else{ System.out.println("종료"); break; }

        }
    }
}
