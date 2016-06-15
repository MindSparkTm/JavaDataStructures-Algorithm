import java.util.Scanner;


public class Fibbonaccilastdigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		    Scanner scanner = new Scanner(System.in);
		  
	        int n = scanner.nextInt();
	        int c = getFibonacciLastDigit(n);

	        System.out.println(c);

	}

	 private static int getFibonacciLastDigit(int n) {
	        
		 int [] f = new int [10000001];
		 
		 f[0] = 0;
		 f[1] = 1;
		 
		 for(int i =2 ; i<=10000000;i++)
		 {
			 f[i] = (f[i-1] + f[i-2]) % 10;
		 
		 }
		 
		 return f[n];
		 
		 
		 
		 
	    }
}
