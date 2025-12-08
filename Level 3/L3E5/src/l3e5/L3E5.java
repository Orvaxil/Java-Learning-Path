package l3e5;

import java.util.Scanner;


/*   لاني استعنت بشات كثير وما عرفت اغلب الاشياء 6/10 */


class car {
    String model;
    String color;
    int speed;
   
    
    
    public car(String model, String color, int speed){
        
        this.model = model;
        this.color = color;
        this.speed = speed;
        

    }
        
        
    public void displayinfo(){
        System.out.println("Car Model: "+model);
        System.out.println("Car color: "+color);
        System.out.println("Car speed: "+speed);
        
    }
    
    }
    
public class L3E5 {


    public static void main(String[] args) {
        
        Scanner n = new Scanner(System.in);
        
        System.out.print("Enter car model: ");
        String model = n.nextLine();

        System.out.print("Enter car color: ");
        String color = n.nextLine();

        System.out.print("Enter car speed: ");
        int speed = n.nextInt();

        
        
        car MyCar = new car(model,color,speed);
        
        MyCar.displayinfo();
        
    }
    
}
