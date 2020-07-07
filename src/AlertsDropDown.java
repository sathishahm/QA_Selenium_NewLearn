import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AlertsDropDown {

	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver", "C:\\SATHISHA\\JavaSelenium\\QALearnSelenium\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://omayo.blogspot.com/");  // main window
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		//Alerts//
		//driver.findElement(By.id("alert1")).click();
		
		//Alert alert = driver.switchTo().alert();
		//String textDisplayedonAlert = alert.getText();
		//System.out.println(textDisplayedonAlert);
		
		//driver.switchTo().alert().accept();
		//alert.accept();
		
		
		
		// Drop down and multi selection
		driver.findElement(By.id("drop1")); // wrong approch this not exact way to select
		
		//Another important Method		
		WebElement dropdownfield = driver.findElement(By.id("drop1"));
		Select select = new Select(dropdownfield);
		select.selectByVisibleText("doc 3");
		Thread.sleep(3000);
		select.selectByIndex(3); // by index value u can selectS
		
		
		// multiple selections
		WebElement multiSelection = driver.findElement(By.id("multiselect1"));
		Select selects = new Select(multiSelection);
		selects.selectByVisibleText("Volvo");
		selects.selectByVisibleText("Swift");
		selects.selectByVisibleText("Audi");
		
		Thread.sleep(3000);
		
		selects.deselectByVisibleText("Swift");
		
		
		
		
		driver.quit();
		
		
	}

}
