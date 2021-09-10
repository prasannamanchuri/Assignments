package junit.capgemeni;

import static org.junit.Assert.*;

import org.junit.Test;

public class MinMaxFinderTest {
	
	 @Test
	    public void positivevalues() {
		    int[] A = new int[] {1,2,3,4,5,6,7,8,9,10};
	        int[] B =MinMaxFinder.findMinMax(A);
	        int[] C = new int[] {1,10};
	        //System.out.println(B);
	    
	        assertArrayEquals("max and min",B,C);  
	 
	    }
	 @Test
	    public void  negativevalues() {
		    int[] A = new int[] {1,-2,3,4,-5,6,7,-8,9,10};
	        int[] B =MinMaxFinder.findMinMax(A);
	        int[] C = new int[] {-8,10};
	        assertArrayEquals("max and min",B,C);  
	 
	    }
	 @Test
	    public void samerepeat() {
		    int[] A = new int[] {1,1,3,4,5,6,7,8,10,10};
	        int[] B =MinMaxFinder.findMinMax(A);
	        int[] C = new int[] {1,10};
	        //System.out.println(B);
	    
	        assertArrayEquals("max and min",B,C);  
	 
	    }
	 @Test
	    public void empty() {
		    int[] A = new int[20] ;
	        int[] B =MinMaxFinder.findMinMax(A);
	        int[] C = new int[] {0,0};
	        //System.out.println(B);
	    
	        assertArrayEquals("max and min",B,C);  
	 
	    }
	 @Test
	    public void nullcheck() {
		    int[] A = new int[] {0,0,0,0,0,0};
	        int[] B =MinMaxFinder.findMinMax(A);
	        int[] C = new int[] {0,0};
	        //System.out.println(B);
	    
	        assertArrayEquals("max and min",B,C);  
	 
	    }
	 
	   

	
	}

