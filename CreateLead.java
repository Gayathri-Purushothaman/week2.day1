package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

	public static void main(String[] args) {
		
WebDriverManager.chromedriver().setup();
ChromeDriver driver=new ChromeDriver();
driver.get("http://leaftaps.com/opentaps/");
driver.manage().window().maximize();
driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
driver.findElement(By.id("password")).sendKeys("crmsfa");
driver.findElement(By.className("decorativeSubmit")).click();
driver.findElement(By.linkText("CRM/SFA")).click();
	driver.findElement(By.linkText("Leads")).click();
	driver.findElement(By.linkText("Create Lead")).click();
	driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Nexware");
	driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Gayathri");
	driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Purushothaman");
	driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Gayathri");
	driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Testing");
	driver.findElement(By.id("createLeadForm_description")).sendKeys("Manual Testing");
	driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("gayathri.71333@gmail.com");
	WebElement selectState=driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
	Select dd=new Select(selectState);
	dd.selectByVisibleText("New York");
	driver.findElement(By.name("submitButton")).click();
	System.out.println(driver.getTitle());
	driver.close();
	
	}

}
