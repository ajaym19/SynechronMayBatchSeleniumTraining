package basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectAssignment {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/en/contact-sales/");
		WebElement country = driver.findElement(By.name("Country"));
		//driver.findElements(By.xpath("//select[@name='Country']/option")); return you all country options
		System.out.println("Getting count using block search "+country.findElements(By.tagName("option")).size());
		
		
		
		Select obj = new Select(country);
		System.out.println(obj.getOptions().size());
		System.out.println(driver.findElements(By.tagName("option")).size());
		List<WebElement> opt = driver.findElements(By.tagName("option"));
		for (WebElement abc : opt) {
			System.out.println(abc.getText());
		}
		
		driver.close();
	}
}
