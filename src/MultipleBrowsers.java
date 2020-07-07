import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class MultipleBrowsers {

	public static void main(String[] args) { 
		
		/* multiple browser runs */
		
		 String browser = "edge";  // Change the selected browsers here 
		 WebDriver driver = null; // this is the parent class of all browser like ie, chrome and edge check in JAVA 11 API documention
		 
		 if (browser.equalsIgnoreCase("Chrome")) {
			 System.setProperty("webdriver.chrome.driver", "C:\\SATHISHA\\JavaSelenium\\QALearnSelenium\\driver\\chromedriver.exe"); // inside the project directory
			 driver = new ChromeDriver();
			 
		 } else if(browser.equalsIgnoreCase("firefox")){
			 System.setProperty("webdriver.gecko.driver","C:\\SATHISHA\\JavaSelenium\\QAFoxSeleniumTraining\\driver\\geckodriver.exe" );
			 driver = new FirefoxDriver();
			 
		 } else if (browser.equalsIgnoreCase("edge")) {
			 System.setProperty("webdriver.edge.driver","C:\\SATHISHA\\JavaSelenium\\QAFoxSeleniumTraining\\driver\\MicrosoftWebDriver.exe" );
			  driver = new EdgeDriver();
		 }
		
			
		
	//System.setProperty("webdriver.ie.driver","C:\\SATHISHA\\JavaSelenium\\QAFoxSeleniumTraining\\driver\\IEDriverServer.exe" );
	//System.setProperty("webdriver.edge.driver","C:\\SATHISHA\\JavaSelenium\\QAFoxSeleniumTraining\\driver\\MicrosoftWebDriver.exe" );
	// same version of selenium 3.141.59 and IE of 3.141.59 should be downloaded in the same path to work 
		
		
		
		driver.manage().window().maximize();	
		driver.get("http://omayo.blogspot.com/");
		
		
      List<WebElement> elements = driver.findElements(By.tagName("a")); // multiple elements
		
		/*
		 * for(int i=0; i<elements.size(); i++) {
		 * 
		 * if(elements.get(i).getText().length()>0) {
		 * System.out.println(elements.get(i).getText()); } }
		 */
		// for each loops
		
		 for(WebElement j : elements) {
			
			if(j.getText().length()>0) {
			System.out.println(j.getText()); 
		} 
		 }	
		driver.quit(); // close all the  window

	}

}
