package Week2.Day1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

public class Links {
  public static void main(String[] args) throws InterruptedException{
	  System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Link.html");
		driver.manage().window().maximize();
		
		driver.findElementByLinkText("Go to Home Page").click();
	   if( driver.findElementByXPath("//h1[contains(text(),'Locators')]").isDisplayed() )
		   System.out.println("Navigated to home page");
	   
		driver.findElementByLinkText("HyperLink").click();
		 if( driver.findElementByXPath("//h1[contains(text(),'Play')]").isDisplayed() )
			   System.out.println("Navigated to back to hyperlink page");
		
	    String link = driver.findElementByLinkText("Find where am supposed to go without clicking me?").getAttribute("href");
	    System.out.println("Am Navigated to link if am link "+link);
	    
	    driver.findElementByLinkText("Verify am I broken?").click();
	    if(driver.getTitle().contains("HTTP Status 404 – Not Found"))
	    	System.out.println("page is broken");
	    else 
	    	System.out.println("page is not broken");
	    
	    driver.navigate().back();
	    
	    driver.findElementByXPath("//label[text()='(Interact with same link name)']/preceding::a[1]").click();
	    driver.navigate().back();
	    
	    List<WebElement> mylist = driver.findElementsByTagName("a");
	    System.out.println("No. of links in page are "+mylist.size());
	   
	    driver.close();
	    
	
	
}
  
}
