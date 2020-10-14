import java.util.Scanner;
public class Triangle {
     public static void main (String[] args){
         Scanner input = new Scanner(System.in);
         String character; 
         int height = 0;
         int length = 0;
         int i;
         int x;
         System.out.println("What character do you want your triangle made of?");
         character = input.nextLine();
         System.out.println("How tall do you want your triangle?");
         length = input.nextInt();
         
         for(i=0;i<=height;i++){
             
             for(x=0;x<length;x++){
                 character = character + character;
                 System.out.println(character);
                }
            }
         
         
         
         
        }
    
}

    
