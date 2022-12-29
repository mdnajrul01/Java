// Input name, roll number and field of interest from user and print in the format below :
// Name: xyz, Roll number: xyz, Field of interest: xyz
package Input_Read;
import java.util.Scanner ;
public class Q1_Input {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("Please enter name,roll no and field of interest");
        String name =ob.nextLine();
        int roll=ob.nextInt();
        String interest=ob.next();
        System.out.println("Name is "+name);
        System.out.println("ROll no is "+roll);
        System.out.println("Interest is "+interest);
        ob.close();
    }
}
