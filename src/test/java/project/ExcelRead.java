package project;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExcelRead {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
            File src=new File("");
           FileInputStream fis=new FileInputStream(src);
           XSSFWorkbook wb=new XSSFWorkbook(fis);
           XSSFSheet ws=wb.getSheet("");
           
           ws.getRow(1).getCell(1).getStringCellValue();
           
	}

}
