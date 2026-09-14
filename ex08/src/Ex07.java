import classes.Book;

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        // 배열을 사용하여 배열의 크기는 10개로 지정
        // 책 관리 프로그램을 만들자.

        // 1. 책 등록
        // 2. 책 목록 보기
        // 3. 종료
        Book book[] = new Book[10];
        // 1. Arrays.toString()
        // 2. for 구문으로 출력하는방법
        for (int i = 0; i < book.length; i++) {
            System.out.println(book[i]);
        }
        for (int i = 0; i < book.length; i++) {
            book[i] = new Book();
        }
        for (int i = 0; i < book.length; i++) {
            System.out.println(book[i]);
        }

        Scanner in = new Scanner(System.in);
        BOOK:while (true) {
            System.out.println("""
                        1. 책 등록
                        2. 책 목록보기
                        3. 종료
                    """);
            int n = in.nextInt();
            System.out.println(n);
            switch (n) {
                case 1:
                    System.out.println("책등록");
                    break;
                case 2:
                    System.out.println("책목록");
                    break;
                default:
                    System.out.println("종료됩니다.");
                    break BOOK;
            }
        }

    }
}
