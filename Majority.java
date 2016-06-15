import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;



public class Majority {

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
	 public static int majorityElement(int[] nums) {
	        int result = 0, count = 0;
	          
	        if(nums.length==1)
	        {
	        	return -1;
	        }
	        
	        
	          Arrays.sort(nums); 
	           
	        for(int i = 0; i<nums.length; i++ ) {
	            if(count == 0 ||result != nums[i]){
	                result = nums[ i ];
                   
	                count = 1;
	            }
	            
	            if(result == nums[i]){

	               count++;

	               
	               if(count>nums.length/2 + 1)
	               {
	            	   return 1;
	               }
	               
	            }
	            else{
	               count--;
	            }
	        }
	        
	    return -1;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FastScanner scanner = new FastScanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        
        if (majorityElement(a) != -1) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
        majorityElement(a);
    
      
	}

}
