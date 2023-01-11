import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SearchTest {

	@Test
	public void validateSearch() {
		
		//WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.firefox.driver", " C:\\Users\\Saiful Chowdhury\\OneDrive\\Documents\\geckodriver-v0.32.0-win32>\\geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		driver.findElement(By.name("q")).sendKeys("Christmass 2022");
		
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		//Capture the webelement
//	WebElement firstLink=driver.findElement(By.xpath("(//div[@class='ofy7ae'])[1]"));
//	
//	String actualText=firstLink.getText();
//	String expected= "FIFA World Cup Qatar 2022™";
//	// Adding assertion to test
//	Assert.assertTrue(actualText.equalsIgnoreCase(expected),"Expected" +expected+ " but found >>"+actualText);
	                   
	          }
		 
		  }

	



	
	
	
	
	


			
			

		
		


	
	
	
	
	
	
	
	
	

