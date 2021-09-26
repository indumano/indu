class Sort 
{
	public static void main(String[] args) 
	{
		int a[] = {1,8,2,7,3,5,3,6};
		int temp=0;
		System.out.print("original array is : ");
		for(int i=0;i<a.length;i++)
		{
		System.out.print(a[i]+" ");
		}
		for(int i=0;i<a.length;i++)
		{
		 for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
			System.out.println();
			System.out.print("sort array : ");
			for(int i=0;i<a.length;i++)
		     {
				System.out.print(a[i]+" ");
	          }
}
}