package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FramesDemo {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/tinymce");
		WebElement frame = driver.findElement(By.xpath("//iframe[@id='mce_0_ifr']"));
		//driver.switchTo().frame("mce_0_ifr");
		driver.switchTo().frame(frame);
		driver.findElement(By.id("tinymce")).sendKeys("AJay");
		
	}
}
