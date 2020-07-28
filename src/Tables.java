import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tables {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\SATHISHA\\JavaSelenium\\QALearnSelenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://omayo.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	/*	
		  //List<WebElement> headings = driver.findElements(By.xpath("//table[@id='table1']//th")); // first row header
		   //List<WebElement> data = driver.findElements(By.xpath("//table[@id='table1']//td")); // all data
		 // List<WebElement> data = driver.findElements(By.xpath("//table[@id='table1']//tr[1]//td")); // first row
		 List<WebElement> data = driver.findElements(By.xpath("//table[@id='table1']//tr[2]//td[2]")); // singel data
		for (int i=0; i<data.size(); i++) {
			System.out.println(data.get(i).getText());
		}
		
		*/
		/*
		// to find praveen in table
		
		String givenname = "Praveen";
		List<WebElement> names = driver.findElements(By.xpath("//table[@id='table1']//td[1]"));
		
		int row=0;
		
		for (int i=0; i<names.size();i++) {
			if(names.get(i).getText().equals(givenname)) {
				row=i;
				
			}
			
		}
		
		String path = "//table[@id='table1']//tr["+(row+1)+"]//td[3]";
		System.out.println(driver.findElement(By.xpath(path)).getText());
		driver.quit(); 
		*/
		
		System.out.println(driver.findElements(By.xpath("//table[@id='table1']/tbody//tr")).size());  // find the rows
		System.out.println(driver.findElements(By.xpath("//table[@id='table1']/tbody//tr[1]//td")).size());  // find the coloums
	}

}
