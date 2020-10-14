import java.util.Scanner;
public class D6 {
    public static void main (String[] args){
         Scanner input = new Scanner(System.in);
       int num = 0;
       int dieroll = 0;
       int total = 0;
       String ans = "y";
       
       while(ans.equals("y") || ans.equals("Y")){
           System.out.println("How many D6's do you want to roll?");
           num = input.nextInt();
           System.out.println("You rolled: ");
           
            for (int i = 0; i < num; i++) {
                dieroll = (int) (Math.random()*6)+1;
                total = total + dieroll;
                System.out.println(dieroll + " ");
              
            }

            System.out.println("Total: " + total);
            System.out.println("Again? [y,n] ");
            ans = input.next();
              
           
        }
        }
}

   