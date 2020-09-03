package Set2;
import java.util.*;
class Employee_Details{
    private String name;
    private int salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Employee_Details(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }
}
public class ProblemSetCall {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of Employee : ");
        int n = scan.nextInt();
        Employee_Details[] e = new Employee_Details[n];
        System.out.println("Enter Employee Details");
        for(int i=0;i<n;i++){
            System.out.println("Enter Employee Name : ");
            String name = scan.next();
            System.out.println("Enter Employee Salary : ");
            int sal = scan.nextInt();
            e[i] = new Employee_Details(name,sal);
        }
        System.out.println("1 - Display All Employee ");
        System.out.println("2 - Display Employee within the salary specified ");
        System.out.println("Enter your choice : ");
        int choice = scan.nextInt();
        switch (choice){
            case 1:
                displayAllEmployee(e,n);
                break;
            case 2:
                System.out.println("Enter the salary to display the employees below the salary : ");
                int salary = scan.nextInt();
                displayBasedOnSalary(e,n,salary);
                break;
            default:
                System.out.println("Wrong Input");
        }
    }

    private static void displayAllEmployee(Employee_Details[] e, int n) {
        System.out.println("Displaying All Employee ");
        for(int i=0;i<n;i++){
            System.out.println(e[i].getName()+" : "+e[i].getSalary());
        }
    }

    public static void displayBasedOnSalary(Employee_Details e[],int n,int salary){
        Employee_Details[] sal = new Employee_Details[n];
        int index= 0;
        for(int i=0;i<n;i++){
            if(e[i].getSalary()<salary){
                sal[index++] = e[i];
            }
        }
        // Sorting Employee Name whos salary is less than specified
        // Using Simple Bubble Sort Method
        for(int i=0;i<index-1;i++){
            for(int j=0;j<index-1;j++){
                if(sal[j].getName().compareTo(sal[j+1].getName())<0){
                    Employee_Details temp = sal[j];
                    sal[j] = sal[j+1];
                    sal[j+1] = temp;
                }
            }
        }
        // im not able to hear u
        // your voice is cracking
        System.out.println("Displaying Employee Salary (in Dec Order )");
        for(int i=0;i<index;i++){
            System.out.println(sal[i].getName()+" : "+sal[i].getSalary());
        }
    }
}
// Fine Morning -input - how many words are there in string (write own split method) - (no substring)
