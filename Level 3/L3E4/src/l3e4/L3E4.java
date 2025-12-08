package l3e4;

import java.util.Scanner;


public class L3E4 {
    
    
    public static int sumArray(int[] array){
        
        int sum = 0;
        
        for(int i = 0 ; i < array.length ; i++){
            sum+=array[i];
        }
        
        return sum;
    }
    
    public static void main(String[] args) {
        
        Scanner n = new Scanner(System.in);
        
        System.out.println("Enter The Array Length: ");
        int length = n.nextInt();
        
        int [] array = new int[length];
        
        System.out.print("Enter "+length+" Numbers For Array: ");
        for(int i =0 ;i < length; i++){
            array[i]=n.nextInt();
        }
        System.out.println("The Result =  "+sumArray(array));
        
        
    }
    
}
