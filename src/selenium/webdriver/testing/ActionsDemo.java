package selenium.webdriver.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class ActionsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:\\drivers\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://www.amazon.in/");
		Actions act = new Actions(driver);
		
		WebElement e1= driver.findElement(By.id("nav-link-accountList-nav-line-1"));
		WebElement e2= driver.findElement(By.xpath("//span[contains(text(),'Your Wish List')]"));
		WebElement sign = driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']"));
	//	act.moveToElement(e1).moveToElement(e2).doubleClick().build().perform();
	//	act.moveToElement(sign).doubleClick().build().perform();
	//	act.doubleClick(sign).build().perform();
		act.moveToElement(sign).contextClick().build().perform();  // Contextclick() for right click
	}

}
