package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssertionsDemo {

	@Test
	public void validateTitle() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		String acttitle =  driver.getTitle();
		String exptitle = "OrangeHRM India";
		Assert.assertEquals(acttitle,exptitle);
		Assert.assertTrue(false);
		driver.close();
	}
}
