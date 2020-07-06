import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumSecondPRg {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver","C:\\SATHISHA\\JavaSelenium\\QAFoxSeleniumTraining\\driver\\geckodriver.exe" );
		
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();	
		driver.get("http://omayo.blogspot.com/");
		//driver.get("http://tutorialsninja.com/demo/index.php?route=account/login");
		
		//String text = driver.getTitle();  // retrievew the title
		// String text1 = driver.getCurrentUrl();
		// driver.findElement(By.linkText("compendiumdev")).click();
		// System.out.println("Title of the text "+text1);
		// String text2 = driver.getCurrentUrl();
		// System.out.println("Title of the text "+text2);
		//driver.close(); // close the main window
		
		
		//driver.findElement(By.linkText("Open a popup window")).click();
		//driver.findElement(By.linkText("Blogger")).click();
		
		// gettext() or getattribute();
		//String trx = driver.findElement(By.id("textbox1")).getAttribute("value");
		//System.out.println("Text value of the element is: "+trx); //Selenium WebDriver
		
       // boolean trt = driver.findElement(By.id("but2")).isDisplayed();
       // boolean trt = driver.findElement(By.id("hbutton")).isDisplayed(); // to check out the hiddenbutton 
		//boolean trt = driver.findElement(By.id("but2")).isEnabled();
		//boolean trt = driver.findElement(By.id("but2")).isEnabled();  // disbled button
		
		//boolean selected = driver.findElement(By.id("checkbox1")).isSelected();
		//System.out.println("Text value of the element is: "+selected);   //true
        
	 // Navigation 
	   //driver.navigate().to("https://www.google.co.in/");
       //Thread.sleep(2000);
       // driver.navigate().back();
       // Thread.sleep(2000);
       // driver.navigate().forward();
       // Thread.sleep(2000);
       // driver.navigate().refresh();
       // Thread.sleep(2000);
       // driver.navigate().forward();
       // Thread.sleep(2000);
       // driver.navigate().refresh();
        
		
		// GetSourceCode
		//String sourcecode = driver.getPageSource();
		//System.out.println(sourcecode);
		
		//submit();
		//driver.findElement(By.id("input-email")).sendKeys("Sathisha");
		//Thread.sleep(2000);
		//driver.findElement(By.id("input-password")).sendKeys("1234");
		//Thread.sleep(2000);
        //driver.findElement(By.xpath("//input[@class='btn btn-primary']")).click();
        //driver.findElement(By.xpath("//input[@class='btn btn-primary']")).submit(); // we can use instead of click
        //Thread.sleep(2000);
        
		//String tagname = driver.findElement(By.id("input-email")).getTagName();
		//System.out.println(tagname);
        
		//String value = driver.findElement(By.id("home")).getCssValue("text-align");
        //System.out.println(value);
        
    	 //Dimension d = driver.findElement(By.id("but2")).getSize();
         //System.out.println("Hight of the button " +d.height);
         //System.out.println("width of the button " +d.width);
		
		//Point d = driver.findElement(By.id("but2")).getLocation();
		//System.out.println("X coordinate of the button " +d.x);
        //System.out.println("y coordinate of the button " +d.y);
		
		//driver.manage().window().fullscreen();
		//Thread.sleep(3000);
		
		//tagName with Constructor frame work of arraylist
		List<WebElement> elements = driver.findElements(By.tagName("a")); // multiple elements
		
		for(int i=0; i<elements.size(); i++) {
			
		if(elements.get(i).getText().length()>0) 
		System.out.println(elements.get(i).getText());
		}
		
		
		// for each loops
		
		for( WebElement j : elements) {
			
			if(j.getText().length()>0)
			System.out.println(j.getText());  // getText() to eleiminate the spaces in the output
		}
			
		driver.quit(); // close all the  window

	}

}
