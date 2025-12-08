package l1e5;

import java.util.Scanner;


public class L1E5 {


    public static void main(String[] args) {
      
        Scanner inputs = new Scanner(System.in);
       
        System.out.print("Enter your name: ");
        String name = inputs.nextLine();
        
        System.out.print("Enter Your age: ");
        int age = inputs.nextInt();
        inputs.nextLine();
        
        System.out.print("Enter your city: ");
        String city = inputs.nextLine();
        
        System.out.println("your name is "+name+", Your age is "+age+", you are from "+city);
    }
    
}
