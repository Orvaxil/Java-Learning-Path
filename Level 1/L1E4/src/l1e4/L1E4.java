
package l1e4;

import java.util.Scanner;


public class L1E4 {

   
    public static void main(String[] args) {
        
        Scanner Uage = new Scanner(System.in);
        
        System.out.print("Enter your Age: ");
        int UserAge = Uage.nextInt();
        
        System.out.println("your age is: "+UserAge);
        
        if(UserAge>=18){
            System.out.println("And you are Adult");
        }else{
            System.out.println("And You are Too young");
        }
      
        
        
    }
    
}
