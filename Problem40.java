package Set2;
import java.util.Scanner;
public class Problem40 {
    public static boolean isMagic(int a[][],int n){
        int sum_row=0;
        int sum_col=0;
        int sum_dia1=0;
        int sum_dia2=0;
        for(int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                sum_row += a[i][j];
            }
        }
        for(int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                sum_col += a[j][i];
            }
        }
        for(int i=0;i<n;i++){
            for (int j=0;j<n;j++) {
                sum_dia1+= a[i][i];
            }
        }
        for(int i=n-1;i>=0;i--){
            for (int j=0;j<n;j++) {
                sum_dia2 += a[i][i];
            }
        }
        if((sum_row == sum_col) && (sum_col==sum_dia1) && (sum_dia1 == sum_dia2)){
            return  true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of N ");
        int n = scan.nextInt();
        int[][] a = new int[n][n];
        System.out.println("Enter the first Matrix : ");
        for(int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                a[i][j] = scan.nextInt();
            }
        }
        System.out.println(isMagic(a,n));
    }
}
