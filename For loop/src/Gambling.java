import java.util.Scanner;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Gambling extends JFrame
{
	private static final long serialVersionUID = 1L;
	static String name; 
	static int className;
	static JFrame frame = new JFrame();
	 
	public static void greetPlayer()
	{
		Scanner userInput=new Scanner(System.in);
		System.out.println("What is your name?");
		String name = userInput.nextLine();
		System.out.println("Hi, "+ name + ", I hope you enjoy the game!");
	}
	public static void main(String[] args)
	{
		greetPlayer();
		Scanner userInput = new Scanner(System.in);
		int total = 100;
		System.out.println("In this gambling game, you start with $100, and get to choose how much you want to bet");
		System.out.println("Please type how much money you want to bet.");
		
		int sum = userInput.nextInt();
		int randomnumber = (int)(Math.random() * 2) + 1;
		System.out.println(randomnumber);
		for (int i = 0; i < 1; i++)
		{
			
			
			if (randomnumber == 1)
			{
				total = total + sum;
				
			
			}
			else if (randomnumber == 2)
			{
				total = total - sum;
				
			}
		}
		System.out.println("You now have $" + (total));

	}

}
