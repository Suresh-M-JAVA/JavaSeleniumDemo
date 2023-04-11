import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.Scanner;

public class AutotypingCopyPaste {

	public static void main(String[] args) throws InterruptedException, AWTException {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter msg: " );
		String msg = sc.nextLine();
		System.out.println("Enter count: " );
		int count = sc.nextInt();
		
		StringSelection ss = new StringSelection(msg);
		Clipboard cb = Toolkit.getDefaultToolkit().getSystemClipboard();
		cb.setContents(ss, null);
		
		Thread.sleep(3000);
		
		Robot rb = new Robot();
		for(int i=1;i<=count;i++)
		{
			rb.keyPress(KeyEvent.VK_CONTROL);
			rb.keyPress(KeyEvent.VK_V);
			
			rb.keyRelease(KeyEvent.VK_CONTROL);
			rb.keyRelease(KeyEvent.VK_V);
			
			rb.keyPress(KeyEvent.VK_ENTER);
			rb.keyRelease(KeyEvent.VK_ENTER);
			
			Thread.sleep(1000);
		}
	}
}
