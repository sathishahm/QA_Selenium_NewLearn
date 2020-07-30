import java.awt.Desktop.Action;
import java.awt.List;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TakingScreenshotsAutosuggestiveDropdownsTablesCalendar {

	public static void main(String[] args) throws IOException, InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "C:\\SATHISHA\\JavaSelenium\\QALearnSelenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		Thread.sleep(5000);
		
		//driver.get("http://omayo.blogspot.com/");
		//driver.get("https://www.makemytrip.com/");
		driver.get("https://www.path2usa.com/travel-companions/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
			
		/*
		//take a screen shot
		File ScreenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);  // taking screen shot
		FileUtils.copyFile(ScreenshotFile, new File("screenshots\\screenshot1.png"));  // store in screenshot folder
		
		driver.findElement(By.linkText("theautomatedtester")).click();;
		
		//another screen shot
		File ScreenshotFile1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);  // taking screen shot
		FileUtils.copyFile(ScreenshotFile1, new File("screenshots\\screenshot2.png"));  // store in screenshot folder
		
		driver.quit(); 
		*/
		
		/// Auto DropDown
		
		//overcome the pop upwindow
		
		/*
		
		WebElement logo = driver.findElement(By.xpath("//a[@data-cy='mmtLogo']/img"));
		Actions a = new Actions(driver);
		a.moveToElement(logo).click().build().perform();
		
			
		driver.findElement(By.id("fromCity")).click();
		driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys("del");
		
		int i=0;   // Four times to below key Press
		while (i<4) {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys(Keys.DOWN);
		i++;
		
	}

		driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys(Keys.ENTER); */
		
		
		//Calender
		
		Thread.sleep(5000);
		driver.findElement(By.id("travel_date")).click();
		while(!driver.findElement(By.className("datepicker-switch")).getText().contains("December")){
			driver.findElement(By.xpath("//th[@class='next'])[1]")).click();
		}
			
			 java.util.List<WebElement> days = driver.findElements(By.className("day"));
			
			for(int i=0; i<days.size(); i++) {
				if(days.get(i).getText().equalsIgnoreCase("15")) {
					days.get(i).click();
					break;
					
				}
				
			}  
		
		
	
		

}
}
 