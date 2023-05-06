package basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindAllUrls {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		List<WebElement> urls = driver.findElements(By.tagName("a"));
		System.out.println(urls.size());
		
		for(WebElement a: urls) {
			System.out.println(a.getText());
			System.out.println(a.getAttribute("title"));
			
		}
		
		
		
		driver.close();
		
	}
}
