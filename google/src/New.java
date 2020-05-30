package apple;
new

import java.util.List;

//import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
 
 
public class New {
 
 public static void main(String []args){
  
	System.setProperty("webdriver.gecko.driver", "F:\\Selenium Java\\older\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
  
		
		driver.get("http://www.leafground.com/pages/tooltip.html");
		WebElement element=	driver.findElement(By.id("age"));
		element.click();
		String element1=	element.getAttribute("title");	
				
		 Actions action = new Actions(driver);
		 action.moveToElement(element).build().perform();
		    String toolTipText = element.getText();
		    System.out.println(toolTipText);				
		
		
	
 }
}
