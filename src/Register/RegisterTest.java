package Register;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.formula.functions.Rows;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class RegisterTest {
	 WebDriver driver;
  @Test(priority = 0)
  public void Register() {
	  driver.get("http://newtours.demoaut.com/mercuryregister.php");
	  driver.manage().window().maximize();
	  
  }
  @BeforeMethod
  public void beforeMethod() {
	  
	 
	  
	  System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Chrome 79\\chromedriver.exe");
	  driver = new ChromeDriver();
	 
  }
  
 @Test(priority = 1)
  public void getData() throws Throwable
  {
	 
	  FileInputStream fis = new FileInputStream("C:\\Users\\javed.ansari\\eclipse-workspace\\Practice\\src\\TestData.xlsx");
	  XSSFWorkbook wb = new XSSFWorkbook(fis);
	  XSSFSheet sh = wb.getSheet("Sheet1");
	  //XSSFRow rows = sh.getRow(0);
	  int rows = sh.getLastRowNum();
	  int cols = sh.getRow(0).getLastCellNum();
	  System.out.println("Total no.of rows : " + rows);
	  System.out.println("Total no.of columns : " + cols);
	  //String data[][] = new String[rows][cols];
	  
	  for(int i = 0;i<=rows;i++)
	  {
		  XSSFRow r = sh.getRow(i);
		  for(int j=0;j<=cols;j++)
		  {
			 
		  }
	  }
  }

  @AfterMethod
  public void afterMethod() {
  }

}
