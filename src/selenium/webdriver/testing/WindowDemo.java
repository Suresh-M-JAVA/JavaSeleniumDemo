package selenium.webdriver.testing;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WindowDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver_win32 (1)\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		
		String mainId= driver.getWindowHandle();
		System.out.println(mainId);
		
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		driver.findElement(By.xpath("//a[@id='privacy-link']")).click();
		
		Set<String> wins= driver.getWindowHandles();
		System.out.println(wins.size());
		
		for(String w:wins) {
			if(w.matches(mainId)){
				driver.switchTo().window(w);
				System.out.println("ParentWin" + driver.getTitle());
			}else {
				driver.switchTo().window(w);
				System.out.println("Child url" + driver.getCurrentUrl() );
			}
		}
	}

}
