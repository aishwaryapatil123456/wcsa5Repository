package assignmentPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathCase1Assignment {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 
		 driver.manage().window().maximize();
		
		 driver.get("https://amc.amazon.com/ap/signin?clientContext=131-0375221-3828767&openid.return_to=https%3A%2F%2Famc.amazon.com%2F&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=amzn_amcentral_us&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&mons_redirect=sign_in");
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//input[@id='ap_email'] ")).sendKeys("aishwarya@123gmail.com");
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//input[@id='ap_password'] ")).sendKeys("aishwarya123");
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//input[@id='signInSubmit'] ")).click();

	}

}
