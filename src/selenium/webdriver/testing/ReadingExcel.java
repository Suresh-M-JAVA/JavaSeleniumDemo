package selenium.webdriver.testing;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class ReadingExcel {

	public static void main(String[] args) throws BiffException, IOException, InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:\\drivers\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://www.facebook.com/");
		
		Workbook w= Workbook.getWorkbook(new File("F:\\SampleData.xls"));
		Sheet sh= w.getSheet(0);
		
		for(int i=0;i<sh.getRows();i++) {
			WebElement uname= driver.findElement(By.id("email"));
			WebElement pwd= driver.findElement(By.id("pass"));
			
			uname.sendKeys(sh.getCell(0, i).getContents());
			uname.sendKeys(sh.getCell(1, i).getContents());
			
			Thread.sleep(3000);
			uname.clear();
			pwd.clear();
		}
		
	}
}
