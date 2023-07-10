package popuphandling;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Alertpopup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");
	    WebDriver driver= new EdgeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///C:/Users/Dell/Desktop/WCSA5/Web%20Element/Alert%20Popup.html");
		//To generate popup click on button
		driver.findElement(By.xpath("//button[@type='button']")).click();
		//Handle alert popup by using Robot Class
//		Robot robot = new Robot();          
//		robot.keyPress(KeyEvent.VK_ENTER);
//		robot.keyRelease(KeyEvent.VK_ENTER);
//		Thread.sleep(2000);
//		robot.keyPress(KeyEvent.VK_ENTER);
//		robot.keyRelease(KeyEvent.VK_ENTER);
		
		//Handle Alert popup by using SwitchTo();
		
	     Alert al = driver.switchTo().alert();
	     Thread.sleep(2000);
	     //al.accept();      for accept the alert pop up
	     //al.dismiss();     to dismiss the alert pop up
	     System.out.println(al.getText()); //alert the text of alert popup
	
		

	}

}
