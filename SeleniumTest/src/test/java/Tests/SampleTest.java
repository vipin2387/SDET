package Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SampleTest {

	@Test
	public void test() throws InterruptedException{
		
		System.out.println("Launching sample Test");
		System.setProperty("webdriver.chrome.driver", "./src/Resources/Executables/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://google.com");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.quit();	
		System.out.println("Ending sample Test");
	}
	
}
