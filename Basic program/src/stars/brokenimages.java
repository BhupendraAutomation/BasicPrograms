package stars;

import java.net.HttpURLConnection;
//import java.io.IOException;
//import java.net.HttpURLConnection;
//import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//import com.sun.net.ssl.HttpsURLConnection;

//import com.sun.tools.javac.util.List;

public class brokenimages {

	private static HttpsURLConnection httpsURLConnection;
	{
		
	}

	public static void main(String[] args) throws Exception  {
		brokenimagesverify();

	}
	
	public static void brokenimagesverify() throws Exception
	{
		System.setProperty("webdriver.chrome.driver","/home/imuons/Desktop/Jars and Files/Jars/chromedriver_linux64/chromedriver");
		
	//	WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
				
		//driver.get("https://www.theworldsworstwebsiteever.com/");
		
		driver.get("https://www.amazon.in");
		
		driver.findElement(By.id("nav-logo-sprites")).click();
		
		Thread.sleep(9000);
		
		List<WebElement> images = driver.findElements(By.tagName("img"));
		
		System.out.println(images.size());
		
		for (WebElement image : images) {
			
			String imageSrc = image.getAttribute("src");
			
			try {
				URL url  = new URL(imageSrc);
				
				URLConnection urlConnection = url.openConnection();
				
				HttpsURLConnection httpsURLConnection =  (HttpsURLConnection) urlConnection;
				
				System.out.println("Execution of this line is done by WebDriver1");

				//httpsURLConnection.setConnectTimeout(5000);
				
				httpsURLConnection.setConnectTimeout(5000);
				
				//Thread.sleep(10000);
				
				//httpsURLConnection.connect();
				
				httpsURLConnection.connect();
				
				System.out.println("Execution of this line is done by WebDriver2");
				
				Thread.sleep(500);
				
				System.out.println("Execution of this line is done by WebDriver3");
				
				if(httpsURLConnection.getResponseCode()==200) 
					
					System.out.println(imageSrc + ">>" +httpsURLConnection.getResponseCode()+  " >> "  +httpsURLConnection.getResponseMessage());
				
				else 
					System.err.println(imageSrc + ">>" +httpsURLConnection.getResponseCode()+  " >> "  +httpsURLConnection.getResponseMessage());
				
				     httpsURLConnection.disconnect();
				
			}
			catch(Exception e){
			
				System.out.println(imageSrc);
			
			}
			
		}
	}

}
