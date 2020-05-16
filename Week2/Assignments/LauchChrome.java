package Week2.Day1;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LauchChrome {
	
	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElementById("username").sendKeys("demosalesmanager");
		driver.findElementById("password").sendKeys("crmsfa");
		Thread.sleep(1000);
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").sendKeys("Accenture");
		driver.findElementById("createLeadForm_firstName").sendKeys("yaz");
		driver.findElementById("createLeadForm_lastName").sendKeys("sekar");
		Select dropdown =new Select(driver.findElementById("createLeadForm_dataSourceId"));
		dropdown.selectByVisibleText("Employee");
		Select dropdown1 =new Select(driver.findElementById("createLeadForm_marketingCampaignId"));
		dropdown1.selectByValue("9001");
		Select dropdown2 =new Select(driver.findElementById("createLeadForm_ownershipEnumId"));
		dropdown2.selectByIndex(5);
		Select dropdown3 =new Select(driver.findElementById("createLeadForm_generalCountryGeoId"));
		dropdown3.selectByVisibleText("India");
		Thread.sleep(1000);
		driver.findElementByName("submitButton").click();
		System.out.println(driver.getTitle());
		driver.close();
	}

}
