package l3e2;

import java.util.Scanner;

public class L3E2 {

    public static double average(double a, double b, double c){
        return (a + b + c)/3;
    }
    
    
    public static void main(String[] args) {
        
        Scanner n = new Scanner(System.in);
        
        System.out.println("Enter First Numbers: ");
        double num1 = n.nextDouble();
        
        System.out.println("Enter Second Numbers: ");
        double num2 = n.nextDouble();
        
        System.out.println("Enter Therd Numbers: ");
        double num3 = n.nextDouble();
        
        System.out.println("The Average = "+average(num1,num2,num3));
        
        
    }
    
}
