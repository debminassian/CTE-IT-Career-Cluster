public class StudentRunner2
{
    public static void main(String[] args)
    {
        Student2 myStudent = new Student2();
        
        // Initially we should print out the default values
        System.out.println("Initial Name: " + myStudent.getName());
        System.out.println("Initial Grade: " + myStudent.getGrade());
        
        myStudent.setName("Talisha");
        myStudent.setGrade(10);
        
        System.out.println("Updated Name: " + myStudent.getName());
        System.out.println("Updated Grade: " + myStudent.getGrade());

    }
}
