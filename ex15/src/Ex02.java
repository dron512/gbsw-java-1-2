import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Ex02 {
    private static final String URL
            = "jdbc:mysql://localhost:3306/java?serverTimezone=Asia/Seoul&characterEncoding=UTF-8";
    private static final String USER = "root";
    private static final String PASSWORD = "1234";

    public static void main(String[] args) {
        try{
            // 접속해라...
            Connection conn
                    = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("디비 접속 성공");

            // sql 작성
            PreparedStatement pstmt =
                    conn.prepareStatement("""
                                            select * from student;
                                            """);
            // sql 실행
            ResultSet rs = pstmt.executeQuery();

            // sql 결과 출력
            while(rs.next()){ // 그 다음 행이 있으면
                // name 컬럼 가져와서 출력
                System.out.print(rs.getString("name"));
                // score 컬럼 가져와서 출력
                System.out.println(rs.getInt("score"));
            }
        }catch (Exception e){
            e.printStackTrace();
        }

    }

}
