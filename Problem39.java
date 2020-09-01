package Set2;
import java.util.Scanner;
public class Problem39 {
    public static boolean isRowMagic(int[][] a,int n){
        int sum[] = new int[n];
        int sum_i=0;
        for(int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                sum[sum_i] += a[i][j];
            }
            sum_i++;
        }
        for (int i=0;i<n-1;i++){
            if(sum[i]!=sum[i+1]){
                return false;
            }
        }
        return true;
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
        System.out.println(isRowMagic(a,n));
    }
}
