package junit.capgemeni;

import static org.junit.Assert.*;

import org.junit.Test;

public class MinmMaxFindersingleobjectTest {
	 
	 @Test
	    public void  negativevalues() {
		    int[] A = new int[] {1,-2,3,4,-5,6,7,-8,9,10};
	       String B =MinmMaxFindersingleobject.findMinMax(A);
	         String C = "-8,10";
	        assertEquals(B,C);
	 
	    }
	 @Test
	    public void  postivevalues() {
		    int[] A = new int[] {1,2,3,4,5,6,7,8,9,10};
	       String B =MinmMaxFindersingleobject.findMinMax(A);
	         String C = "1,10";
	        assertEquals(B,C);
	 
	    }
	 @Test
	    public void  repeatvalues() {
		    int[] A = new int[] {1,2,3,4,5,6,7,8,9,10,10,1};
	       String B =MinmMaxFindersingleobject.findMinMax(A);
	         String C = "1,10";
	        assertEquals(B,C);
	 
	    }
	 @Test
	    public void empty() {
		    int[] A = new int[10] ;
	       String B =MinmMaxFindersingleobject.findMinMax(A);
	         String C = "0,0";
	        assertEquals(B,C);
	 
	    }
	 @Test
	    public void  nullcheck() {
		    int[] A = new int[] {0,0,0,0,0,0,0,0};
	       String B =MinmMaxFindersingleobject.findMinMax(A);
	         String C = "0,0";
	        assertEquals(B,C);
	 
	    }
	 
	 
	 
	 
	 

	

}
