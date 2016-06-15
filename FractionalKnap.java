import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NavigableSet;
import java.util.Scanner;
import java.util.TreeMap;


public class FractionalKnap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//	System.out.println("Jai Maa Manosha Maa");
		 Scanner scanner = new Scanner(System.in);
	        int n = scanner.nextInt();
	        int capacity = scanner.nextInt();
	        int[] values = new int[n];
	        int[] weights = new int[n];
	        for (int i = 0; i < n; i++) {
	            values[i] = scanner.nextInt();
	            weights[i] = scanner.nextInt();
	        }
	        //System.out.println(getOptimalValue(capacity, values, weights));
	     System.out.println(getOptimalValue(capacity,values,weights));	}
	

	  private static double getOptimalValue(int capacity, int[] values, int[] weights) {
	        double value = 0;
	        double [] total = new double [values.length];
	        double [] c = new double [values.length];


	        TreeMap<Double,Integer> hm = new TreeMap<Double,Integer>();
	        Map<Integer,Integer> hm1 = new TreeMap<Integer,Integer>();
            
	        
	        //write your code here
        
	       
	    	   for(int i =0; i<values.length;i++)
	    		   
	    	   {
	    		  total[i] = values[i]/weights[i];
	    		   
	    		  hm.put(total[i],values[i]);
	    		  hm1.put(values[i], weights[i]);
	    		  
	    	   }
	       

	    	  NavigableSet nset=hm.descendingKeySet();
 		      List<Integer> al = new ArrayList<Integer>();

	    	   for (Iterator<Double> iter=nset.iterator();iter.hasNext();) {
	    		    Double key = iter.next();
	    		  //  System.out.println(key);
	    		  //  System.out.println(hm.get(key) );
                   al.add(hm.get(key));
	    		   
	    		}


	    	   Integer v[]=al.toArray(new Integer[al.size()]);

//------------------------------------------------------------------------------------------------------------------//
	    	   
	    	   for(int i=0;i<al.size();i++)
	    	   {
	    		//   hm1.containsKey(al.get(i));
	    		   
	    		  // System.out.println("key" + al.get(i)+ "Value" + hm1.get(al.get(i)));
	    		   c[i] = hm1.get(al.get(i));
	    		   

	    	   }
	    	   
	    	   int t = 0;
	    	  for(int i=0;i<c.length;i++)

	    	  {
	    		  if(capacity>0)
	    		  {
	    			  if(c[i]>=capacity)
	    			  {
	    				  double temp = c[i]/capacity;
	    				  double totalvalue = v[i]/temp;
	    				  value = value + totalvalue;
	    				  capacity = (int) (capacity - c[i]);
	    				  
	    				  
	    				  
	    			  }
	    		  }
	    		  
	    		  
	    		  if(c[i]<capacity)
	    		  {
	    			  capacity = (int) (capacity - c[i]);
	    			  value = value + v[i];
	    			  
	    			 
	    		
	    			 
	    		  }
	    		  
	    		  
	    		  
	    		  if(capacity == 0)

	    		  {
	    			  
	    		  }
	    		  
	    		  
	    	  }
	    	  
			  return value;

	    }
	  
	
	
}
