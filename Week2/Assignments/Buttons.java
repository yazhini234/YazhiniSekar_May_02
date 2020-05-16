package Week2.Day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class Buttons {
	public static void main(String[] args) throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Button.html");
		driver.manage().window().maximize();
		
		driver.findElementById("home").click();
		if( driver.findElementByXPath("//h1[contains(text(),'Locators')]").isDisplayed() )
			   System.out.println("Navigated to home page");
		
		driver.findElementByXPath("//h5[text()='Button']").click();
		 if( driver.findElementByXPath("//h1[contains(text(),'Bond')]").isDisplayed() )
			   System.out.println("Navigated to back to Buttons page");
		
		int x=driver.findElementById("position").getLocation().getX();
		int y=driver.findElementById("position").getLocation().getY();
		System.out.println("x value of button is "+x);
		System.out.println("y value of button is "+y);
		
		System.out.println("colour of button"+driver.findElementById("color").getCssValue("background-color"));
		
		System.out.println("size of button "+driver.findElementById("size").getSize());
		
		driver.close();
		
		
		
	}

}

