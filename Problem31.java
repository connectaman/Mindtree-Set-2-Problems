package Set2;

import java.util.Scanner;

class Customer{
    private String name;
    private String MobileNo;
    private double feedbackRating;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobileNo() {
        return MobileNo;
    }

    public void setMobileNo(String mobileNo) {
        MobileNo = mobileNo;
    }

    public double getFeedbackRating() {
        return feedbackRating;
    }

    public void setFeedbackRating(double feedbackRating) {
        this.feedbackRating = feedbackRating;
    }

    public Customer(String name, String mobileNo, double feedbackRating) {
        this.name = name;
        MobileNo = mobileNo;
        this.feedbackRating = feedbackRating;
    }
}
public class Problem31 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;
        System.out.println("Enter Number of Customer : ");
        n  = scan.nextInt();
        Customer[] customers = new Customer[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter Customer Name : ");
            String name = scan.next();
            System.out.println("Enter Customer Mobile Number : ");
            String mobile = scan.next();
            System.out.println(" Enter Customer Feedback Rating : ");
            double rating = scan.nextDouble();
            customers[i] = new Customer(name,mobile,rating);
        }
        System.out.println("Customer Rating : ");
        for(int i=0;i<n;i++){
            System.out.println("Customer "+(i+1)+" : "+customers[i].getFeedbackRating()+" out of 5");
        }
    }
}

