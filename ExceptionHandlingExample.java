import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ExceptionHandlingExample {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        try{
            int firstInput = scan.nextInt();
            int secondInput = scan.nextInt();
            int quotient = (firstInput/secondInput);
            System.out.println(quotient); 
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
        catch(InputMismatchException e){
            System.out.println("java.util.InputMismatchException");
        }
    }
}
