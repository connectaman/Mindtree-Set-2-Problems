package Set2;
import java.util.Scanner;
public class ProblemSetSplit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the String Sentence ");
        String sentence = scan.nextLine();
        int no_of_word = countWord(sentence);
        System.out.println(" No. of Words : "+no_of_word);
    }
    public static int countWord(String s){
        int count = 0;
        int index = 0;
        String words = "";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' '){
                count++;
                System.out.println(words);
                words = "";
            }else if(i==s.length()-1) {
                count++;
                System.out.println(words+s.charAt(i));
                words = "";
            }else{
                words+=s.charAt(i);
            }
        }
        return count;
    }
}
// Fine Morning -input - how many words are there in string (write own split method) - (no substring)
// 46 - Validate Date (String)
// Binary Search
// Return index in binary search
