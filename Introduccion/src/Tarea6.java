import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tarea6 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\eclipse-java-2020-03-R-win32-x86_64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		driver.findElement(By.id("checkBoxOption3")).click();
		Thread.sleep(1500L);
		String labelOption=driver.findElement(By.xpath("//label[@for='honda']")).getText();
		System.out.println(labelOption);
		driver.findElement(By.id("dropdown-class-example")).sendKeys(labelOption);
		Thread.sleep(1500L);
		driver.findElement(By.id("name")).sendKeys(labelOption);
		Thread.sleep(1500L);
		driver.findElement(By.id("alertbtn")).click();
		
		
	}

}
