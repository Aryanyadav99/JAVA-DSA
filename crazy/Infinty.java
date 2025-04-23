package crazy;

public class Infinty {
    public static void main(String[] args) {
//for max value
        System.out.println("MAXVALUE");
        int num=Integer.MAX_VALUE;
        System.out.println(num);
        num=num+1; 
        // since integer max ismax calue of integer so if we increase it that cause the overflow and it corrected by taking two comp;ement of it 
        //and twos complement of integer.max is Integer.min and vice vers for min 
        System.out.println(num);
// for min value 
        System.out.println("MINVALUE");
        int number=Integer.MIN_VALUE;
        System.out.println(number);
        number=number-1;
        System.out.println(number);
    }
}
