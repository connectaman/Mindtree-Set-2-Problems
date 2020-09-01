package Set2;

import java.util.Scanner;

class StudentRecord{
    private int id;
    private String name;
    private String branch;
    private int score;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public StudentRecord(int id, String name, String branch, int score) {
        this.id = id;
        this.name = name;
        this.branch = branch;
        this.score = score;
    }

    public StudentRecord() {
    }

    public static StudentRecord getTopper(StudentRecord s[],int n){
        StudentRecord topper  = new StudentRecord();
        for(int i=0;i<n-1;i++){
            if(s[i].getScore() > s[i+1].getScore()){
                topper.setId(s[i].getId());
                topper.setName(s[i].getName());
                topper.setBranch(s[i].getBranch());
                topper.setScore(s[i].getScore());
            }else{
                topper.setId(s[i+1].getId());
                topper.setName(s[i+1].getName());
                topper.setBranch(s[i+1].getBranch());
                topper.setScore(s[i+1].getScore());
            }
        }

        return topper;
    }
}
public class Problem35 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(" Enter the size of record ");
        int n = scan.nextInt();
        StudentRecord[] s = new StudentRecord[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter Student id ");
            int id = scan.nextInt();
            System.out.println("Enter Student name ");
            String name = scan.next();
            System.out.println("Enter Student Branch");
            String branch = scan.next();
            System.out.println("Enter Student mark scored ");
            int score = scan.nextInt();
            s[i] = new StudentRecord(id,name,branch,score);
        }
        System.out.println(" Topper Details : ");
        StudentRecord topper = StudentRecord.getTopper(s,n);
        System.out.println("Student Id :"+topper.getId());
        System.out.println("Student Name :"+topper.getName());
        System.out.println("Student Branch :"+topper.getBranch());
        System.out.println("Student Score :"+topper.getScore());
    }
}
