import java.util.Scanner;
public class RunningTally{
     public static void main (String[] args){
         Scanner input = new Scanner(System.in);
         int num = 0;
         int total = 0;
         
         
         
         System.out.println("Let's add some numbers! [Type a negative number to quit]");
         
         
         while(num>=0){
             System.out.println("Add: ");
             num = input.nextInt();
            
            if(num>=0){
              total = total + num;  
            }
            
        }
            
            
            System.out.println("Your total is " + total);
             
        }
        
            
         

}


