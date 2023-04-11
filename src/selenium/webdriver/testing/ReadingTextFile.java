package selenium.webdriver.testing;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadingTextFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String fpath = "F:\\demo.txt"; 
		BufferedReader br = new BufferedReader(new FileReader(fpath));
		String startLine;
		
		while((startLine = br.readLine()) != null) {
			System.out.println(startLine);
		}
	}

}
