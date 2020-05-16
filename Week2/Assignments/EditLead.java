package Week2.Day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class EditLead {
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
		driver.findElementByXPath("(//input[@name='firstName'])[3]").sendKeys("Yazhini");
		
		Thread.sleep(2000);
		
		driver.findElementByXPath("//em[@unselectable='on']/button[text()='Find Leads']").click();
		driver.findElementByXPath("//a[contains(text(),'Yazhini')]").click();
		System.out.println("Title of page-->"+driver.findElementByXPath("//div[@id='sectionHeaderTitle_leads']").getText());
		driver.findElementByXPath("//div/a[text()='Edit']").click();
		driver.findElementByXPath("//input[@id='updateLeadForm_companyName']").clear();
		driver.findElementByXPath("//input[@id='updateLeadForm_companyName']").sendKeys("CTS");
		
		Thread.sleep(2000);
		
		driver.findElementByXPath("//input[@value='Update']").click();
	    System.out.println("Updated Company name"+driver.findElementByXPath("//span[@id='viewLead_companyName_sp']").getText());
	   
	    
	    driver.close();
	    
	    
	    
		
		
		
	}

}