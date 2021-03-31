package integersInString;

public class MainClass {

	public static void main(String[] args) {
		String str = "I will eat 2 burgers 23 fries & 1.25 coke l8tr"; 
        System.out.print(extractInt(str)); 
        System.out.println("\nLength of given string str is ");
        System.out.println(str.length());

	}

	static String extractInt(String str) 
    { 
        // Replacing every non-digit number 
        // with a space(" ") 
        str = str.replaceAll("[^\\d]", " "); 
        
   
     //   System.out.println("Replace with Space " +str);
  
        // Remove extra spaces from the beginning 
        // and the ending of the string 
     //   str = str.trim(); 
     //   System.out.println("Replace with trim " +str);
  
        // Replace all the consecutive white 
        // spaces with a single space 
       // str = str.replaceAll(" +", " "); 
       // System.out.println("Removed all Space " +str);
  
           str=str.replaceAll(" +", " ");
           //replaceAl("string regres", "string replacement"); function used above////////////
       // if (str.equals("")) 
         //   return "-1"; 
  
        return str; 
    } 
}
