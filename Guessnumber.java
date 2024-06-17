import java.util.Scanner;
import java.util.Random;
public class Guessnumber
{

    private static final int MAX_ATTEMPTS=5;
    private static final int MAX_ROUNDS=3;
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        Random rand = new Random();

        int usernumber=0;
        int totalScore=0;
        
        for(int i=1; i<=MAX_ROUNDS; i++)
        {
            System.out.printf("\n\nRound=%d\n",i);
            int generatenumber=(int)(rand.nextInt(100));
            
            for(int attempts=1; attempts <= MAX_ATTEMPTS; attempts++)
            {
                System.out.print("\nGuess the number - ");
                usernumber=sc.nextInt();
                
                if(usernumber==generatenumber)
                {
                    int score=MAX_ATTEMPTS-attempts+1;
                    totalScore=totalScore+score;
                    System.out.printf("Great!! The guessed number is correct\nAttempts=%d\nRound Score=%d\n",attempts,score);
                    break;
                }
                else if(attempts == MAX_ATTEMPTS)
                {
                    System.out.println("Attempts left=0");
                    System.out.printf("The  Randam  number is : %d\n\n", generatenumber);    
                }
                else if(usernumber >=generatenumber)
                    System.out.printf("The guessed number is greater than the generated number\nPlease try again\nAttempts left=%d\n\n",MAX_ATTEMPTS-attempts);
                else
                    System.out.printf("The guessed number is smaller than the generated number\nPlease try again\nAttempts left=%d\n",MAX_ATTEMPTS-attempts);
            }
            
        }
        System.out.printf("Game over.Total Score=%d\n", totalScore);
    
    }
}