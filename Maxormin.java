public class Maxormin 
{
	void demo()
	{
		int[] a={6,3,5,7};
		int max,min;
		int i=0;
		max=a[i];
		min=a[i];
		while(i<a.length)
		{
			if(a[i]>max)
			{
		       max=a[i];
			}
            if(a[i]<min)
			{
				min=a[i];
			}
		   i++;
		}
		System.out.println("The maximum element is "+max);
		System.out.println("The minimum element is "+ min);
	}
	public static void main(String[] args) 
	{
		Maxormin src = new Maxormin();
		src.demo();
}
}