package Input_Read;
import java.util.Scanner;
public class Q4_AddNumber {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("Please enter two numbers");
        int no1=ob.nextInt();
        int no2=ob.nextInt();
        System.out.println(no1+no2);
        System.out.println("Please enter two numbers");
        no1=ob.nextInt();
        no2=ob.nextInt();
        System.out.println(no1+no2);
        System.out.println("Please enter two numbers");
        no1=ob.nextInt();
        no2=ob.nextInt();
        System.out.println(no1+no2);
        ob.close();
    }
}
