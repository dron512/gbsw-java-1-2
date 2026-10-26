import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DBManager {
    public void createTable() {
        try {
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
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void dropTable() {
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

    // 행입력
    public void insertRow(String name, int price, int sales) {
        try {
            // db 연결하기
            Connection conn =
                    DriverManager.getConnection(DBInfo.URL,
                            DBInfo.USER,
                            DBInfo.PASSWORD);
            System.out.println("DB 연결 성공");

            // sql 구문 작성
            PreparedStatement pstmt
                    = conn.prepareStatement(
                    """
                            insert into product
                            (name,price,sales)
                            values
                            (?,?,?);
                            """);

            pstmt.setString(1, name);
            pstmt.setInt(2, price);
            pstmt.setInt(3, sales);

            pstmt.executeUpdate();
            System.out.println("sql 구문  실행 성공");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
