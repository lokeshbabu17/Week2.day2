package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assign3CreateContact {

	public static void main(String[] args) {

		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Create Contact")).click();
		driver.findElement(By.id("firstNameField")).sendKeys("lokesh");
		driver.findElement(By.id("lastNameField")).sendKeys("babu");
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("lokesh");
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("babu");
		driver.findElement(By.id("createContactForm_departmentName")).sendKeys("AutomationTesting");
		driver.findElement(By.id("createContactForm_description")).sendKeys("tester");
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("lokeshbabug17@gmail.com");
		driver.findElement(By.id("createContactForm_generalStateProvinceGeoId")).sendKeys("NewYork");
		driver.findElement(By.name("submitButton")).click();
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.name("description")).clear();
		driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("workingexperiens");
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		System.out.println("page Title is: " + driver.getTitle());
		

	}

}
