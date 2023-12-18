package project;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowhandle {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/browser-windows");   
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[@id='windowButton']")).click();
		Thread.sleep(1000);
		Set<String> str=driver.getWindowHandles();
		Thread.sleep(1000);
		System.out.println(str.size());
		
		Iterator<String> s=str.iterator();
		String wind1=s.next();
		String wind2=s.next();
		
		driver.switchTo().window(wind2);
		
		System.out.println("sst");
		
		driver.close();

	}

}
