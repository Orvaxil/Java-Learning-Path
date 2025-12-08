package l2e3;

import java.util.Scanner;

public class L2E3 {

    public static void main(String[] args) {
        
        Scanner n = new Scanner(System.in);
        
        System.out.println("Enter 3 Numbers: ");
        int num1 = n.nextInt();
        int num2 = n.nextInt();
        int num3 = n.nextInt();
        
        int bigger = num1;
        
        if(num2>bigger) bigger = num2;
        
        if(num3>bigger) bigger = num3;
        
        System.out.println("The biggest Number is : "+bigger);


        
        
        
        
    }
    
}
