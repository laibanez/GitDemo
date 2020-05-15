import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class testCase3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//selenium code-	
		
		//create driver object for chrome Browser
		
		//we will strictly implements methods of webDriver
		
		/*Class name=X
				
				X driver =new X();*/
	//invoke .exe file first
		System.setProperty("webdriver.ie.driver", "D:\\eclipse-java-2020-03-R-win32-x86_64\\MicrosoftWebDriver.exe");
		WebDriver driver=new InternetExplorerDriver();
		driver.get("http://google.com.mx");
		
		System.out.println(driver.getTitle());

	}
	
}