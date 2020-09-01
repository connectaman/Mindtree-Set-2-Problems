package Set2;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class Book{
    private String title;
    private int price;
    private int year_of_publication;
    private String author;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getYear_of_publication() {
        return year_of_publication;
    }

    public void setYear_of_publication(int year_of_publication) {
        this.year_of_publication = year_of_publication;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Book(String title, int price, int year_of_publication, String author) {
        this.title = title;
        this.price = price;
        this.year_of_publication = year_of_publication;
        this.author = author;
    }
}
public class Problem28 {
    public static void main(String[] args) throws IOException {
        BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
        Book[] books = new Book[3];
        System.out.println("Enter 3 books details : ");
        for(int i=0;i<3;i++){
         System.out.println("Enter Title : ");
         String title = obj.readLine();
         System.out.println("Enter Price : ");
         int price = Integer.parseInt(obj.readLine());
         System.out.println("Enter year of publication : ");
         int y_o_p = Integer.parseInt(obj.readLine());
         System.out.println("Enter Author Name : ");
         String name =  obj.readLine();
         books[i] = new Book(title,price,y_o_p,name);
        }
        System.out.println(" Display the Books : ");
        for(int i=0;i<3;i++){
            System.out.println(books[i].getAuthor()+", "+books[i].getTitle()+", $"+books[i].getPrice()+", "+books[i].getYear_of_publication());
        }
    }
}
