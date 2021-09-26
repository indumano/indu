class Prosum 
{
	public static void main(String[] args) 
	{
		 int a[]={1,5,3,7,4};
		 int sum=0;
		 int product=1;
       for(int i=0;i<a.length;i++)
		{
			 sum = sum+a[i];
			 product = product*a[i];
		}
		System.out.println("Sum of all the element of an array : "+sum);
		System.out.println("product of all the element of an array : "+product);
	}
}
