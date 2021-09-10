package junit.capgemeni;

import java.util.Arrays;

public class MinMaxFinder 
{
	public static int[] findMinMax(int A[])
	{       
		   
		    int max = A[0];
		    int min = A[0];
		    for ( int i=0;i<A.length;i++ )
		    {
		        if ( A[i] > max )
		            max = A[i];
		        else if ( A[i] < min )
		            min = A[i];
		    }
		    // By convention, let ans[0] = minimum and ans[1] = maximum
		   return  new int[] {min, max};
		   
	}
}


