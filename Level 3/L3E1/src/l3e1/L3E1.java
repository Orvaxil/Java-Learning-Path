package l3e1;

import java.util.Scanner;


public class L3E1 {

    public static int SumTwoNumbers(int a ,int b){
        
        return a + b;
        
    }
    
    
    public static void main(String[] args) {
        
        Scanner n = new Scanner(System.in);
        System.out.print("Enter The First Number: ");
        int num1 = n.nextInt();
        
        System.out.print("Enter The Second Number: ");
        int num2 = n.nextInt();
        
        System.out.println("Result = "+ SumTwoNumbers(num1,num2) );
        
    }
    
}
