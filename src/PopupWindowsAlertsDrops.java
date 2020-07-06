import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopupWindowsAlertsDrops {

	public static void main(String[] args) {
	
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\SATHISHA\\JavaSelenium\\QALearnSelenium\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://omayo.blogspot.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("Open a popup window")).click();
		
		 Set<String> windowids = driver.getWindowHandles();
		 Iterator<String> itr = windowids.iterator();
		
		 String mainwindow = itr.next();
		 String childwindow = itr.next();
		 
		 // switched to child window
		 driver.switchTo().window(childwindow);
		 
		 String firstparaonchildwindow = driver.findElement(By.id("para1")).getText();
		 System.out.println(firstparaonchildwindow);
		 
		 driver.close();
		 
		 driver.switchTo().window(mainwindow);  /// this is main window close
		 driver.close();
		 
		 
		
		//check the windows ID'd on the pop up windows of main page
	
		// Iterator<String> = windowids.iterator();
	     
		// while(itr.hasNext()) {
		//	String windowids = itr.Next();
			// System.out.println(windowids);
		// }
 
       
       
		
		
		
		
		

	}

}
