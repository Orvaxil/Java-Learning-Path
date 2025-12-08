package l3e3;

import java.util.Scanner;


public class L3E3 {


    public static boolean isPositive(int a){
        
        if(a >0){
            return true;
        }else{
            return false;
        }
        
    }
    
    public static void main(String[] args) {
        
        Scanner n = new Scanner(System.in);
        
        System.out.print("Enter A Number: ");
        int num = n.nextInt();
        
        System.out.println("is Your Number positive: "+isPositive(num));

        
    }
    
}
