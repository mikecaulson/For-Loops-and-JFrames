import java.util.Scanner;
public class part5
{

	public static void main(String[] args) 
	{
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("please give me a lowerbound number.");
		int lower = userInput.nextInt();
		System.out.println("please give me an upperbound number.");
		int higher = userInput.nextInt();
		int sum = 0;
		for (int i=lower; i<=higher; i++)
		{
			System.out.println(i);
			sum = sum + i;
		}
		System.out.println(sum);

	}

}
