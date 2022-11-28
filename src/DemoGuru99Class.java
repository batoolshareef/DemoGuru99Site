import java.time.Duration;

import org.apache.commons.lang3.time.DurationFormatUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoGuru99Class {
	public static WebDriver driver;
	
	public static String url="https://demo.guru99.com/";
	public static String email="batoolalshareef@gmail.com";
	


	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		
		driver.findElement(By.name("emailid")).sendKeys(email);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.findElement(By.name("btnLogin")).click();		

	}

}
