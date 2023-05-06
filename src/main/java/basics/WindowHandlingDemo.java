package basics;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandlingDemo {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.seleniumframework.com/Practiceform/");
		System.out.println(driver.getTitle());
		// System.out.println(driver.getWindowHandle());
		String pwindowid = driver.getWindowHandle();
		System.out.println("Parent Window ID ==> "+pwindowid);
		driver.findElement(By.id("button1")).click();
		System.out.println(driver.getWindowHandles().size());
		
		Set<String> handles = driver.getWindowHandles();
		String cwindowid = null;
		
		for (String abc : handles) {
			if (!(abc.equals(pwindowid))) {
				cwindowid = abc;
			}
		}
				
		System.out.println("Parent Window ID ==> "+pwindowid);
		System.out.println("Parent Window ID ==> "+cwindowid);
		
		Iterator<String> it = handles.iterator();
		System.out.println(it.next());
		System.out.println(it.next());
		
		driver.switchTo().window(cwindowid);
		System.out.println(driver.getTitle());
		//driver.close(); this will close only the window pointed by the browser
		driver.quit();
		
		

	}
}
