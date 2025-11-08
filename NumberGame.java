package Task1;
import java.util.*;
public class NumberGame {
	public static int randomnumber(int min, int max)
	{
		Random rand=new Random();
		int random=rand.nextInt(max - min + 1) + min;
		return random;
	}
	public static void main(String[] args)
	{
		Scanner read=new Scanner(System.in);
		int min=1;
		int max=100;
		int target=randomnumber(min,max);
		boolean choice=true;
		int limit=5;
		System.out.println("Random Number Generated");
		while(choice && limit>0)
		{
			System.out.println("Remining Attempts "+limit);
			System.out.print("Give your Input: ");
			int user=read.nextInt();
			if(target==user)
			{
				System.out.println("Your guess is correct, The Number is: "+target);
				System.out.print("Do you want to play again? (yes/no): ");
				String option=read.next();
				if(option.equalsIgnoreCase("yes"))
				{
					target=randomnumber(min,max);
					choice=true;
					limit=5;
					
				}
				else
				{
					choice=false;
					System.out.println("Thank you for playing, See you soon");
					read.close();
				}
			}
			else if(target>user)
			{
				System.out.println("Input is Too Low");
				limit--;
			}
			else if(target<user)
			{
				System.out.println("Input is Too High");
				limit--;
			}
			if(limit==0)
			{
				System.out.println("You are out of tries");
				System.out.print("Wanna Try Again?(yes/no): ");
				String str=read.next();
				if(str.equalsIgnoreCase("yes"))
					limit=5;
				else
				{
					System.out.println("The number is: "+target);
					System.out.println("Thank for playing, Better Luck Next Time. See you soon");
					return;
				}
			}
		}
	}
}
