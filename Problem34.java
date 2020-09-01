package Set2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Students{
    private int id;
    private String name;
    private String branch;

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

    public Students(int id, String name, String branch) {
        this.id = id;
        this.name = name;
        this.branch = branch;
    }
}
public class Problem34{
    public static void main(String[] args) throws IOException {
        BufferedReader obj = new BufferedReader(new InputStreamReader((System.in)));
        System.out.println("Enter the size of Record : ");
        int n = Integer.parseInt(obj.readLine());
        Students[] students = new Students[n];
        System.out.println("Enter students details : ");
        for(int i=0;i<n;i++){
            System.out.println("Enter student id ");
            int id = Integer.parseInt(obj.readLine());
            System.out.println("Enter student name ");
            String name = obj.readLine();
            System.out.println("Enter student branch ");
            String branch = obj.readLine();
            students[i] = new Students(id,name,branch);
        }
        sortByStudentId(students,n);
        sortStudentByNameAndBranch(students,n);
    }
    public static void sortByStudentId(Students s[],int n){
        for (int i=n;i>=0;i--){
           for(int j=0;j<i-1;j++){
               if(s[j].getId()>s[j+1].getId()){
                   Students temp = s[j];
                   s[j] = s[j+1];
                   s[j+1] = temp;
               }
           }
        }
        System.out.println("Student Data Sorted Based on ID: ");{
            for(int i=0;i<n;i++){
                System.out.println(s[i].getId()+" : "+s[i].getName()+" : "+s[i].getBranch());
            }
        }
    }
    public static void sortStudentByNameAndBranch(Students s[],int n){
        for (int i = 0; i < n; i++)
        {
            for (int j = i + 1; j < n; j++) {
                if (s[i].getBranch().compareTo(s[j].getBranch())>0)
                {
                    Students temp = s[i];
                    s[i] = s[j];
                    s[j] = temp;
                }
            }
        }
        System.out.println("Student Data Sorted Based on Branch : ");{
            for(int i=0;i<n;i++){
                System.out.println(s[i].getId()+" : "+s[i].getName()+" : "+s[i].getBranch());
            }
        }
    }
}
