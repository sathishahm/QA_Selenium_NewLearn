import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class XpathExpressions {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\SATHISHA\\JavaSelenium\\QALearnSelenium\\driver\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.get("http://omayo.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.id("dropbtn"));
		
		 WebDriverWait wait = new WebDriverWait(driver, 30);
		List<WebElement> facebookdrop = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.linkText("Facebook")));
		 
		facebookdrop.clear();
		

	}

}
