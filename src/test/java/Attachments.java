import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class Attachments {
	@Test
	public void AddAttach() throws Exception {
		
		
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
		
		WebElement immi=driver.findElement(By.xpath("(//div[@class=\"orangehrm-tabs-wrapper\"])[5]"));
		immi.click();
		System.out.println("Clicked on Immigration");
		WebElement Addattach = driver.findElement(By.xpath("(//button[@class=\"oxd-button oxd-button--medium oxd-button--text\"])[2]"));
		Addattach.click();
		System.out.println("Clicked on Add Attachemnts");
		WebElement Browse = driver.findElement(By.xpath("(//input[@type='file'])[1]"));
		Browse.sendKeys("C:\\abc");
		
		WebElement comments = driver.findElement(By.xpath("//textarea[@placeholder='Type comment here']"));
		comments.click();
		comments.sendKeys("File Uploaded");
		System.out.println("Box");
		WebElement save = driver.findElement(By.xpath("//button[normalize-space()='Save']"));
		save.click();
		System.out.println("Attachment is Saved");

		
		
}

		
	
}
	
 

