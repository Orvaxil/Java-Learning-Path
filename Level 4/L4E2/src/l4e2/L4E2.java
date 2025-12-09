/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l4e2;

import java.util.Scanner;

/**
 *
 * @author Ammar
 */
public class L4E2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner n = new Scanner(System.in);

        
        System.out.print("Enter a number to count from one to your number: ");
        int num = n.nextInt();
        
        for(int i =1;i<=num;i++){
        
            for(int j= 1;j<=num;j++){
            System.out.print(j);

       
        }
            System.out.println("");
            
        }
        
        
    }
    
}
