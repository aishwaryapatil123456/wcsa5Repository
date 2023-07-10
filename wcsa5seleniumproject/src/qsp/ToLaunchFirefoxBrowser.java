package qsp;

import org.openqa.selenium.firefox.FirefoxDriver;

public class ToLaunchFirefoxBrowser {

	public static void main(String[] args) {

// Relative Path of Driver Executable File
	System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");	
	
	new FirefoxDriver();//Launch Firefox Browser
	}

}
