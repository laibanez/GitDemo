import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicsRediff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://book.spicejet.com/");
		//driver.findElement(By.cssSelector("a[title*='Sign in']")).click();
		//driver.findElement(By.id("login1")).sendKeys("pablito");
		//driver.findElement(By.id("password")).sendKeys("blasdahfduhfasdf");
		//driver.findElement(By.xpath("//input[contains(@name,'proceed')]")).click();
		
		driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_FamilyAndFriends")).click();
		
		
		
		/*
		driver.findElement(By.cssSelector("a[title*='Sign in']")).click();
		driver.findElement(By.xpath("//input[@id='login1']")).sendKeys("hello");
		driver.findElement(By.cssSelector("input#password")).sendKeys("goodbye");
		driver.findElement(By.xpath("//input[contains(@name,'proceed')]")).click();
		 */

	}


}
