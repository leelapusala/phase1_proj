package sampleProjectPackage;

public class TestLoopsConcept {
	
	public int factorial(int n)
	{
		int fact = 1;
		for(int i = 1;i<=n;i++)
		{
			fact=fact*i;
		}
		return fact;
	}
	
	public int sum(int n)
	{
		int sum=0;
		for(int i=1;i<=5;i++)
		{
			sum=sum+i;
		}
		return sum;
	}
}
