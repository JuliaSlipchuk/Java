
public class ForMatrices 
{
	public long[][] MultByA(long[][] matrix, int a)
	{
		long[][] result = new long[matrix.length][matrix[0].length];
		for (int i = 0; i < matrix.length; i++)
		{
			for (int j = 0; j < matrix[0].length; j++)
			{
				result[i][j] = matrix[i][j] * a;
			}
		}
		return result;
	}
	public long GetSumMaxElemInRow(long[][] matrix)
	{
		long sum = 0;
		for (int i = 0; i < matrix.length; i++)
		{
			long help = matrix[i][0];
			for (int j = 1; j < matrix[0].length; j++)
			{
				if (matrix[i][j] > help)
					help = matrix[i][j];
			}
			sum += help;
		}
		return sum;
	}
	public long[][] GetTranspMatrix(long[][] matrix)
	{
		long[][] result = new long[matrix[0].length][matrix.length];
		for (int i = 0; i < matrix.length; i++)
		{
			for (int j = 0; j < matrix[0].length; j++)
			{
				result[j][i] = matrix[i][j];
			}
		}
		return result;
	}
	public long[][] GetSumMatrices(long[][] first, long[][] second) throws Exception
	{
		long[][] result = new long[first.length][first[0].length];
		if (first.length == second.length && first[0].length == second[0].length)
		{
			for (int i = 0; i < first.length; i++)
			{
				for (int j = 0; j < first[0].length; j++)
				{
					result[i][j] = first[i][j] + second[i][j];
				}
			}
			return result;
		}
		else
			throw new Exception("The matrices must have the same count of rows and the same count of columns");
	}
	public long[][] MuliplyMatrices(long[][] first, long[][] second) throws Exception
	{
		if (first[0].length == second.length)
		{
			long[][] result = new long[first.length][second[0].length];
			for (int i = 0; i < first.length; i++)
			{
				for (int j = 0; j < second.length; j++)
				{
					for (int k = 0; k < second[0].length; k++)
					{
						result[i][j] += first[i][k] * second[k][j];
					}
				}
			}
			return result;
		}
		else
			throw new Exception("count of the rows in second matrix must be equals to count of the columns in first matrix");
	}
	public long[][] ExponentMatrix(long[][] matrix, int exp) throws Exception
	{
		if (exp < 0)
			throw new Exception("The exponent cannot be negative");
		long[][] result = new long[matrix.length][matrix[0].length];
		if (exp == 0)
		{
			for (int i = 0; i < matrix.length; i++)
			{
				for (int j = 0; j < matrix[0].length; j++)
				{
					result[i][j] = 1;
				}
			}
		}
		else
		{
			ForMatrices obj = new ForMatrices();
			result = obj.MuliplyMatrices(matrix, matrix);
			for (int i = 1; i < exp - 1; i++)
			{
				result = obj.MuliplyMatrices(result, matrix);
			}
		}
		return result;
	}
	public void PrintMatrix(long[][] matrix)
	{
		for (int i = 0; i < matrix.length; i++) 
		{
			for (int j = 0; j < matrix[0].length; j++)
			{
				System.out.print(matrix[i][j] + " ");
			}
			System.out.print("\n");
		}
	}
}
