package selenium.webdriver.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class KeysDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver_win32 (1)\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://www.facebook.com/");
		Actions act = new Actions(driver);
		
		WebElement uname = driver.findElement(By.id("email"));
		uname.sendKeys("abc@gmail.com");
		
		WebElement pwd = driver.findElement(By.id("pass"));
		WebElement log = driver.findElement(By.name("login"));
				
		act.click(uname).keyDown(Keys.CONTROL).sendKeys("a").sendKeys("c").
		keyUp(Keys.CONTROL).click(pwd).keyDown(Keys.CONTROL).sendKeys("v").keyDown(Keys.CONTROL).
		click(log).build().perform();
		
	
	}

}
