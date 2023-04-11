package selenium.webdriver.testing;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadingProperties {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Properties p1 = new Properties();
		FileInputStream fis = new FileInputStream("F:\\stu.properties");
		p1.load(fis);
		
		System.out.println(p1.getProperty("name"));
		System.out.println(p1.getProperty("course"));
		System.out.println(p1.getProperty("time"));
		System.out.println(p1.getProperty("sub-course"));
		
	}
}
