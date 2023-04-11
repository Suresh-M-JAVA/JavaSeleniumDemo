package selenium.webdriver.testing;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ScreenshotDemo {
	static WebDriver driver;
	public void screen1() throws IOException {
		File f1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File f2 = new File("src\\selenium\\webdriver\\testing\\img.png");
		FileUtils.copyFile(f1, f2);
	}
	
	public void screen2() throws IOException {
		Date d = new Date();
		DateFormat df= new SimpleDateFormat("dd-MM-yy hh-mm-ss");
		String time = df.format(d);
		File f1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File f2 = new File("src\\selenium\\webdriver\\testing\\" + time + ".png");
		FileUtils.copyFile(f1, f2);
	}
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:\\drivers\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		
		driver.get("https://www.google.com/");
		
//		File f1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		File f2 = new File("src\\selenium\\webdriver\\testing\\img.png");
//		FileUtils.copyFile(f1, f2);		
		
		ScreenshotDemo s= new ScreenshotDemo();
		//s.screen1();
		s.screen2();
		driver.quit();
	}

}
