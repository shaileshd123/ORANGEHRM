import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class Job {
 
	
		
		@Test
		public void jobs() throws Exception {

			System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\BCG1\\src\\test\\resources\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
				
			
			driver.manage().window().maximize();
			// login to orangehRM
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			
			driver.findElement(By.name("username")).sendKeys("Admin");
			driver.findElement(By.name("password")).sendKeys("admin123");
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			driver.findElement(By.xpath("//button[@type='submit']")).click();
			
			driver.findElement(By.xpath("//span[text()='My Info']")).click();
			Thread.sleep(2000);
			WebElement job = driver.findElement(By.xpath("//a[normalize-space()='Job']"));
			driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
			job.click();
			System.out.println("Clicked on Job");
			Thread.sleep(2000);
			WebElement slider = driver.findElement(By.xpath("//div[@class='oxd-switch-wrapper']"));
			driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
			slider.click();
			System.out.println("Clicked on button now its showing Contract Details");

	}
	}
	
	
  

