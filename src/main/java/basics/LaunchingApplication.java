package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class LaunchingApplication {

	/*
	 * Facebook
	 * 1. Launch the browser
	 * 2. Enter URL
	 * 3. Enter username
	 * 4. Enter password
	 * 5. Click on Login button
	 * 6. Close
	 * 
	 */
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		//ChromeDriver driv = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement username = driver.findElement(By.id("email"));
		username.sendKeys("test@gmail.com");
		
		driver.findElement(By.id("pass")).sendKeys("testpassword");
		//driver.findElement(By.name("login")).click();
		driver.findElement(By.partialLinkText("Forgotten")).click();
		
		driver.close();
		
	}
}
