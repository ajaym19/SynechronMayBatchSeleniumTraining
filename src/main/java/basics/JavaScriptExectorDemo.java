package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptExectorDemo {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		//scrolling by some pixels
		//js.executeScript("window.scrollBy(0, 450)");
		
		//scrolling to a specific element
		WebElement menu = driver.findElement(By.xpath("//span[text()='Best Sellers in Computers & Accessories']"));
	//	js.executeScript("arguments[0].scrollIntoView()", menu);
		
		//scrolling to the bottom of the page
		
		js.executeScript("window.scrollBy(0, document.body.scrollHeight)");
		
		//clicking on specific element
		WebElement link = driver.findElement(By.xpath("//a[text()='About Us']"));
		js.executeScript("arguments[0].click()", link);
		
		//input[@placeholder='Username']
		//button[@type='submit']
	}
}
