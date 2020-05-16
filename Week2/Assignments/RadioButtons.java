package Week2.Day1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtons {

	public static void main(String[] args) throws InterruptedException{

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		String url="http://leafground.com/pages/radio.html";
		driver.get(url);
		driver.manage().window().maximize();
		
		driver.findElementByXPath("//input[@id='yes']").click();
		
		if(driver.findElementByXPath("//input[@name='news']").isSelected())
			System.out.println("Selected radio button--> "+driver.findElementByXPath("//label[@for='Unchecked']").getText());
		else
			System.out.println("Selected radio button--> "+driver.findElementByXPath("//label[@for='Checked']").getText());
		
		boolean a1 = driver.findElementByXPath("//input[@name='age']").isSelected();
		boolean a2 = driver.findElementByXPath("(//input[@name='age'])[2]").isSelected();
		boolean a3 = driver.findElementByXPath("(//input[@name='age'])[3]").isSelected();

		if(a1==false && a2==false && a3==false)
			driver.findElementByXPath("(//input[@name='age'])[2]").click();
		else
			System.out.println("ALready selected");
		
		Thread.sleep(1000);
		
		driver.close();
		
			
		
	
	
		
			
		
	
		
	}
}

