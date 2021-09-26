class Duplicate 
{
	public static void main(String[] args) 
	{
		int a[]={1,5,7,6,3,5,2,4,8};
		System.out.print("The array element is ");
		for(int i=0;i<a.length-1;i++)
		{
			System.out.print(a[i]+" ");
			
		}
		System.out.println();
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				
				if(a[i]==a[j])
				{
					System.out.println("The duplicate element is "+a[j]);
				}
			}
		}
	}

}