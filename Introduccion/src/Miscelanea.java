import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.google.common.io.Files;
import org.apache.commons.io.FileUtils;

public class Miscelanea {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "D:\\eclipse-java-2020-03-R-win32-x86_64\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();  // maximiza el navegador
		
		driver.get("http://google.com");

		driver.manage().deleteAllCookies(); //borra todas las coockies
		driver.manage().deleteCookieNamed("sessionKey"); // borra una coockie en especial
		
		File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//Files.copy(src, new File ("D://screenshot.png"));
		FileUtils.copyFile(src, new File ("D://screenshot.png"));
	}

}
