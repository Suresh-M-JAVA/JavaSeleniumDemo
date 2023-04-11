package selenium.webdriver.testing;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver_win32 (1)\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[contains(text(),'Create new account')]")).click();
		Thread.sleep(3000);
		WebElement day = driver.findElement(By.id("day"));
		
		Select d = new Select(day);
		//d.selectByIndex(5);
		//d.selectByValue("20");
		d.selectByVisibleText("25");
		System.out.println(day.getAttribute("value"));
		
		List<WebElement> days = d.getOptions();
		System.out.println(days.size());
		
		for(int i=0; i< days.size(); i++) {
			String txt = days.get(i).getText();
			System.out.println(txt);
			days.get(i).click();
		}
	}

}
