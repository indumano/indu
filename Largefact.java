import java.math.BigInteger;
public class Largefact 
{
	public static void main(String[] args) 
	{
		BigInteger fact = BigInteger.valueOf(1);
		for(int i=1;i<=100;i++)
		{
			fact = fact.multiply(BigInteger.valueOf(i));
		}
		System.out.println("The factorial of given number is : " +fact);
	}
}
