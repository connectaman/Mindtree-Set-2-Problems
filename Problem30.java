package Set2;

import java.util.Scanner;

class SavingAccount{
    private double balance;
    private int interestRate;
    private int accountNo;

    public SavingAccount(double balance, int interestRate, int accountNo) {
        this.balance = balance;
        this.interestRate = interestRate;
        this.accountNo = accountNo;
    }
    public void calculateInterest(){
        double si = (this.balance*(this.interestRate/100.0))/100.0;
        System.out.println(" Simple Interest for Balance : "+this.balance+" is "+si);
    }
    public void withDraw(double amount){
        if(this.balance<amount){
            System.out.println("Sorry the debit amount is more than the balance  ");
        }else{
            this.balance -= amount;
            System.out.println(" Successfully Withdrawn "+amount);
            System.out.println("Balance : "+this.balance);
        }
    }
}
public class Problem30 {
    public static void main(String[] args) {
        System.out.println("Enter Saving Account Details : ");
        Scanner scan = new Scanner(System.in);
        char repeat = 'y';
        System.out.println("Enter Account Number : ");
        int acc = scan.nextInt();
        System.out.println("Enter Interest Rate (%) : ");
        int rate = scan.nextInt();
        System.out.println("Enter balance : ");
        double bal = scan.nextDouble();
        SavingAccount sa = new SavingAccount(bal,rate,acc);

        do{
            System.out.println("Enter the Service : ");
            System.out.println("1- WithDraw amount ");
            System.out.println("2- Calculate Interest ");
            int choice = scan.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Enter the amount to withdraw : ");
                    int amount = scan.nextInt();
                    sa.withDraw(amount);
                    break;
                case 2:
                    sa.calculateInterest();
                    break;
                default:
                    System.out.println("Wrong Input");
            }
            System.out.println("Do you want to continue? 'y/n' ");
            repeat = scan.next().charAt(0);
        }while(repeat=='y');
    }
}
