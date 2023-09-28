package newPackage;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class MYXTest {
	WebDriver driver;
	String baseURL;
	
  @Test
  public void f() {
	  
  }
  @BeforeClass
  public void setUp() {
	  baseURL = "http://localhost:8080/login";
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get(baseURL);
  }
//Test the login functionality with valid credentials
@Test
public void testLoginWithValidCredentials() {
//Navigate to the login page
driver.get("http://localhost:8080/login");

//

WebElement emailInput = driver.findElement(By.xpath("/html/body/form/input[1]"));
emailInput.sendKeys("normal@example.com");

//
WebElement passwordInput = driver.findElement(By.xpath("/html/body/form/input[2]"));
passwordInput.sendKeys("normpass");

//
WebElement loginButton = driver.findElement(By.xpath("/html/body/form/input[3]"));
loginButton.click();
}
  @AfterClass
  public void afterClass() {
  }

}
