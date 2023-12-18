package project;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class flipkart {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://flipkart.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[@role='button']")).click();

		WebElement elec = driver.findElement(By.xpath("//span[text()='Electronics']"));
		Thread.sleep(1000);
		Actions act = new Actions(driver);
		act.moveToElement(elec).build().perform();
		Thread.sleep(1000);
		WebElement bt = driver.findElement(By.xpath("//a[text()='Bluetooth Headphones']"));
		bt.click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("one plus nord ce");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='OnePlus Nord CE 2 Lite 5G (Blue Tide, 128 GB)']")).click();
		Thread.sleep(1000);
		String str = "OnePlus Nord CE 2 Lite 5G (Blue Tide, 128 GB)  (6 GB RAM)";
		Thread.sleep(1000);
		 Set<String> sm=driver.getWindowHandles();
		 System.out.println(sm);
		 for(String sg:sm) {
			 driver.switchTo().window(sg);
		 }
		// WebElement st= driver.findElement(By.xpath("//div[text()='OnePlus Nord CE 2
		// Lite 5G (Blue Tide, 128 GB) (6 GB RAM)]"));
		Thread.sleep(1000);
		// Assert.assertEquals(str, st);
		// driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")).click();

	}

}
