import cont.Student;

public class Ex06 {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = s1;

        System.out.println(s1==s2);
        System.out.println(s1==s3);

        s1.name="AAA";
        System.out.println(s1.name);
        System.out.println(s2.name);
        System.out.println(s3.name);
    }
}
