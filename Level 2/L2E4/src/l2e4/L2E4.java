package l2e4;

import java.util.Scanner;


public class L2E4 {

    public static void main(String[] args) {
        
        Scanner n = new Scanner(System.in);
        
        System.out.print("Enter A number: ");
        int num = n.nextInt();
        int sum = 0;
        
        for(int i = 1;i<=num;i++){
            sum +=i;
            
            if(i == num){
                System.out.print(i+"");
            }else{
                System.out.print(i+"+");
            }
            
        }
        
        System.out.println("\nThe Result = "+sum);
        
        
        
    }
    
}
