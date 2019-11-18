import java.util.Scanner;

public class Main 
{

	public static void main(String[] args) throws Exception 
	{
		try
		{
			Scanner in = new Scanner(System.in);
			long[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
			System.out.print("Enter the number by which we will multiply the matrix: ");
			int a = in.nextInt();
			ForMatrices matrixClass = new ForMatrices();
			// multiplied by the number
			long[][] multp = matrixClass.MultByA(matrix, a);
			matrixClass.PrintMatrix(multp);
			System.out.print("\n");
			// transposed matrix
			long[][] transp = matrixClass.GetTranspMatrix(matrix);
			matrixClass.PrintMatrix(transp);
			System.out.print("\n");
			// sum of the matrices
			long[][] sum = matrixClass.GetSumMatrices(matrix, multp);
			matrixClass.PrintMatrix(sum);
			System.out.print("\n");
			// multiplied matrices
			long[][] multpMatrices = matrixClass.MuliplyMatrices(matrix, multp);
			matrixClass.PrintMatrix(multpMatrices);
			System.out.print("\n");
			// Exponentiation of a matrix
			System.out.print("Enter the exponent: ");
			int exp = in.nextInt();
			long[][] expon = matrixClass.ExponentMatrix(matrix, exp);
			matrixClass.PrintMatrix(expon);
			System.out.print("\n");
			// sum maximum elements in each row
			long sumMaxElemInRows = matrixClass.GetSumMaxElemInRow(multp);
			System.out.print("Sum max elements in each row: " + sumMaxElemInRows);
		}
		catch(Exception e)
		{
			System.out.print(e.getMessage());
		}
	}
}
