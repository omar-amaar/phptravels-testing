package selenumepackage.Autoamtinnprocikt;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class login_test {
	WebDriver driver = new ChromeDriver();
	String baseURL ="https://the-internet.herokuapp.com/login";
	
	
  @Test
  public void f() {
	  String actualResult = driver.getTitle();
	  String expectedResult = "The Internet";
	  Assert.assertEquals(actualResult, expectedResult);
  }
  @BeforeTest
  public void openbrowser() {
	  driver.navigate().to(baseURL);
	  
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
