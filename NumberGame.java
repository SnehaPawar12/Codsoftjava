import java.util.Random;
import java.util.Scanner;


public class NumberGame
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
Random random = new Random();

int score =0;
int rounds=0;

while(true)
{
rounds++;
System.out.println("\nRound" + rounds);

int randomNumber = random.nextInt(100)+ 1;
int maxAttempts=5;
int attempts =0;

while(attempts< maxAttempts)
{
System.out.println("Guess a number between 1 and 100:");
int userGuess = sc.nextInt();
attempts++;


if(userGuess == randomNumber)
{

System.out.println("Congratulations! You guessed the number in" + attempts +"attempts.");
score++;
break;
}
else if(userGuess < randomNumber)
{
System.out.println("Too low.Try again.");
}
else
{
System.out.println("Too high.Try again.");
}
}

if(attempts == maxAttempts)
{
System.out.println("You've reached the maximun number of attempts.The correct number was" + randomNumber);
}
System.out.println("Do you want to play another round?(yes/no):");

String playAgain = sc.next();

if(!playAgain.equalsIgnoreCase("yes"))
{
break;
}
}

System.out.println("\nGame Over!");
System.out.println("Your final score is: "+ score+" out of" + rounds);
sc.close();
}
}



