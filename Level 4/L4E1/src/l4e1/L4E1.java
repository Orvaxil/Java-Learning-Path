package l4e1;

import java.util.Scanner;

public class L4E1 {

    public static void main(String[] args) {
        
        Scanner n = new Scanner(System.in);
        
        System.out.print("Enter An area size (num*num) :");
        int num = n.nextInt();
        
        for(int i =1;i<=num;i++){
        
            for(int j= 1;j<=num;j++){
            System.out.print("*");

       
        }
            System.out.println("");
            
        }
        
        
        
        
    }
    
}
