// 싱글톤...
// 메모리 객체 생성한것 한개만 두고 사용하자..

public class Ex05 {
    public static void main(String[] args) {
        Database db1 = Database.getInstance();
        Database db2 = Database.getInstance();

        System.out.println(db1);
        System.out.println(db2);

//        Database db1 = new Database();
//        System.out.println(db1);
//
//        Database db2 = new Database();
//        System.out.println(db2);

        // jvm 메모리할당을 계속 하면 안된다..

//        Scanner input = new Scanner(System.in);
//        input.nextLine();
//
//        Scanner input2 = new Scanner(System.in);
//        input2.nextLine();
//
//        Scanner input3 = new Scanner(System.in);
//        input3.nextLine();
    }
}
