package Set2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Bank{
    private int custId;
    private String custName;
    private String custAddress;
    private String accType;
    private double custBalance;

    public int getCustId() {
        return custId;
    }

    public void setCustId(int custId) {
        this.custId = custId;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public String getCustAddress() {
        return custAddress;
    }

    public void setCustAddress(String custAddress) {
        this.custAddress = custAddress;
    }

    public String getAccType() {
        return accType;
    }

    public void setAccType(String accType) {
        this.accType = accType;
    }

    public double getCustBalance() {
        return custBalance;
    }

    public void setCustBalance(double custBalance) {
        this.custBalance = custBalance;
    }

    public Bank(int custId, String custName, String custAddress) {
        this.custId = custId;
        this.custName = custName;
        this.custAddress = custAddress;
        this.accType = "SB";
        this.custBalance = 0.0;
    }

    public Bank(int custId, String custName) {
        this.custId = custId;
        this.custName = custName;
        this.custAddress = "Not Defined";
        this.accType = "SB";
        this.custBalance = 0.0;
    }

    public Bank(int custId, String custName, String custAddress, String accType, double custBalance) {
        this.custId = custId;
        this.custName = custName;
        this.custAddress = custAddress;
        this.accType = accType;
        this.custBalance = custBalance;
    }
}
public class Problem29 {
    public static void main(String[] args)throws IOException {
        BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the Customer Details : ");
        System.out.println("Enter Id : ");
        int id = Integer.parseInt(obj.readLine());
        System.out.println("Enter Name : ");
        String name = obj.readLine();
        System.out.println("Enter Address : ");
        String address = obj.readLine();
        System.out.println("Enter Account Type : ");
        String acc = obj.readLine();
        System.out.println("Enter Balance : ");
        String bal = obj.readLine();
        Bank bank = new Bank(id,name,(address.equals(""))?"Not Defined":address,(acc.equals(""))?"SB":acc, ((bal.equals("")))? 0.0 :Double.parseDouble(bal));
        System.out.println("Customer Details");
        System.out.println("Id : "+bank.getCustId());
        System.out.println("Name : "+bank.getCustName());
        System.out.println("Address : "+bank.getCustAddress());
        System.out.println("AccType : "+bank.getAccType());
        System.out.println("Balance : "+bank.getCustBalance());

    }
}
