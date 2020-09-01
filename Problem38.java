package Set2;
import java.util.Scanner;
public class Problem38 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of N ");
        int n = scan.nextInt();
        int[][] a = new int[n][n];
        int[][] b = new int[n][n];
        int[][] c = new int[n][n];
        System.out.println("Enter the first Matrix : ");
        for(int i=0;i<n;i++){
           for (int j=0;j<n;j++){
               a[i][j] = scan.nextInt();
           }
        }
        System.out.println("Enter the second Matrix : ");
        for(int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                b[i][j] = scan.nextInt();
            }
        }
        for(int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                c[i][j] = a[i][j]+b[i][j];
            }
        }
        System.out.println("The resultant Matrix : ");
        for(int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
    }
}
