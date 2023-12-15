package project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class url {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Shubham");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class='_97w5']")).click();  //a[@class='_97w5
		
		WebElement month=driver.findElement(By.xpath("//select[@id='month']"));
		Select sc=new Select(month);
		sc.selectByIndex(3);

	}

}
