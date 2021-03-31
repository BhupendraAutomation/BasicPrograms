package stars;

import java.util.HashMap;

import org.apache.tools.ant.taskdefs.Length;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class triangletype {
	
	
	public static void triangle(int n)
	{
		int i,j;//n=5;
		
		for (i=0; i<n; i++)
		{	
			for(j=(n-i); j>1; j--)
			{
				System.out.print(" ");
			}
			
			for(j=0; j<=i; j++)
			{
				System.out.print( " *");
			}
			System.out.println();
		}
	}  
	
	
	public static void main(String[] args) {
				
		int n=5;
		
		triangle(n);
		
		//System.setProperty("webdriver.chrome.driver","/home/imuons/Desktop/Jars and Files/Jars/chromedriver_linux64/chromedriver");
		
		//WebDriver driver=new ChromeDriver();
		
		//driver.get("https://www.google.com");
		
		//driver.navigate().to("https://www.google.com");
		
		
         int i,j,num=1,c=1,count=0,e=0,f=0,g=1;
         int k,m;
         String a="Hello Java (Program to create triangle)";
         StringBuilder  b=new StringBuilder();
         
         System.out.println("Length of String a is "  +a.length());
         b.append(a);
         b.reverse();
         
         //////////////////////Above String Count Using For Loop//////////////////////////
         char chars[]=a.toCharArray();
        
         int p=0;
         for(char C: a.toCharArray())
         {
        	 p++;
        	 
         }
         
         System.out.println("Length of string without Inbuild function is :" +p);
         
         HashMap<String, Integer>people= new HashMap<String, Integer>();
         
         HashMap<String, Integer>abc=new HashMap<String, Integer>();
         
         
         people.put("Software", 3);
         people.put("Testing", 2);
         
         abc.put("Testering", 20);
         abc.put("Pralhad", 23);
         abc.put("ThinkPad", 20000);
         
         System.out.println(abc);
         
         for(String q:people.keySet())
         {   
         
         System.out.println("Key:" +q+  " Value: " +people.get(q));
         //System.out.println(people);
         }
        		 
         for(i=chars.length-1; i >= 0; i--)
         {
        	 System.out.print(chars[i]);
         }
         ////////////////////////Reverse String///////////////////////////////
         System.out.println("                                         ");
         System.out.println("Original String is- "  +a);
         System.out.println("Reversed String is- "   +b);
		
		for (i=1;i<n;i++)
		{	
			e = f;
			f = g;
			g = e+f;
			
			System.out.print(+e);//////////////?Fibonacci Series
					
			for(j=0;j<i;j++)
			{
								
				System.out.print(num+ " ");
				num=num+1;
				
			}
			
			System.out.println();
		}
		///////////////Duplicate Characters in string/////////////
		for(k=0; k<a.length();k++)
		{
			for(m=k+1; m<a.length(); m++)
			{
				if(chars[k]==chars[m])
				{
					System.out.print(" "  +chars[m]);
					count++;
					break;
				}
			}
		}
	}
	
}
