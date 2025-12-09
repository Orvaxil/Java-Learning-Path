package l4e4;

import java.util.Scanner;

public class L4E4 {

    public static void main(String[] args) {
        
        Scanner n = new Scanner(System.in);
        
        System.out.print("Enter A number: ");
        int num = n.nextInt();
        
        for(int i = 1; i<=10;i++){
            
            System.out.println(num +" + "+i+" = "+(num*i));
            
        }
        
        
                
    }
    
}
