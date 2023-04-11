package selenium.webdriver.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AlertDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver_win32 (1)\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://ksrtc.in/oprs-web/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("corover-close-btn")).click();
		driver.findElement(By.xpath("//button[contains(text(),'Search for Bus')]")).click();
	//	driver.findElement(By.cssSelector("#txtJourneyDate")).click();
		
		String alert= driver.switchTo().alert().getText();
		System.out.println(alert);
		if(alert.matches("Please select start place.")) {
			driver.switchTo().alert().accept();
		}else {
			driver.switchTo().alert().dismiss();
		}
	}

}
