import suhang.Student;

import java.util.ArrayList;
import java.util.List;

public class SuhangExample2 {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1,"김민수", 90));
        students.add(new Student(2,"이서연", 85));
        students.add(new Student(3,"박지훈", 95));

        System.out.println("[ 학생 전체 목록 ]");
        for (Student temp : students) {
            System.out.println(temp);
        }

        int total = 0;
        for (Student temp : students) {
            total += temp.getScore();
//            System.out.println("total ="+ total);
        }
        System.out.println("전체 학생 점수의 총합 = " + total);
        System.out.println("전체 학생 평균점수 = "+total/students.size());
        int count = 0;
        for (Student temp : students) {
            if(temp.getScore()>=90) count++;
        }
        System.out.println("90 점 이상인 학생 수 = "+count);

    }
}
