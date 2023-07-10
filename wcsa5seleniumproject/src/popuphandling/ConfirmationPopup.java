package popuphandling;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ConfirmationPopup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");
	    WebDriver driver= new EdgeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///C:/Users/Dell/Desktop/WCSA5/Web%20Element/Confirmation%20Popup.html");
		
		//To generate the confirmation popup click on submit button
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		//OR driver.findElement(By.tagName("inout"));
		
		//Handle confirmation popup by using switchTo()
		Thread.sleep(2000);
		Alert al=driver.switchTo().alert();
	//	al.accept(); //Accept the confirmation popup
	//	al.dismiss(); //Dismiss the confirmation popup
		 System.out.println(al.getText());
		 al.accept();
		 
		

	}

}
