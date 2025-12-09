package l4e3;

import java.util.Scanner;

public class L4E3 {

    public static void main(String[] args) {
        
        Scanner n = new Scanner(System.in);
        
        System.out.print("Enter one Word to see if it is Palindrome: ");
        String word = n.next();
        int length = word.length();
        word = word.toLowerCase();
        boolean isPalindrome=true;
        word = word.toLowerCase();

        for(int i = 0; i <length/2;i++){
            
            if(word.charAt(i)!= word.charAt(length -1 - i)){
                isPalindrome=false;
                break;
            }
        }
        if(isPalindrome){
            System.out.println(word+" is Palindrome");
        }else{
            System.out.println(word+" is not Palindrome");
        }
         
    }
    
}
