package Week2.Day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

	public static void main(String[] args) throws InterruptedException  {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		String url="http://leafground.com/pages/checkbox.html";
		driver.get(url);
		driver.manage().window().maximize();
		
		driver.findElementByXPath("//div[text()='Java']/input").click();
		
		if(driver.findElementByXPath("//div[text()='Selenium']/input").isSelected())
			System.out.println("Checke box is Enabled");
		else
			System.out.println("Checkbox is not Enabled");
		
		
		if(driver.findElementByXPath("//div[text()='Not Selected']/input").isSelected())
			driver.findElementByXPath("//div[text()='Not Selected']/input").click();
		if(driver.findElementByXPath("//div[text()='I am Selected']/input").isSelected())
			driver.findElementByXPath("//div[text()='I am Selected']/input").click();
		
		
		driver.findElementByXPath("//div[text()='Option 1']/input").click();
		driver.findElementByXPath("//div[text()='Option 2']/input").click();
		driver.findElementByXPath("//div[text()='Option 3']/input").click();
		driver.findElementByXPath("//div[text()='Option 4']/input").click();
		driver.findElementByXPath("//div[text()='Option 5']/input").click();
		
		driver.close();
	}
}
