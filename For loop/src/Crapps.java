import java.util.Scanner;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Crapps 

{
	private static final long serialVersionUID = 1L;
	static String name, bet; 
//	static int className;
	static JFrame frame = new JFrame();
	static int die1, die2, diceTotal, answer, number, answer2, answer3;
//	

	
	public static void main(String[] args) 
	{
		greetPlayer();
		askBet();
//		tellGame();
		generateRandomNumber();
		askNumber();
		giveAnswer();
		
	}
	public static void greetPlayer()
	{
//		Scanner userInput=new Scanner(System.in);
//		System.out.println("What is your name?");
//		String name = userInput.nextLine();
//		System.out.println("Hi, "+ name + ", hope you like the game!");
		ImageIcon image = new ImageIcon("pug.jpg");
		name = JOptionPane.showInputDialog("What is your name?");
		JOptionPane.showMessageDialog(frame, "Hello, "+name, null, 0, image);
		
	}
	public static void askBet()
	{
//		Scanner userInput3=new Scanner(System.in);
//		System.out.println("How much money would you like to bet?");
//		bet=userInput3.nextInt();
		bet = JOptionPane.showInputDialog("How much would you like to bet?");
		JOptionPane.showMessageDialog(frame, "Ok, you chose to bet, $"+bet);
		number = Integer.parseInt(bet);
	}
	public static void tellGame()
	{
		System.out.println("This is a game where it rolls 2 dice, and you could win 100 + your number, or you could lose how much you bet");
	}
	public static void generateRandomNumber()
	{
		Scanner userInput21=new Scanner(System.in);
		die1=(int)(Math.random()*6)+1;
		die2=(int)(Math.random()*6)+1;
		diceTotal=die1 + die2;
	}
	public static void askNumber()
	{
//		Scanner userInput2 = new Scanner(System.in);
//		System.out.println("Do you think the number will be higher or lower than 12?");
//		System.out.println("(1) higher");
//		System.out.println("(2) lower");
//		answer=userInput2.nextInt();
//		System.out.println("You said, "+answer);
		Object[] options = {"Higher","Lower"};
		answer = JOptionPane.showOptionDialog(frame, "Do you think the randomly generated number is higher than 6?",
				"Higher Lower",
				JOptionPane.YES_NO_CANCEL_OPTION,
				JOptionPane.QUESTION_MESSAGE,
				null, options, options[0]);
		switch (answer)
		{
			case 0:
					{
						answer2 = 1;
					}
			case 1:
					{
						answer2 = 2;
					}
		}
	}
	public static void giveAnswer()
	{
		if (answer2 == 1)
		{
			if (diceTotal <= 6)
			{
//				System.out.println("That is incorrect, come play again");
//				number = number / 2;
				answer3 = 2;
			}
			else if (diceTotal > 6)
			{
//				System.out.println("That is correct, you won!");
//				number = number * 2;
				answer3=1;
			}
		}
		else if (answer2 == 2)
		{
			if (diceTotal <= 6)
			{
//				System.out.println("That is correct, you won!");
//				number = number * 2;
				answer3 = 1;
			}
			else if (diceTotal > 6)
			{
//				System.out.println("That is incorrect, play again.");
//				number = number / 2;
				answer3 = 2;
			}
		}
		ImageIcon image1 = new ImageIcon("1293332_200x130.gif");
		ImageIcon image3 = new ImageIcon("zvCw1LK.gif");
		ImageIcon image2 = new ImageIcon("giphy.gif");
		switch (answer3)
		{
			case 1:
					{
						JOptionPane.showMessageDialog(frame, "That is correct, Good Job!!!",null,0,image1);
						number = number *2;
						break;
					}
			case 2:
					{
						JOptionPane.showMessageDialog(frame, "That is incorrect, thanks for playing!!",null,0,image2);
						number = number /2;
						break;
					}
		}
//		System.out.println("You now have, $" + number);
//		ImageIcon image4 = new ImageIcon("12298969_711581612312827_1930731108_a.jpg");
		JOptionPane.showMessageDialog(frame, "You leave with $"+number+" thanks for playing "+name+".");
	}
	
	
	

}
