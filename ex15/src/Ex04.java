import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Ex04 {

    public static void main(String[] args) {

        try{
            // 데이터베이스 연결
            Connection conn
                    = DriverManager.getConnection(DBInfo.URL,
                                                    DBInfo.USER,
                                                    DBInfo.PASSWORD);
            System.out.println("DB 연결 성공");

            // SQL 구문 작성
            PreparedStatement pstmt = conn.prepareStatement("""
                                    create table product(
                                    	id int primary key auto_increment,
                                    	name varchar(100),
                                    	price int,
                                    	sales int
                                    );
                                    """);
            // sql 구문실행
            pstmt.executeUpdate();
            System.out.println("sql 구문 실행 성공");
        }catch (Exception e){
            e.printStackTrace();
        }



//        System.out.println(DBInfo.URL);
//        System.out.println(DBInfo.USER);
//        System.out.println(DBInfo.PASSWORD);

    }

}
