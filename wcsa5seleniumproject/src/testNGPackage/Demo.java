package testNGPackage;

import org.testng.annotations.Test;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo {
  @Test
  public void f() {
	  
	  // System.out.println("This is DemoTestNG class!!");
	  
	//  Reporter.log("This is DemoTestNG class!!");
	  
	  Reporter.log("This is DemoTestNG", true);
  }
}
