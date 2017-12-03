package dropdown.dropdn;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class bootstrap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "/Users/fatemaislam/Downloads/geckodriver");
  	  WebDriver driver=new FirefoxDriver();
  
  	  driver.get("http://seleniumpractise.blogspot.in/2016/08/bootstrap-dropdown-example-for-selenium.html");
  	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  	  driver.manage().window().maximize();
	driver.findElement(By.xpath(".//*[@id='menu1']")).click();
	List<WebElement> ddmenu=driver.findElements(By.xpath("//ul[@class='dropdown-menu']//li/a"));
	for(int i=0;i<ddmenu.size();i++){
		WebElement element=ddmenu.get(i);
		String innerHtml=element.getAttribute("innerHTML");
		if(innerHtml.contains("JavaScript")){
			element.click();
			break;
		}
		System.out.println("Values from dropdown is " +innerHtml);
	}
	driver.quit();
	}

}
