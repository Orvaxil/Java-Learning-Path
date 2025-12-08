package l2e1;

import java.util.Scanner;


public class L2E1 {


    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        
        if(num %2 == 0){
            System.out.println("This Number Is even");
        }else{
            System.out.println("This Number Is odd");
        }
        
        
        
    }
    
}
