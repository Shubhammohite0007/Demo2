package project;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;

public class screenshot {

	WebDriver driver = null;

	public void ss(ITestResult result) {
		if (ITestResult.FAILURE == result.getStatus()) {

			TakesScreenshot ts = (TakesScreenshot) driver;

			File src = ts.getScreenshotAs(OutputType.FILE);

			FileUtils.copyFile(src, new File("./screenshot/" + result.getName() + ".png"));

		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
