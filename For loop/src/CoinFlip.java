import java.util.Scanner;
public class CoinFlip 
{

	public static void main(String[] args) 
	{
		Scanner userInput = new Scanner(System.in);
		System.out.println("how many coin flips do you want?");
		
		int sum = 0;
		int sum2 = 0;
		int answer = userInput.nextInt();
		int randomnumber = (int)(Math.random()*2)+1;
		for (int i = 0;i<answer; i++)
		{
			
			randomnumber = (int)(Math.random()*2)+1;
			if (randomnumber == 1)
			{
				sum = sum + 1;
			}
			else if (randomnumber == 2)
			{
				sum2 = sum2 + 1;
			}
		}
		
		System.out.println("It was heads, " + sum + " times.");
		
		System.out.println("It was tails, " + sum2 + " times.");
		
		

	}

}
