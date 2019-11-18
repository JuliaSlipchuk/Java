
public class Something<T extends Number>
{
	T n;
	T m;
	int C;
	char O1;
	char O2;
	public Something() {}
	public Something(T n, T m, int C, char O1, char O2)
	{
		this.n = n;
		this.m = m;
		this.C = C;
		this.O1 = O1;
		this.O2 = O2;
	}
	public double getResult(double n, double m, int C, char O1, char O2) throws Exception
	{
		double result = 0.0;
		for (double i = 0; i <= n; i++)
		{
			for (double j = 0; j <= m; j++)
			{
				if ((i + C) == 0)
					throw new Exception("The denominator is 0");
				else if (O1 == '+')
				{
					if (O2 == '*')
						result += (i * j) / (i + C);
					else if (O2 == '/')
						result += (i / j) / (i + C);
					else if (O2 == '%')
						result += (i % j) / (i + C);
					else if (O2 == '+')
						result += (i + j) / (i + C);
					else
						result += (i - j) / (i + C);
				}
				if ((i - C) == 0)
					throw new Exception("The denominator is 0");
				else
				{
					if (O2 == '*')
						result += (i * j) / (i - C);
					else if (O2 == '/')
						result += (i / j) / (i - C);
					else if (O2 == '%')
						result += (i % j) / (i - C);
					else if (O2 == '+')
						result += (i + j) / (i - C);
					else
						result += (i - j) / (i - C);
				}
			}
		}
		if (Double.valueOf(result).isNaN())
			throw new Exception("The result is NaN");
		return result;
	}
	/*
	 * public double getResult(double n, double m, int C, char O1, char O2) throws
	 * Exception { double result = 0; for (double i = 0; i <= n; i++) { for (double
	 * j = 0; j <= m; j++) { if ((i - C) == 0) throw new
	 * Exception("The denominator is 0"); if (O1 == '+') { if (O2 == '*') result +=
	 * (i * j) / (i + C); else if (O2 == '/') result += (i / j) / (i + C); else if
	 * (O2 == '%') result += (i % j) / (i + C); else if (O2 == '+') result += (i +
	 * j) / (i + C); else result += (i - j) / (i + C); } else { if (O2 == '*')
	 * result += (i * j) / (i - C); else if (O2 == '/') result += (i / j) / (i - C);
	 * else if (O2 == '%') result += (i % j) / (i - C); else if (O2 == '+') result
	 * += (i + j) / (i - C); else result += (i - j) / (i - C); } } } return result;
	 * }
	 */
}
