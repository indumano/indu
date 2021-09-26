import java.util.Scanner;
class Occurence 
{
	public static void main(String[] args) 
	{
		int n,x,count=0;
		 Scanner src = new Scanner(System.in);
         System.out.print("enter the no of element : ");
		  n  = src.nextInt();
		 int a[] = new int[n];
		 System.out.println("enter all the element of array : ");
		 for(int i=0;i<n;i++)
		{
			 a[i]=src.nextInt();
		}
		System.out.print("enter the element of which you want to occurence count : ");
		x=src.nextInt();
		for(int i=0;i<n;i++)
		{
			if(a[i] == x)
				{
					count++;
				}
			}
			 
				System.out.println("Number of occurence of the element : "+count);
			}
}
