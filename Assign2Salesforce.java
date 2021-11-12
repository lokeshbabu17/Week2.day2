package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assign2Salesforce {
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(40));
		driver.findElement(By.name("UserFirstName")).sendKeys("lokesh");
		driver.findElement(By.name("UserLastName")).sendKeys("babu");
		driver.findElement(By.name("UserEmail")).sendKeys("lokeshbabug17@gmail.com");
		driver.findElement(By.name("UserTitle")).sendKeys("Developer");
		driver.findElement(By.name("CompanyName")).sendKeys("Explio");
		driver.findElement(By.name("CompanyEmployees")).sendKeys("15-100employees");
		driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("8825557385");
		driver.findElement(By.name("CompanyCountry")).sendKeys("India");
		
		driver.close();
		
		
		
	}

}
