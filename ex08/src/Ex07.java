import classes.Book;

import java.util.Scanner;

/*
    이차원...배열..

    학생관리 프로그램
    Student kor eng math
    1. 학생등록
    2. 학생목록
    3. 입력한 학생 국어점수 총점 (3명입력했으면 3명의 총점, 4명입력했으면 4명의 총점)
    4. 입력한 학생 영어점수 총점
    5. 입력한 학생 수학점수 총점
    6. 종료...
 */

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
//        for (int i = 0; i < book.length; i++) {
//            System.out.println(book[i]);
//        }
        for (int i = 0; i < book.length; i++) {
            book[i] = new Book("","");
        }


        Scanner in = new Scanner(System.in);
        BOOK:while (true) {
            System.out.println("""
                        1. 책 등록
                        2. 책 목록보기
                        3. 종료
                    """);
            int n = Integer.parseInt(in.nextLine());
            System.out.println(n);
            switch (n) {
                case 1:
                    System.out.println("책등록");
                    System.out.println("몇번째에 등록할래?");
                    int number = Integer.parseInt(in.nextLine());
                    System.out.println("책제목 입력");
                    String name = in.nextLine();
                    System.out.println("name = "+name);
                    System.out.println("책저자 입력");
                    String author = in.nextLine();
                    System.out.println("author = "+author);
                    book[number].name = name;
                    book[number].author = author;
                    break;
                case 2:
                    System.out.println("책목록");
                    for (int i = 0; i < book.length; i++) {
                        System.out.println(book[i]);
                    }
                    break;
                default:
                    System.out.println("종료됩니다.");
                    break BOOK;
            }
        }

    }
}
