
import java.lang.*;
import java.io.*;

class ArithmeticX
{
	public void Table(int iNo)
	{
		if(iNo < 0)
		{
			iNo = -iNo;
		}

		for(int i = 1; i <= 10; i++)
		{
			System.out.print(i*iNo+" ");
		}
		System.out.println();
	}
}

class Main
{
	public static void main(String[] args)throws Exception
	{
		BufferedReader bobj = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter Number");
		int iValue = Integer.parseInt(bobj.readLine());

		ArithmeticX aobj = new ArithmeticX();
		aobj.Table(iValue);
	}
}