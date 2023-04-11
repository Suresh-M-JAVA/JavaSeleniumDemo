package selenium.webdriver.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class CoordinatesDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:\\drivers\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://www.google.com/");
		Actions act = new Actions(driver);
		
		WebElement img = driver.findElement(By.className("lnXdpd"));
		
		int x = img.getLocation().getX();
		int y = img.getLocation().getY();
				
		// act.moveToElement(img, x, y).contextClick().build().perform();
		act.moveToElement(img, 20, 30).contextClick().build().perform();
	}

}
