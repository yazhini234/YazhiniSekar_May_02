package Week2.Day1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLeads {
	public static void main(String[] args)throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		String url="http://leaftaps.com/opentaps/control/main";
		driver.get(url);
		driver.manage().window().maximize();
		
		driver.findElementByXPath("//label[text()='Username']/following-sibling::input").sendKeys("demosalesmanager");
		driver.findElementByXPath("//label[text()='Username']/following::input[2]").sendKeys("crmsfa");
		driver.findElementByXPath("(//form[@id='login']//input)[3]").click();
		driver.findElementByXPath("//div[@id='label']/a").click();
		driver.findElementByXPath("//a[text()='Leads']").click();
		driver.findElementByXPath("//a[text()='Find Leads']").click();
		
		driver.findElementByXPath("//span[text()='Phone']").click();
		driver.findElementByXPath("//input[@name='phoneNumber']").sendKeys("0767565656");
		driver.findElementByXPath("//em[@unselectable='on']/button[text()='Find Leads']").click();
		Thread.sleep(2000);
		
		
		WebElement text = driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]");
		String id=text.getText();
		System.out.println(id);
		
		driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]").click();
		driver.findElementByXPath("//a[@class='subMenuButtonDangerous']").click();
		Thread.sleep(2000);
		
		driver.findElementByXPath("//a[text()='Find Leads']").click();
		driver.findElementByXPath("//input[@name='id']").sendKeys(id);
		driver.findElementByXPath("//em[@unselectable='on']/button[text()='Find Leads']").click();
		Thread.sleep(2000);
		
		
		if(driver.findElementByXPath("//div[text()='No records to display']").isDisplayed())
			System.out.println("Deleted Successfully");
		else
			System.out.println("Not deleted");
		
		
		driver.close();
		
	}

}
