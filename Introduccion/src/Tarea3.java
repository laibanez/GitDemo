import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Tarea3 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\eclipse-java-2020-03-R-win32-x86_64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		WebDriverWait wait=new WebDriverWait(driver,5);
		
		driver.get("http://www.itgeared.com/demo/1506-ajax-loading.html");
		
		driver.findElement(By.xpath("//*[text()='Click to load get data via Ajax!']")).click();
				
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("results")));
		
//		driver.findElement(By.id("results")).getText();
		
		System.out.println(driver.findElement(By.id("results")).getText());

	}

}
