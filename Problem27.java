package Set2;

import java.util.Scanner;

class Employee{
    private int empid;
    private String empName;
    private String empDesig;
    private String empDept;

    public int getEmpid() {
        return empid;
    }

    public void setEmpid(int empid) {
        this.empid = empid;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) throws Exception {
            this.empName = empName;
    }

    public String getEmpDesig() {
        return empDesig;
    }

    public void setEmpDesig(String empDesig) throws Exception {
       this.empDesig = empDesig;
    }

    public String getEmpDept() {
        return empDept;
    }

    public void setEmpDept(String empDept) throws Exception{
       this.empDept = empDept;
    }

    public Employee(int empid, String empName, String empDesig, String empDept) throws Exception {
        this.setEmpid(empid);
        this.setEmpName(empName);
        this.setEmpDesig(empDesig);
        this.setEmpDept(empDept);
    }
}
public class Problem27 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of employee details to enter : ");
        int n = scan.nextInt();
        boolean isvalid = true;
        Employee[] employee = new Employee[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter Employee Id : ");
            int id = scan.nextInt();
            System.out.println("Enter Employee Name : ");
            String name = scan.next();
            if(name==null || name==""){
                System.out.println("Please Enter proper Name");
                isvalid = false;
                break;
            }
            System.out.println("Enter Employee Designation : ");
            String desig = scan.next();
            if(!(desig.equalsIgnoreCase("developer")||desig.equalsIgnoreCase("tester")||desig.equalsIgnoreCase("lead")||desig.equalsIgnoreCase("manager"))){
                System.out.println("Employee Department Incorrect");
                isvalid = false;
                break;
            }
            System.out.println("Enter Employee Department : ");
            String dept = scan.next();
            if(!(dept.equalsIgnoreCase("TTH")||dept.equalsIgnoreCase("RCM")||dept.equalsIgnoreCase("Digital")||dept.equalsIgnoreCase("Devops"))){
                System.out.println("Employee Department Incorrect");
                isvalid = false;
                break;
            }
            try{
                employee[i] = new Employee(id,name,desig,dept);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        if(isvalid){
            System.out.println(" Employee Details : ");
            for(int i=0;i<n;i++){
                System.out.println(employee[i].getEmpid()+" : "+employee[i].getEmpName()+" : "+employee[i].getEmpDesig()+" : "+employee[i].getEmpDept());
            }
        }
    }
}
