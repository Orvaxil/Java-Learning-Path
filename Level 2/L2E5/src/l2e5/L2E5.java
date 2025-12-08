package l2e5;

import java.util.Scanner;


public class L2E5 {

  
    public static void main(String[] args) {
        
        Scanner n = new Scanner(System.in);
        
        System.out.print("Enter The Array Length: ");
        int arraylength = n.nextInt();
        int[] array = new int[arraylength];
        int sum = 0;
        System.out.println("Enter "+arraylength+" Items to the array: ");
        
        for(int i = 0; i<arraylength;i++){
            array[i] = n.nextInt();
        }
        
        System.out.println("This Array Contains: ");
        
        for(int i = 0; i<arraylength;i++){
            System.out.print(array[i]+" ");
            sum += array[i];
            
        }
        System.out.print("Their Total = "+sum);

        
    }
    
}
