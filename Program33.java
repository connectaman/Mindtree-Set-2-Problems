package Set2;
import java.util.Scanner;
class Student{
    private int studentId;
    private String studentName;
    private float marks;
    private boolean secondChance;

    public Student(int studentId, String studentName, boolean secondChance) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.secondChance = secondChance;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public float getMarks() {
        return marks;
    }

    public boolean isSecondChance() {
        return secondChance;
    }

    public void identifyMarks(float marks){
    if(!secondChance){
        this.marks = marks;
    }
    }
    public void identifyMarks(float marks1,float marks2){
    if(secondChance){
        this.marks = (marks1>marks2)?marks1:marks2;
    }
    }
}
public class Program33 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Students Marks Details : ");
        System.out.println("Enter Student Id : ");
        int id = scan.nextInt();
        System.out.println("Enter Student Name : ");
        String name = scan.next();
        System.out.println("Enter Student SecondChance : ");
        boolean chance = scan.nextBoolean();
        Student s = new Student(id,name,chance);
        if(chance){
            System.out.println("Enter Student Marks 1 : ");
            int marks1= scan.nextInt();
            System.out.println("Enter Student Marks 2 : ");
            int marks2= scan.nextInt();
            s.identifyMarks(marks1,marks2);
        }else{
            System.out.println("Enter Student Marks : ");
            int marks= scan.nextInt();
            s.identifyMarks(marks);
        }

        System.out.println("Student Details  : ");
        System.out.println("Student Id : "+s.getStudentId());
        System.out.println("Student Name : "+s.getStudentName());
        System.out.println("Student Marks: "+s.getMarks());

    }
}
