import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class Dotproduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);
	        int n = scanner.nextInt();
	        int[] a = new int[n];
	        for (int i = 0; i < n; i++) {
	            a[i] = scanner.nextInt();
	        }
	        int[] b = new int[n];
	        for (int i = 0; i < n; i++) {
	            b[i] = scanner.nextInt();
	        }
	        
	        System.out.println(minDotProduct(a, b));
		
	}

	private static long minDotProduct(int[] a, int[] b) {
        //write your code here
        long result = 0;
        Arrays.sort(b);

      
        for(int i=0; i<a.length-1;i++)
        {
        	for(int j=i+1;j<a.length;j++)
        	{
        		if(a[i]<a[j])
        		{
        			int temp = a[i];
        			a[i] = a[j];
        			a[j] = temp;
        		}
        	}
        }
        


        
        
        
        for (int i = 0; i < a.length; i++) {
            result += (long)a[i] * (long)b[i];

        }
        return result;
    }

}
