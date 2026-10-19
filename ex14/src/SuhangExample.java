import suhang.Student;

import java.util.ArrayList;
import java.util.List;

public class SuhangExample {
    public static void main(String[] args) {

//        Student ary[] = new Student[5];
        List<Student> list = new ArrayList<>();

        Student s1 = new Student();
        s1.setStudentNo(10);
        s1.setName("홍길동");
        s1.setScore(100);
        list.add(s1);

        Student temp = list.get(0);
        System.out.println("학생 번호 = "+list.get(0).getStudentNo());
        System.out.println("학생 이름 = "+temp.getName());
        System.out.println("학생 성적 = "+temp.getScore());

        Student s2 = new Student(2,"김길동",90);
        list.add(s2);

        Student temp2 = list.get(1);
        System.out.println("학생 번호 = "+temp2.getStudentNo());
        System.out.println("학생 이름 = "+temp2.getName());
        System.out.println("학생 성적 = "+temp2.getScore());

    }
}
