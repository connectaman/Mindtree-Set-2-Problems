package Set2;
import java.util.Scanner;
public class Problem36 {
    public static int[] isUnique(int array1[],int array2[]){
        int[] result = new int[(array1.length>array2.length)?array1.length:array1.length];
        int result_index = 0;
        for(int i=0;i< array1.length;i++){
            if(!isPresentInArray(array2,array1[i])){
                result[result_index++] = array1[i];
            }
        }
        for(int i=0;i< array2.length;i++){
            if(!isPresentInArray(array1,array2[i])){
                result[result_index++] = array2[i];
            }
        }
        return result;
    }
    public static boolean isPresentInArray(int array[],int key){
        for(int value:array){
            if(value==key){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of the Array ");
        int n = scan.nextInt();
        int array1[] = new int[n];
        int array2[] = new int[n];
        System.out.println("Enter the first array ");
        for(int i=0;i<n;i++){
            array1[i] = scan.nextInt();
        }
        System.out.println("Enter the second array ");
        for(int i=0;i<n;i++){
            array2[i] = scan.nextInt();
        }
        int result[] = isUnique(array1,array2);
        System.out.println("Unique Elements in Array : ");
        for(int value:result){
            System.out.print(value+" ");
        }
    }
}
