


package week2.day2;

	import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

	import io.github.bonigarcia.wdm.WebDriverManager;

	 public class Leadcontact{
		 public static void main(String[] args) throws InterruptedException {
			
		
	
			 
			WebDriverManager.chromedriver().setup();
			
			ChromeDriver driver= new ChromeDriver();
			
			driver.get("http://leaftaps.com/opentaps/control/main");
			driver.manage().window().maximize();
			
			driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
			driver.findElement(By.id("password")).sendKeys("crmsfa");
			driver.findElement(By.className("decorativeSubmit")).click();
			driver.findElement(By.linkText("CRM/SFA")).click();
			driver.findElement(By.linkText("Contacts")).click();
			
			driver.findElement(By.linkText("Find Contacts")).click();
			driver.findElement(By.xpath("(//label[text()='First name:'])[3]/following::input")).sendKeys("babu");
			driver.findElement(By.xpath("//button[text()='Find Contacts']")).click();
			Thread.sleep(5000);
			
			driver.findElement(By.xpath("(//span[@class='x-tab-strip-text '])[3]")).click();			
			driver.findElement(By.name("emailAddress")).sendKeys("babu@testleaf.com");
			
	
			
		 }
		 
		 
	 }		 
