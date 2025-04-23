package projects;
import java.util.*;
public class Guess_Number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Random rand=new Random();
        int rno=rand.nextInt(1,100);
        System.err.println("Enter Your Guess Between 1 to 99");
        int number=sc.nextInt();
        while(true){
            if(1<=number && number<=99){
                if(number==rno){
                    System.err.println("Wow , You got the correct guess ");
                    break;
                }
                else if(number > rno) {
                     System.out.println("Number is too large ! Try again,  ");
                     number=sc.nextInt();
                }
                else {
                    System.out.println("Number is too small ! Try again, ");
                    number=sc.nextInt();
                }
            }
            else {
                System.err.println("Duffer,Enter the no between 1 to 100");
                number=sc.nextInt();
            }
        }
        sc.close();
    }
}
