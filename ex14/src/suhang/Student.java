package suhang;

public class Student {
    private int studentNo;
    private String name;
    private int score;
    @Override
    public String toString() {
        return "학생번호 = " + studentNo +
                ", 학생이름 = '" + name + '\'' +
                ", 점수 = " + score + "점";
    }

    public Student(){}
    public Student(int studentNo, String name, int score) {
        this.studentNo = studentNo;
        this.name = name;
        this.score = score;
    }

    public void setStudentNo(int studentNo) {
        this.studentNo = studentNo;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setScore(int score) {
        this.score = score;
    }

    public int getStudentNo() {
        return studentNo;
    }
    public String getName() {
        return name;
    }
    public int getScore() {
        return score;
    }
}
