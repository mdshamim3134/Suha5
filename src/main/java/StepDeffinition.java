import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;


public class StepDeffinition {
ChromeDriver driver;

@Given("^openBrowser$")
public void openbrowser() throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\shamama\\Downloads\\chromedriver_win32\\chromedriver.exe");
 driver = new ChromeDriver();
	
   
}  

@When("^get url$")
public void get_url() throws Throwable {
	driver.get("https://www.facebook.com/");
}

@When("^user id$")
public void user_id() throws Throwable {
	driver.findElement(By.xpath(".//*[@id='u_0_e']")).sendKeys("asma");
    driver.findElement(By.xpath(".//*[@id='u_0_9']")).sendKeys("talukder");
}

@When("^user password$")
public void user_password() throws Throwable {
	driver.findElement(By.xpath(".//*[@id='u_0_l']")).sendKeys("9259988");
  
}


}
