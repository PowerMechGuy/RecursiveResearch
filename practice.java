import java.util.Scanner;
public class practice {

	//making a constructor variable
	
	static int parts = 0;
	/*public numvar(int n)
	{
		this.parts = n;
	}*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// This program will divide any even number by 2 using recursion.
		
		//First, let's get the number...
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please input an even number ");
		int num = input.nextInt();
		int result = divide(num);
		System.out.println("The number you chose has " + result + " parts when divided by 2!");
		
		
	}
	public static int divide(int number)
	{
		if (number == 0)
		{
			System.out.println("Done!");
			return(parts);
		}
		else
		{
			number = number - 2;
			System.out.println("Found a part...");
			parts++;
			return divide(number);
		}
	}
}
