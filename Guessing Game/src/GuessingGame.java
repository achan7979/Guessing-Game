import java.util.Scanner;
import java.util.InputMismatchException;
public class GuessingGame 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.println("What is your name, user?");
		String name = input.next();
		System.out.print("Welcome, " + name + ". How old are you?");
		int age = input.nextInt();
		if (age > 0 && age <= 30)
		{
			System.out.print("You are young");	
		}
		else if (age > 0 && age <= 60)
		{
			System.out.print("You are middle aged");
		}
		else if (age > 60)
		{
			System.out.print("You are old");
		}
		guessTheNumber();
	}

	public static void guessTheNumber()
	{
		int num = (int)((Math.random()*10) + 1);
		while (guess != num)
		{
			System.out.println("HI");
		}
	}
}
 