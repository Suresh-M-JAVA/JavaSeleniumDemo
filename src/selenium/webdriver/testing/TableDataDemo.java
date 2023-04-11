package selenium.webdriver.testing;

import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TableDataDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:\\drivers\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://ksrtc.in/oprs-web/");
		
		
		driver.findElement(By.id("txtJourneyDate")).click();
		//driver.findElement(By.xpath("//a[contains(text(),'21')]")).click();
		
		List<WebElement> dates= driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td/a"));
		System.out.println(dates.size());
		
		for(WebElement d:dates) {
			 System.out.println(d.getText());
			if(d.getText().matches("28")) {
				d.click();
				break;
			}
		}
		
				
	}

}
