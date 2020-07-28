import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingFramesLightboxActionsclassaKeysclass {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\SATHISHA\\JavaSelenium\\QALearnSelenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://omayo.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		// switch to the iFrame
		
		/* WebElement iframe = driver.findElement(By.id("iframe2"));
		driver.switchTo().frame(iframe);
		
		driver.findElement(By.id("q")).sendKeys("Sathisha");
		
		driver.switchTo().defaultContent(); // switch to default 
		driver.findElement(By.id("ta1")).sendKeys("myname");
		
		
		// Lightbox
		driver.get("http://omayo.blogspot.com/Lightbox");
		driver.findElement(By.linkText("LightBox1")).click();
		driver.findElement(By.xpath("//*(@spam.cusor)")).click(); // to close the light box */
		
		
		//Actions Class (mouse movements)
		
		WebElement blogs = driver.findElement(By.id("blogsmenu"));
		WebElement selenium123 = driver.findElement(By.xpath("//span[contains(text(),'Selenium143')]"));
		
		Actions a = new Actions(driver);  // this is action class
		
		a.moveToElement(blogs).perform(); // add perform at the end
		Thread.sleep(2000);
		a.moveToElement(selenium123).click(selenium123).build().perform();  // build for multiple opention 
		
		
		// drag and drop
		WebElement minprise = driver.findElement(By.xpath("take exact slibar path"));
		Thread.sleep(2000);
		a.dragAndDropBy(minprise, 100, 0).perform(); // move right side
		
		Thread.sleep(2000);
		a.dragAndDropBy(minprise, -200, 0).perform(); // move left side
		
		// Context clic or Right click
		
		WebElement searchbox = driver.findElement(By.name("q"));
		a.contextClick(searchbox).perform();
		
		// doubble click
		WebElement searchbox1 = driver.findElement(By.name("q"));
		searchbox1.sendKeys("Sathish");
		a.doubleClick(searchbox1).perform();
		
		// drag and drop
		WebElement oslo = driver.findElement(By.id("Box101"));
		WebElement norvay = driver.findElement(By.id("Box111"));
		a.dragAndDrop(oslo, norvay).perform();
		
		// keydown and keyup
		
		WebElement compdev = driver.findElement(By.linkText("compendiumdev"));
		a.keyDown(Keys.CONTROL).click(compdev).keyUp(Keys.CONTROL).build().perform();  // keys having the class of all the KEYS
		
		//Tab and Enter
		
		driver.findElement(By.name("userid")).sendKeys("sathish");
		a.sendKeys(Keys.TAB).perform();
		WebElement passwords = driver.findElement(By.name("pswrd"));
		passwords.sendKeys("asbsss");
		
		a.sendKeys(Keys.TAB).perform();
		a.sendKeys(Keys.ENTER).perform();
		
		// press the enter in the password
		//http://tutorialsninja.com/demo/index.... site address 
		driver.findElement(By.id("xxxx")).sendKeys("arun.selenium@gmail.com");
		driver.findElement(By.id("xxxx")).sendKeys("Second@123");
		
		a.sendKeys(Keys.ENTER).perform();
		
		driver.findElement(By.id("xxxx")).sendKeys("Second@123").sendKeys(Keys.ENTER);  // direclty write without action class
		
		// undo operation (CTRL+Z)
		driver.findElement(By.id("tag1")).sendKeys("Sathisha");
		Thread.sleep(2000);
		driver.findElement(By.id("tag1")).sendKeys("Sathisha").sendKeys(Keys.chord(Keys.CONTROL,"z")); // chord is used press the two keys
		
		//a. meanse action class is need to define
		
		//driver.quit();

	}

}
