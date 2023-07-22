package testNGAnnotation_Flags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag1 {
	
	//It is used to described the method or test case
  @Test(description = "Login Method")
  public void method1() {
	  
	  Reporter.log("method1 From flag1",true);
  }
  
  @Test(description = "Logout Method")
  public void method2() {
	  
	  Reporter.log("method2 From flag1",true);
  }
}
