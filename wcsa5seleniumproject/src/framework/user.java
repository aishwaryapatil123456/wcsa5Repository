package framework;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class user {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("file:///C:/Users/Dell/Desktop/WCSA5/Web%20Element/LoginPage.html");
		
        Thread.sleep(2000);
		driver.findElement(By.id("i1")).sendKeys("aishwarya@123");
		
		 Thread.sleep(2000);
		 WebElement frameElement = driver.findElement(By.xpath("//iframe[@id='frameId']"));
		 
		 driver.switchTo().frame(frameElement);
	}

}
