package MavenDemoTest.MavenDemoTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class testclass {
public WebDriver driver;

	@Test
	public void displyy()
	{
		System.out.println("hellow all");
		System.setProperty("webdriver.chrome.driver", "E:\\Eclips\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com");
	}
	
	@Test
	public void print()
	{
		System.out.println("morinig");
	}
}
