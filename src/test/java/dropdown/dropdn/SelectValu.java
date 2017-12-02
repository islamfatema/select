package dropdown.dropdn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class SelectValu {
	@Test
  public void selectDropDown() throws InterruptedException{
		
	    	  System.setProperty("webdriver.gecko.driver", "/Users/fatemaislam/Downloads/geckodriver");
	    	  WebDriver driver=new FirefoxDriver();
	  driver.get("https://www.facebook.com/");
	 driver.manage().window().maximize();
	WebElement monthdd=driver.findElement(By.id("month"));
	 Select mm=new Select(monthdd);
	 

	mm.selectByIndex(03);
 Thread.sleep(3000);
 mm.selectByVisibleText("Aug");
 Thread.sleep(3000);
mm.selectByValue("10");
  }
}
