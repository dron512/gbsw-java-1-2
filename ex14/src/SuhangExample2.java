import suhang.Student;

import java.util.ArrayList;
import java.util.List;

public class SuhangExample2 {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1,"김민수", 90));
        students.add(new Student(2,"이서연", 85));
        students.add(new Student(3,"박지훈", 95));

        System.out.println(students);
    }
}
