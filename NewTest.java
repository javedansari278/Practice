import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class NewTest {
  @Test
  WebDriver driver; // Instant Variables.
  public void Register() {
	  
	  driver.get("http://newtours.demoaut.com/mercuryregister.php"); // Main Test
	  driver.manage().window().maximize();
	  
  }
  @BeforeMethod
  public void beforeMethod() {
	  
	  //Before method Test
	  System.setProperty("Webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	   driver = new ChromeDriver();
	  
  }

  @AfterMethod
  public void afterMethod() {
	  
	  driver.quit();
	  //Closing browser
  }

}
