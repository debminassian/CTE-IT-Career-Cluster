public class Student2 extends Person2 {

    private int grade;
    private double gpa;

    public Student2(String name, String birthday, int grade, double gpa){
        super(name, birthday);
        this.grade = grade;
        this.gpa = gpa;
    }

    public int getGrade(){
        return grade;
    }

    public double getGpa(){
        return gpa;
    }
}
