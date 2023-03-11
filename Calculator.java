
/**
 *
 * @author karthika.R D
 */
import java.util.*;
public class Calculator {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int result=0;
        System.out.println("Enter Num 1 :");
        int n1=sc.nextInt();
        System.out.println("Enter Num 2 :");
        int n2=sc.nextInt();
        System.out.println("Choose Operator : ");
        char op=sc.next().charAt(0);
        switch(op)
        {
            case '+':
                result=n1+n2;
                break;
            case '-':
                result=n1-n2;
                break;
            case '*':
                result=n1*n2;
                break;
            case '/':
                result=n1/n2;
                break;
            default:
                System.out.println("Invalid Operator\n");
        }
        System.out.println("ANS = "+result);
    }
}
