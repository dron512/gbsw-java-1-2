import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Ex01 {
    private static final String URL
            = "jdbc:mysql://localhost:3306/java?serverTimezone=Asia/Seoul&characterEncoding=UTF-8";
    private static final String USER = "root";
    private static final String PASSWORD = "1234";

    public static void main(String[] args) {
//        try{
//            int a = 10/0;   // 0으로 나눌 수 없습니다.
//            System.out.println("a = "+a);
//        }catch (Exception e){
//            e.printStackTrace();
//        }
//        System.out.println("프로그램 종료");

        try{
            // 접속해라...
            Connection conn
                    = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("디비 접속 성공");

            // sql 만들어라
            PreparedStatement pstmt =
                    conn.prepareStatement("""
                                            insert into student
                                            (name,score)
                                            values
                                            ('김지후',100);
                                            """);
            pstmt.executeUpdate();
            System.out.println("실행성공");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
