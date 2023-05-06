package basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsDemo {
	
	int id;
	static int a;

	public static void main(String[] args) {
		//scrolling();
		//hover();
		keyboardEvents();
	}
	
	public static void scrolling() {
		System.out.println(Math.PI);
		System.out.println(a);
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Actions act = new Actions(driver);
		driver.manage().window().maximize();
		//act.moveByOffset(0, 200).perform();
		
		WebElement menu = driver.findElement(By.xpath("//span[text()='Best Sellers in Computers & Accessories']"));
		act.moveToElement(menu).perform();
	}
	
	public static void hover() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.myntra.com/");
		WebElement kidsmenu = driver.findElement(By.xpath("//a[text()='Kids']"));
		Actions act = new Actions(driver);
		act.moveToElement(kidsmenu).perform();
	}
	
	public static void keyboardEvents() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		WebElement username = driver.findElement(By.name("username"));
		//driver.findElement(By.name("username")).sendKeys("Hello");
		Actions act = new Actions(driver);
		act.moveToElement(username)
		.click(username).keyDown(Keys.SHIFT).sendKeys("admin").keyUp(Keys.SHIFT).perform();
	}
	
	public static void dragAndDrop() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.get("https://jqueryui.com/droppable/");
		WebElement source = driver.findElement(By.id(null));
		WebElement target = driver.findElement(By.id(null));
		Actions act = new Actions(driver);
		act.dragAndDrop(source, target).perform();
		
		
	}
	
	
	
	
	
	
	
	
	
}
