public class Threeelement 
{
	public static void main(String[] args)
	{
		int a[]={2,8,15,20,35,45,100};
		int b[]={2,5,9,20,45,110};
		int c[]={3,4,15,20,30,45,80,120};
     	int m=0,j=0,k=0;
		System.out.print("The array1 is : ");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
        System.out.println();
		System.out.print("The array2 is : ");
		for(int i=0;i<b.length;i++)
		{
			System.out.print(b[i]+" ");
		}
		System.out.println();
		System.out.print("The array3 is : ");
		for(int i=0;i<c.length;i++)
		{
			System.out.print(c[i]+" ");
		}
		System.out.println();
		while((m<a.length) && (j<b.length) && (k<c.length))
		{
			if(a[m] == b[j] && c[k]==a[m])
			{
				System.out.print(a[m]+" ");
				m++;
				j++;
				k++;
			}
			else if(a[m]<b[j])
		     m++;
		    else if(b[j]<c[k])
		     j++;
		     else
		       k++;
			   
		}
	}
}

