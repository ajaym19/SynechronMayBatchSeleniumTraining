package basics;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CookiesDemo {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Set<Cookie> cookies = driver.manage().getCookies();
		for (Cookie abc : cookies) {
			System.out.println(abc.getName());
			System.out.println(abc.getPath());
			System.out.println(abc.getExpiry());
		}
		
		driver.manage().deleteAllCookies();
		
		driver.close();
	}
}
