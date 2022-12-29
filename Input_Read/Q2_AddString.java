package Input_Read;
import java.util.Scanner;
public class Q2_AddString {
    public static void main(String[] args) {
    Scanner ob= new Scanner(System.in);
    System.out.println("Please enter first text");
    String first=ob.next();
    System.out.println("Please enter second text");
    String second=ob.next();
    System.out.println("Add is :"+first+second);
    ob.close();
    }
}
