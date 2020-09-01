package Set2;

import java.util.HashMap;
import java.util.Scanner;

public class Problem26 {
    public static void main(String[] args) {
        var items = new HashMap<Integer,Integer>(5);
        var bill  = new HashMap<Integer,Integer>();
        char choice = 'n';
        int discount = 0;
        int total_amount = 0;
        System.out.println("Enter 5 items id and item price");
        Scanner scan = new Scanner(System.in);
        for(int i=0;i<5;i++){
            int id  = scan.nextInt();
            int price = scan.nextInt();
            if(id != 0 || price != 0){
                items.put(id,price);
            }else{
                System.out.println("Sorry Wrong Input Please Execute Again");
                System.exit(0);
            }
        }
        do{
            System.out.println(" Please Enter the items id purchased  ");
            int pur_id = scan.nextInt();
            if(items.containsKey(pur_id)){
                System.out.println("Enter enter the Quantity ");
                int quantity = scan.nextInt();
                if(bill.containsKey(pur_id)){
                    bill.put(pur_id,bill.get(pur_id)+quantity);
                }else{
                    bill.put(pur_id,quantity);
                }
            }else{
                System.out.println("Sorry this Item Id does not exist please enter again ");
                choice = 'y';
            }
            System.out.println("To enter another item hit 'y' or else press any key : ");
            choice = scan.next().charAt(0);
        }while(choice=='y');
        System.out.println(" Enter Discord % ");
        discount = scan.nextInt();
        System.out.println(" ------------------BILL-----------------------");
        for (HashMap.Entry<Integer, Integer> set : bill.entrySet()) {
            total_amount+=set.getValue()*items.get(set.getKey());
            System.out.println(set.getKey() + " : "+ items.get(set.getKey()) +" : "+ set.getValue()+" : "+(set.getValue()*items.get(set.getKey())));
        }
        System.out.println("Amount : "+total_amount);
        System.out.println("Discount : "+discount+" %");
        System.out.println("Total Amount : "+(total_amount-(total_amount*(discount/100.0))));
        System.out.println(" --------------------------------------------");
    }
}
