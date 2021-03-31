package stars;

public class Starpattern {

	public static void main(String[] args) {
		
		int i=0,j=0,n=4;
		
		String str="Software1 Testing2";
		
		int[] arr=new int[] {1,5,3,7,32,545,5,9,32};
		
		for(int k=0; k<arr.length;k++)////Duplicate Integers from array
		{
			for(j=k+1; j<arr.length;j++)
			{
				if(arr[k]==arr[j])
					
				System.out.println(arr[j]);
				
			}
		}
		
		str=str+"Abc";
		
		System.out.println(str);
		
	/*	int abc[]= {10,20,30,30,100,35,78};
		
		int max =abc[0];
		for(i=1;i<=abc.length;i++)//To find max number in array
		{
			if(abc[i]>max)
			{
				max=abc[i];
				
			}
			
		}   */
		
		char chars[]=str.toCharArray();
		
		for(i=0;i<=n;i++)
		{
			//System.out.println("Star Pattern");
			for(j=(n-i);j>=1;j--)
			{
				System.out.print(" ");
			}
			for(j=0;j<=i;j++)
			{
				System.out.print(" *");
			}
			System.out.println();
		}
		
		for(i=chars.length-1;i>=0;i--)/////Reverse String For Loop//////
		{
			System.out.print(chars[i]);
			
		}
		
		for(char c: str.toCharArray())
		{
			i++;
		}
		System.out.println("Length of String is " +i);
		
		str=str.replaceAll("[^\\d]", " ");///Numbers in string///////
		
		System.out.print(str);
		

	}

}
