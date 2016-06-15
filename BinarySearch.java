import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;


public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FastScanner scanner = new FastScanner(System.in);
	        int n = scanner.nextInt();
	        int[] a = new int[n];
	        for (int i = 0; i < n; i++) {
	            a[i] = scanner.nextInt();
	        }
	        int m = scanner.nextInt();
	        int[] b = new int[m];
	        for (int i = 0; i < m; i++) {
	          b[i] = scanner.nextInt();
	        }
	        Arrays.sort(a);
	          //replace with the call to binarySearch when implemented
	        for(int i=0; i<m;i++)
	        {
	            System.out.print(binarySearch(a,0,a.length-1, b[i]) + " ");
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


	
	 static int binarySearch(int[] a,int low,int high,int x) {
	        
	        //write your code here
	        
	       

	        if(high<low)
	        	return -1;
	        
    	        int mid =  (high + low)/2;

	     
	           		if(x==a[mid])
		        	{
		        		return mid;
		        	}
	        		
	           		else if(x<a[mid])
		        	{
	           			
		        		return binarySearch(a,low,mid -1,x);
		        		
		        	}
		        	

	           		else
		        	{
		        		
		        		return binarySearch(a,mid+1,high,x);
		        		
		       
		        	}
	        		
	        	
	        	
	        	
	        	
	        
	       
	        
	    }

	 static int linearSearch(int[] a, int x) {
	        for (int i = 0; i < a.length; i++) {
	            if (a[i] == x) return i;
	        }
	        return -1;
	    }
}
