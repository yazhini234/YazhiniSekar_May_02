package Week2.Day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateLead {
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
		
		driver.findElementByXPath("//span[text()='Email']").click();
		driver.findElementByXPath("//input[@name='emailAddress']").sendKeys("yazhini@gmail.com");
        driver.findElementByXPath("//em[@unselectable='on']/button[text()='Find Leads']").click();
        Thread.sleep(2000);
		
        String text = driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a").getText();
        System.out.println("Lead name-->"+text);
        driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a").click();
        driver.findElementByXPath("//a[text()='Duplicate Lead']").click();
        Thread.sleep(2000);

         if(driver.findElementByXPath("//div[@id='sectionHeaderTitle_leads']").getText().contains("Duplicate Lead"))
        	 System.out.println("Title -->Duplicate Lead");
         driver.findElementByXPath("//input[@name='submitButton']").click();
         
         String text2 = driver.findElementByXPath("//span[@id='viewLead_firstName_sp']").getText();
         if(text.equals(text2))
        	 System.out.println("Duplicate record is created is successfully");
         
         
         driver.close();
         
        
        
        
        
        
        
		
        
		
	}

}


