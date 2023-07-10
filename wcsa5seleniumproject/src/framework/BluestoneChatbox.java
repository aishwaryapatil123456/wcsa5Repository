package framework;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BluestoneChatbox {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://www.bluestone.com/");
		
		Thread.sleep(2000);
		// handle hidden division pop up
	    driver.findElement(By.id("denyBtn")).click();
	    
	    Thread.sleep(2000);
	    //identify frame by using xpath
	    WebElement frameElement = driver.findElement(By.xpath("//iframe[@id='fc_widget']"));
	    
	    //Handle the frame by Switch the controls to frame
	   // driver.switchTo().frame(5);//handle frame by using index
	    //driver.switchTo().frame("fc_widget");//handle frame by using name or id
	      driver.switchTo().frame(frameElement);
	      
	      WebElement chatBox = driver.findElement(By.id("chat-icon"));
	      chatBox.click();
	    
	   // WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
	   //wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='chat-icon']")));
	    
	    //switch the control again back to the main webpage.
	    driver.switchTo().defaultContent();
	    Thread.sleep(2000);
	    driver.findElement(By.id("chat-fc-name")).sendKeys("aishwarya");
	    Thread.sleep(2000);
	    driver.findElement(By.id("chat-fc-email")).sendKeys("aishwaryapatil2897@123");
	    Thread.sleep(2000);
	    driver.findElement(By.id("chat-fc-phone")).sendKeys("8329087410");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//a[text()='Start Chat']")).click();
	}

}
