import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Ex05 {
    public static void main(String[] args) {

        try {
            // 데이터베이스 연결
            Connection conn
                    = DriverManager.getConnection(DBInfo.URL,
                    DBInfo.USER,
                    DBInfo.PASSWORD);
            System.out.println("DB 연결 성공");

            // SQL 구문 작성
            PreparedStatement pstmt
                    = conn.prepareStatement("""
                                            drop table product;
                                            """);
            // sql 구문실행
            pstmt.executeUpdate();
            System.out.println("sql 구문  실행 성공");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
