import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumFirstPrg {

		public static void main(String[] args) throws InterruptedException {
		
		//Chrome Driver is a predefined class of selenium Webdriver Libraries 
		//Created an object for chrome driver class
		// ChromeDriver is the child class of webdriver interface
		//ChromeDriver - Chrome Browser
		//ChromeDriver() -- Constructor -- Lunch CromeBrowser
		
		// System.setProperty("webdriver.chrome.driver","C:\\SATHISHA\\LEARN & WORK\\SELENIUM\\Selenium Software\\Drivers\\New Ones\\chromedriver.exe"); //out side the driver
		
		System.setProperty("webdriver.chrome.driver","C:\\SATHISHA\\JavaSelenium\\QAFoxSeleniumTraining\\driver\\chromedriver.exe"); // inside the project directory
	
		//Blank browser opened
		WebDriver driver = new ChromeDriver();
		
		//the provided URl will be opened
		driver.get("http://omayo.blogspot.com/");
		
		// maximize the window
		driver.manage().window().maximize();
		
		//finding the UI elements
		      //WebElement element = driver.findElement(By.id("confirm")); // button
		     //WebElement element = driver.findElement(By.name("q")); // name 
		     //WebElement element = driver.findElement(By.className("classone")); // class
		     //WebElement element = driver.findElement(By.linkText("compendiumdev")); // linktext
		     // WebElement element = driver.findElement(By.partialLinkText("compendiumdev")); // partial linktext
		     // WebElement element = driver.findElement(By.cssSelector("#prompt")); // css selector
		    // WebElement element = driver.findElement(By.xpath("//input[@id='prompt']")); // Xpath
		    //driver.findElement(By.xpath("//input[@id='prompt']")).click(); // use like this also for above xpath
		
		String text = driver.findElement(By.id("PracticeAutomationHere")).getText();
		System.out.println(text);  // text is an variable and getText() returntype is String (Hover)
		
		
		    
		     //Click on the confirm button
		     //element.click();       // here element is object reference of the WebElement mentioned above
		     //element.sendKeys("Sathisha"); // Add the text
		    // element.click();   // link text
		     // hold the program for 5 secc
		    // Thread.sleep(5000);  //5000 mili meanse 5 sec
		    // element.clear();  // clear the text
		     //element.sendKeys("Arun Motori"); // send the input
		     
		     
		     
		     
		

	}

}
 