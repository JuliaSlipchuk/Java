import java.util.Scanner;
import java.util.*;

public class Main 
{
	static void SortArray(int[] array)
	{
		List<Integer> negativeNumbs = new ArrayList<Integer>();
		int counter = 0;
		for (int i = 0; i < array.length; i++)
		{
			if (array[i] < 0)
			{
				negativeNumbs.add(counter, array[i]);
				counter++;
			}
		}
		List<Integer> positiveNumbs = new ArrayList<Integer>();
		counter = 0;
		for (int i = 0; i < array.length; i++)
		{
			if (array[i] >= 0)
			{
				positiveNumbs.add(counter, array[i]);
				counter++;
			}
		}
		for (int i = 0; i < array.length; i++)
		{
			array[i]= 0;
		}
		for (int i = 0; i < negativeNumbs.size(); i++)
		{
			for (int j = 0; j < negativeNumbs.size() - i - 1; j++)
			{
				if (negativeNumbs.get(j) > negativeNumbs.get(j + 1))
				{
					int temp = negativeNumbs.get(j);
					negativeNumbs.set(j, negativeNumbs.get(j + 1));
					negativeNumbs.set(j + 1, temp);
				}
			}
		}
		for (int i = 0; i < positiveNumbs.size(); i++)
		{
			for (int j = 0; j < positiveNumbs.size() - i - 1; j++)
			{
				if (positiveNumbs.get(j) < positiveNumbs.get(j + 1))
				{
					int temp = positiveNumbs.get(j);
					positiveNumbs.set(j, positiveNumbs.get(j + 1));
					positiveNumbs.set(j + 1, temp);
				}
			}
		}
		int index = 0;
		for (int i = 0; i < negativeNumbs.size(); i++)
		{
			array[index] = negativeNumbs.get(i);
			index++;
		}
		for (int i = 0; i < positiveNumbs.size(); i++)
		{
			array[index] = positiveNumbs.get(i);
			index++;
		}
	}
	static void PrintArray(int[] array)
	{
		for (int i = 0; i < array.length; i++)
			System.out.print(array[i] + " ");
	}
	public static void main(String[] args)
	{
		Scanner myInput = new Scanner( System.in );
		System.out.print("Enter array lenght: ");
		int lenght;
		if (myInput.hasNextInt())
		{
			lenght = myInput.nextInt();
			if (lenght <= 0 || lenght > 30)
				lenght = 5;
		}
		else 
		{
			lenght = 5;
		}
		int[] array = new int[lenght];
		for (int i = 0; i < array.length; i++)
		{
			System.out.print("\nEnter " + i + " array element: ");
			if (myInput.hasNextInt())
				array[i] = myInput.nextInt();
			else
				array[i] = 0;
		}
		SortArray(array);
		PrintArray(array);
	}
}
