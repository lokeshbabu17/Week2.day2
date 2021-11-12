package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assign1Facebook {

	 
	public static void main(String[] args) {
			WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver= new ChromeDriver();
		
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(40));
		
		driver.findElement(By.linkText("Create New Account")).click();
		driver.findElement(By.name("firstname")).sendKeys("lokesh");
		driver.findElement(By.name("lastname")).sendKeys("babu");
		driver.findElement(By.xpath("//div[text()='Mobile number or email address']"
				+ "/following::input")).sendKeys("8825557385");
		
		driver.findElement(By.id("password_step_input")).sendKeys("@Lokesh1706");
		driver.findElement(By.id("day")).sendKeys("17");
		driver.findElement(By.id("month")).sendKeys("JAN");
		driver.findElement(By.id("year")).sendKeys("1997");
		
		driver.findElement(By.xpath("//label[text()='Female']")).click();
		


		
	

}
	 
	 
}
