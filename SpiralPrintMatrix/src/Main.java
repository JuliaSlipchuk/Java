import java.util.Scanner;

public class Main 
{
	public static int[][] FillMatrix(int size)
	{
		Scanner scan = new Scanner(System.in);
		int[][] matrix = new int[size][size];
		for (int i = 0; i < matrix.length; i++)
		{
			for (int j = 0; j < matrix[0].length; j++)
			{
				System.out.print("Enter element of the matrix " + i + " " + j + ": ");
				if (scan.hasNextInt())
					matrix[i][j] = scan.nextInt();
				else
					matrix[i][j] = 0;
			}
		}
		return matrix;
	}
	public static void SpiralPrintMatrix(int[][] matrix)
	{
		int indexLastRow = matrix.length;
		int indexLastColumn = matrix[0].length;
		int startRowIndex = 0;
		int startColumnIndex = 0;
		int i = 0;
		while(startRowIndex < indexLastRow && startColumnIndex < indexLastColumn)
		{
			// print first row
			for (i = startColumnIndex; i < indexLastColumn; i++)
			{
				System.out.print(matrix[startRowIndex][i] + " ");
			}
			startRowIndex++;
			// print last column
			for (i = startRowIndex; i < indexLastRow; i++)
			{
				System.out.print(matrix[i][indexLastColumn - 1] + " ");
			}
			indexLastColumn--;
			if (startRowIndex < indexLastRow)
			{
				for(i = indexLastColumn - 1; i >= startColumnIndex; i--)
				{
					System.out.print(matrix[indexLastRow - 1][i] + " ");
				}
				indexLastRow--;
			}
			if (startColumnIndex < indexLastColumn)
			{
				for (i = indexLastRow - 1; i >= startRowIndex; i--)
				{
					System.out.print(matrix[i][startColumnIndex] + " ");
				}
				startColumnIndex++;
			}
		}
	}
	public static void main(String[] args) 
	{
		
	  Scanner scanner = new Scanner(System.in); int size;
	  System.out.print("Enter the size of the matrix (odd number): "); if
	  (scanner.hasNextInt() && scanner.nextInt() > 0 && scanner.nextInt() % 2 != 0)
	  size = scanner.nextInt(); else size = 5; 
	  int[][] matrix = FillMatrix(size);
	  SpiralPrintMatrix(matrix);
	}

}
