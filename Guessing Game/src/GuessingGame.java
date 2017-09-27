/*
 * Name: Guessing Game
 * Author: Alex Chan
 * Date: 9/27/17
 */
import java.util.Scanner;
import java.util.InputMismatchException;
public class GuessingGame 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.println("What is your name, user?");
		String name = input.next();
		System.out.println("Welcome, " + name + ". How old are you?");
		int age = input.nextInt();
		if (age > 0 && age <= 30)
		{
			System.out.println("You are young");	
		}
		else if (age > 0 && age <= 60)
		{
			System.out.println("You are middle aged");
		}
		else if (age > 60)
		{
			System.out.println("You are old");
		}
		guessTheNumber();
	}

	public static void guessTheNumber()
	{
		Scanner input = new Scanner(System.in);
		int num = (int)((Math.random()*10) + 1);
		System.out.println("Guess a number between 1 and 10");
		int guess = input.nextInt();
		while (guess != num)
		{
			System.out.println("Try Again");	
			guess = input.nextInt();
			System.out.println("hello alex");
		}
		System.out.println("Congratulations, you guessed " + num + "!");
	}
}
 