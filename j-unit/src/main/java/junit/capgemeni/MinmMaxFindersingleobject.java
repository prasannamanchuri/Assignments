package junit.capgemeni;

public class MinmMaxFindersingleobject {
	public static String findMinMax(int A[])
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
		return min+","+max;
}

	

}
