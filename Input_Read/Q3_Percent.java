package Input_Read;
import java.util.Scanner;
public class Q3_Percent {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("Please enter fist subject marks");
        int first=ob.nextInt();
        System.out.println("Please enter second subject marks");
        int second=ob.nextInt();
        System.out.println("Please enter third subject marks");
        int third=ob.nextInt();
        int sum=first+second+third;
        System.out.println("Sum of all subjects are :"+sum);
        float per=sum/3;
        System.out.println("Percentage is :"+per);
        ob.close();
    }
}
