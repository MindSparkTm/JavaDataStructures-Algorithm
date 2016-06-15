import java.util.Scanner;

public class PairingProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		int n;
		System.out.println("Enter the number of integers");
		n = input.nextInt();
		
		int [] ar = new int [n];
		for(int i=0; i<n;i++)
		{
			ar[i] = input.nextInt();
			
			
		}
			
		
		for(int i = n -1; i>0;i--)
		{
			for(int j = 0;j<i;j++)
			{
				if(ar[j] >ar[j+1])
				{
					swap(j,j+1,ar);
				}
			}
		}
		
		for(int i =0 ;i<n;i++)
		{
			System.out.println(ar[i]);
			
			if(i == (n-1))
			{
				System.out.println("The product is " + (ar[n-1]*ar[n-2]));
			}
		}
		
		
		
	}
	
	public static void swap(int x,int y,int [] a)
	{
		int temp;
		temp = a[x];
		a[x] = a[y];
		a[y] = temp;
		
	}

}
