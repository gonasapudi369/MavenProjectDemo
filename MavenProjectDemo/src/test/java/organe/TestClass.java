package organe;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestClass {
	
	WebDriver driver;
	
	@BeforeClass
	public void LaunchApp() {
		WebDriverManager.chromiumdriver().setup();
		driver =new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
	}
	@Test
	public void operation() {
		driver.findElement(By.name("q")).sendKeys("vamsikrishnagonasapudi",Keys.ENTER);
		
}

	@AfterClass
	public void tearDown() throws InterruptedException 
	{
		Thread.sleep(3000);
		driver.close();
	}

}
