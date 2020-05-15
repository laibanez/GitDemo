import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class testCase2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//selenium code-	
		
		//create driver object for chrome Browser
		
		//we will strictly implements methods of webDriver
		
		/*Class name=X
				
				X driver =new X();*/
	//invoke .exe file first
		System.setProperty("webdriver.gecko.driver", "D:\\geckodriver-v0.16.1-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://google.com.mx");
		
		System.out.println(driver.getTitle());

	}
	
}
