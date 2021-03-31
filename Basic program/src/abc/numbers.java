package abc;

//import org.testng.annotations.Test;

public class numbers {

	//@Test
	public static void main(String[] args) {
		
        String s= "I will eat 2 burgers 23 fries & 1.25 coke l8tr";
        
        Runnable runnable=() -> System.out.println(s);
        
        runnable.run();
		
		count(s);
	}
	
	public static void count(String a) {
	
		char[] ch= a.toCharArray();
				
		int num=0;
		int letter=0;
		int space=0;
				
		
		for(int i=0; i< a.length(); i++)
		{
			if(Character.isLetter(ch[i]))
			{
			letter ++;
		     }
		
		    else if(Character.isDigit(ch[i]))
		    {
			num ++;
		     }
			
		    else if(Character.isSpaceChar(ch[i]))
		    {
		    	space ++;
		    }
			    
		
		}
				
		System.out.println("Total Letter present in string are "  +letter);
		System.out.println("Total Number present in string are "  +num);
		System.out.println("Total Space present in string are "  +space);
				
	}
	
	
	}

