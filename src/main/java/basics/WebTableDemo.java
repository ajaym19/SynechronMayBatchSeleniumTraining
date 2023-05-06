package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTableDemo {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://chercher.tech/practice/table");
		System.out.println("Table Count ==> " + driver.findElements(By.id("webtable")).size());
		System.out.println("Row Count ==> " + driver.findElements(By.tagName("tr")).size());
		System.out.println("Col Count ==> " + driver.findElements(By.tagName("th")).size());
		driver.close();

	}
}
