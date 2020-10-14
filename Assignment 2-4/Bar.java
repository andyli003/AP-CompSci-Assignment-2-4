import java.util.Scanner;
public class Bar {
    public static void main (String[] args){
         Scanner input = new Scanner(System.in);
         String bar; 
         int length = 0;
         int i;
         
         System.out.println("What character do you want your bar made of?");
         bar = input.nextLine();
         System.out.println("How long do you want your bar?");
         length = input.nextInt();
         
         for(i=0;i<=length;i++){
             System.out.print(bar);
            }
         
         
        }
    
}
