import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class PairingProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FastScanner input = new FastScanner(System.in);
		
		int n;
		n = input.nextInt();
		
		int [] ar = new int [n];
		for(int i=0; i<n;i++)
		{
			ar[i] = input.nextInt();
			
			
		}
			
		
		Arrays.sort(ar);
		
		for(int i =0 ;i<n;i++)
		{
			
			if(i == (n-1))
			{
				long a = (long)ar[n-1]* (long)ar[n-2];
				
				System.out.println(a);
			}
		}
		
		
		
	}
	

	
	 static class FastScanner {
	        BufferedReader br;
	        StringTokenizer st;

	        FastScanner(InputStream stream) {
	            try {
	                br = new BufferedReader(new InputStreamReader(stream));
	            } catch (Exception e) {
	                e.printStackTrace();
	            }
	        }

	        String next() {
	            while (st == null || !st.hasMoreTokens()) {
	                try {
	                    st = new StringTokenizer(br.readLine());
	                } catch (IOException e) {
	                    e.printStackTrace();
	                }
	            }
	            return st.nextToken();
	        }

	        int nextInt() {
	            return Integer.parseInt(next());
	        }
	    }


}
