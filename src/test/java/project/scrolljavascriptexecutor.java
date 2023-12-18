package project;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrolljavascriptexecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();

		JavascriptExecutor jsc = (JavascriptExecutor) driver;
		jsc.executeScript("document.getElementById('email').value='shubham'");
		jsc.executeScript("document.getElementById('pass').value='mohite'");
		jsc.executeScript("window.scrollBy(0,400)");

	}

}
