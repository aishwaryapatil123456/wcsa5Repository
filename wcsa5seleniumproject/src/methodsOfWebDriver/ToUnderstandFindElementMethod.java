package methodsOfWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUnderstandFindElementMethod {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	    WebDriver driver= new ChromeDriver();
	    driver.manage().window().maximize();
		driver.get("http://somnath-pc/login.do");
WebElement usn=driver.findElement(By.xpath("//input[@class='textField']"));
usn.sendKeys("manager");

		
		
		
		

	}

}
