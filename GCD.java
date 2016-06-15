import java.util.Scanner;


public class GCD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    //System.out.println("Jai Maa Manosha Maa");
    
    Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();
    int b = scanner.nextInt();

    System.out.println(gcd(a, b));
	}

	private static int gcd(int a, int b) {
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

}
