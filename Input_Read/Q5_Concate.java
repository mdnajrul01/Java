package Input_Read;
import java.util.Scanner;
public class Q5_Concate {
   public static void main(String[] args) {
    Scanner ob=new Scanner(System.in);
    System.out.println("Please enter two words");
    String word1=ob.next();
    String word2=ob.next();
    System.out.println(word1+word2);
    ob.close();
   }
}
