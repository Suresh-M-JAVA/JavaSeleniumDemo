package selenium.webdriver.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:\\drivers\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://jqueryui.com/droppable/");
		Actions act = new Actions(driver);

		WebElement fe = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(fe);
		
		WebElement e1 = driver.findElement(By.id("draggable"));
		WebElement e2 = driver.findElement(By.id("droppable"));
		
		// act.dragAndDrop(e1, e2).perform();
			act.dragAndDropBy(e1, 90, 30).build().perform();
		if(e2.getText().matches("Dropped!")) {
			System.out.println("Sucess");
		}else {
			System.out.println("failed");
		}
	}

}
