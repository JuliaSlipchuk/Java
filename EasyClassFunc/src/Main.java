import java.util.Scanner;
import java.lang.Math; 

public class Main {

	public static void main(String[] args) throws Exception 
	{
		try
		{
			Scanner in = new Scanner(System.in);
			int number;
			System.out.print("Enter your gradebook number: ");
			if (in.hasNextInt())
			{
				number = in.nextInt();
				if (number <= 0 || number < 10000 || number > 99999)
					number = 12345;
			}
			else
				number = 12345;
			int C2, C3, C5, C7;
			C2 = number % 2;
			C3 = number % 3;
			C5 = number % 5;
			C7 = number % 7;
			System.out.print("The remainder of the division:\nby 2 = " + C2 + "\nby 3 = " + C3 + "\nby 5 = " + C5 + "\nby 7 = " + C7);
			char O1 = C2 == 0 ? '+' : '-';
			int C = C3 - 5;
			char O2 = '0';
			switch(C5)
			{
				case 0:
					O2 = '*';
					break;
				case 1:
					O2 = '/';
					break;
				case 2:
					O2 = '%';
					break;
				case 3:
					O2 = '+';
					break;
				case 4:
					O2 = '-';
					break;
			}
			double result = 0;
			Something smth = new Something();
			System.out.print("\nEther two numbers: ");
			switch(C7)
			{
				case 0:
					byte n1 = in.nextByte();
					byte m1 = in.nextByte();
					result = smth.getResult(n1, m1, C, O1, O2);
					break;
				case 1:
					short n2 = in.nextShort();
					short m2 = in.nextShort();
					result = smth.getResult(n2, m2, C, O1, O2);
					break;
				case 2:
					int n3 = in.nextInt();
					int m3 = in.nextInt();
					result = smth.getResult(n3, m3, C, O1, O2);
					break;
				case 3:
					long n4 = in.nextLong();
					long m4 = in.nextLong();
					result = smth.getResult(n4, m4, C, O1, O2);
					break;
				case 4:
					char n5 = in.next().charAt(0);
					char m5 = in.next().charAt(0);
					result = smth.getResult(n5, m5, C, O1, O2);
					break;
				case 5:
					float n6 = in.nextFloat();
					float m6 = in.nextFloat();
					result = smth.getResult(n6, m6, C, O1, O2);
					break;
				case 6:
					double n7 = in.nextDouble();
					double m7 = in.nextDouble();
					result = smth.getResult(n7, m7, C, O1, O2);
					break;
			}
			System.out.print("Your result: " + Math.round(result));
		}
		catch(Exception e)
		{
			System.out.print(e.getMessage());
		}
	}

}
