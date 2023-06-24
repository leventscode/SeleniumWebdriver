package main;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegistrationFormAutomation {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/");
		
		// Scroll down.
		JavascriptExecutor jsx = (JavascriptExecutor) driver;
		jsx.executeScript("window.scrollBy(0,450)", "");
		
		// Click 'Elements Card' to go 'demoqa.com/elements'.
		List<WebElement> cardBody = driver.findElements(By.className("card-body"));

		cardBody.get(0).click();
		
		// Click on the 'Web Tables' link on the page.
		driver.findElement(By.cssSelector(".accordion > .element-group #item-3")).click();
		
		// Click the Add Button to add a new record to the table.
		driver.findElement(By.id("addNewRecordButton")).click();
		
		// Registration Form
		WebElement firstName = driver.findElement(By.id("firstName"));
		WebElement lastName = driver.findElement(By.id("lastName"));
		WebElement email = driver.findElement(By.id("userEmail"));
		WebElement age = driver.findElement(By.id("age"));
		WebElement salary = driver.findElement(By.id("salary"));
		WebElement department = driver.findElement(By.id("department"));
		
		firstName.sendKeys("FirstName Test");
		lastName.sendKeys("LastName Test");
		email.sendKeys("emailtest@testemail.com");
		age.sendKeys("23");
		salary.sendKeys("12000");
		department.sendKeys("Engineering");
		
		// Submit
		driver.findElement(By.id("submit")).click();

		Thread.sleep(5000);
		driver.quit();
	}
}



