public class Ex03 {

    public static void main(String[] args) {
        String a = "aaa";
        String b = new String("aaa");
        String c = a;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);

        System.out.println(a == b);
        System.out.println(a == c);

        System.out.println(a.equals(b));
        System.out.println(a.equals(c));
    }
}
