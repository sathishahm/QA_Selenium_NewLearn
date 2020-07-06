import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ImplicitExplisit {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\SATHISHA\\JavaSelenium\\QALearnSelenium\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://omayo.blogspot.com/");  // main window
		driver.manage().window().maximize();  // manage window
		
		// selenium Implicitly wait -- Global variable 
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS); // global wait for all elements 10 sec 
		
		driver.findElement(By.className("dropbtn")).click();;
		//driver.findElement(By.linkText("Facebook"));
		
		// implicit wait (only relevent to loactor take more time to us
		WebDriverWait wait = new WebDriverWait(driver, 30);
		 WebElement facebookelement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Facebook")));
		facebookelement.click();
		
				
				
		 driver.quit();
	}

}
