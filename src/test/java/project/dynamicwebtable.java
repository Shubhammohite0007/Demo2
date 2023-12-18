package project;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dynamicwebtable {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\driver\\\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://money.rediff.com/gainers");
		driver.manage().window().maximize();

		// driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(2000);
		List<WebElement> list = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td/a"));
		Thread.sleep(2000);

		System.out.println(list.size());

		String str = "Quest Capital Market";

		for (int i = 0; i <= list.size(); i++) {
			if (list.get(i).getText().equalsIgnoreCase(str)) {
				list.get(i).click();
			}
		}

	}

}
