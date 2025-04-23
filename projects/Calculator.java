package projects;
import java.util.*;
public class Calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to Calculator world");
        System.out.print("Enter Your First Number: ");
        double n1=sc.nextDouble();
        System.out.print("Enter Any These Operator(+,-,*,/): ");
        char ch=sc.next().charAt(0);
        System.out.print("Enter Your Second Number: ");
        double n2=sc.nextDouble();
        switch(ch){
            case '+':
            double res=n1+n2;
            System.out.println(res);
            break;
            case '-':
             System.out.println(n1-n2);
             break;
             case '*':
             System.out.println(n1*n2);
             break;
             case '/':
             if(n2==0){
                System.out.println("Denominator is Zero : Error");
             }
             else {
                System.out.println(n1/n2);
             }
             break;
            default:
            System.out.println("Please Enter A Valid Operator From Them (+,-,*,/)");
            break;
        }
        sc.close();
    }
}
