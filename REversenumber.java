class REversenumber 
{
	void r()
	{
		int a[] = new int[] {1,2,3,4,5};
	    System.out.print("original array : ");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
		System.out.print("Reverse array :");
		for(int i=a.length-1;i>=0;i--)
		{	
		System.out.print(a[i]+" ");
	}
	}
	void r1()
	{
		System.out.println();
		String a[] = new String[] {"cat","rat","hen","cow","dog"};
	    System.out.print("original array : ");
		for(int i=0;i<a.length;i++)
			{
			System.out.print(a[i]+" ");
		}
		System.out.println();
		System.out.print("Reverse array :");
		for(int i=a.length-1;i>=0;i--)
		{	
		System.out.print(a[i]+" ");
	}
	}
	public static void main(String[] args) 
	{
		REversenumber src = new REversenumber();
		src.r();
		src.r1();
	}
}
