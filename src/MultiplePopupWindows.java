import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultiplePopupWindows {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\SATHISHA\\JavaSelenium\\QALearnSelenium\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://omayo.blogspot.com/");  // main window
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("Open a popup window")).click(); // 1st child window will be open
		driver.findElement(By.linkText("Blogger")).click(); // 2nd child window will be open
		
		 Set<String> windowids = driver.getWindowHandles();
		 Iterator<String> itr = windowids.iterator();
		 
		 String firstparatextonpopupwindow = null ;  //declaring variable
		 
		 while(itr.hasNext()) {
			String windowid = itr.next();
			driver.switchTo().window(windowid);
			if (driver.getTitle().equals("Basic Web Page Title")) {
				
				firstparatextonpopupwindow = driver.findElement(By.id("para1")).getText();
				
			}
			 
		 }
		 
		 System.out.println(firstparatextonpopupwindow);
		 
		 
		 driver.quit();
	
	}

}
