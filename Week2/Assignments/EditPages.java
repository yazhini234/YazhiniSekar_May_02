package Week2.Day1;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditPages {

	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Edit.html");
		driver.manage().window().maximize();
		
		driver.findElementById("email").sendKeys("yazhini@gmail.com");
		
		driver.findElementByXPath("//input[@value='Append ']").sendKeys("yazhini");
		
		System.out.println(driver.findElementByXPath("//label[text()='Get default text entered']/following::input").getAttribute("value"));
		
		driver.findElementByXPath("//input[@value='Clear me!!']").clear();
		
		Thread.sleep(2000);
		
		if(driver.findElementByXPath("//label[text()='Confirm that edit field is disabled']/following::input").isEnabled())
			System.out.println("Field is enabled");
		else
			System.out.println("Filed disabled");
		
		driver.close();
		
	
	}
	
}

