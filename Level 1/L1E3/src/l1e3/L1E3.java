
package l1e3;

import java.util.Scanner;


public class L1E3 {


    public static void main(String[] args) {

        Scanner Calc = new Scanner(System.in);
        
        System.out.print("Enter The First Number: ");
        int num1 = Calc.nextInt();
        System.out.print("Enter The Second Number: ");
        int num2 = Calc.nextInt();
        
        int result = num1 + num2;
        System.out.println("The Reusult is = "+result);
        
        
    }
    
}
