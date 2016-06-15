import java.util.Scanner;


public class LCM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   Scanner scanner = new Scanner(System.in);
		    int a = scanner.nextInt();
		    int b = scanner.nextInt();
		    System.out.println (lcm(a,b));

	}

	private static long gcd(long a, long b) {
		// TODO Auto-generated method stub
		
		if(b == 0)
		return a;
		
		
			while (b !=0)
			{
				a = a % b;
				
				return gcd(b,a);
			}
		
		return b;
	}

	private static long lcm (long a, long b)
	{
		long temp;
		long product;
		long lc;
		if(b==0)
			return 0;
		
		else
		{
			temp = gcd (a,b);
		    product = a * b;
		    lc = product/temp;
		    return lc;
		}
		    
		    
		    
	}
}
