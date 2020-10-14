import java.util.Scanner;
public class GuessingGame{
    public static void main (String[] args){
         Scanner input = new Scanner(System.in);
    int num = (int) (Math.random()*100);
    int guess = 0;
    int i = 0;
    int counter = 0;

    
    System.out.println("I've picked a random number between 1 and 100. Try to guess it!");
 
    for(i=0;i<num;i++){
        System.out.println("What is your guess?");
        guess = input.nextInt();
        counter++;
        
        if(guess>num){
            System.out.println("Too high...");
        }
        
        if(guess==num){
            System.out.println("You've guessed my number! Good job! It only took you " + counter + " tries.");
            break;
        }
        if (guess<num){
            System.out.println("Too low...");
        }
        
    }
}
}

   