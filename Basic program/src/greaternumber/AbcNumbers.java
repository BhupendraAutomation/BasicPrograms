package greaternumber;

//import org.testng.annotations.Test;

public class AbcNumbers {

	//@Test
	public static void main(String[] args) {
		
		int x = 1;
		
		int[] arr = {2,55,3,11,-1};
		
		int countValue = greatervalue(arr, x);
		
		System.out.println(countValue);
		
		//System.out.println("Numbers are greater than 10 are " );
		
	}

		
		static int greatervalue(int arr[], int x)
		{
			int currentStatus = 0; 
	        int totalValue = 0; 
	        
	        int i; 
	        int len = arr.length; 
	        
	        for (i = 0; i < len ; i++ ) 
	        {
	        	if (arr[i] + currentStatus < x)  
	                currentStatus += 1; 
	              
	            else
	            { 
	                currentStatus -= 1; 
	                totalValue += 1; 
	            } 
	        }
	        return totalValue; 
		}
		

}
