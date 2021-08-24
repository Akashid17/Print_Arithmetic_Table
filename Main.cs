
using System;

class ArithmeticX
{
	public void Table(int iNo)
	{
		if(iNo < 0)
		{
			iNo = -iNo;
		}

		int i = 1;

		do
		{
			Console.Write(i*iNo+" ");
			i++;
		} while (i <= 10);

		Console.WriteLine();
	}
}

class main
{
	public static void Main(string[] args)
	{
		Console.WriteLine("Enter Number");
		int iValue = Convert.ToInt32(Console.ReadLine());

		ArithmeticX aobj = new ArithmeticX();
		aobj.Table(iValue);
	}
}