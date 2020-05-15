import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicsRediff2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\eclipse-java-2020-03-R-win32-x86_64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://book.spicejet.com/");
		//driver.findElement(By.cssSelector("a[title*='Sign in']")).click();
		//driver.findElement(By.id("login1")).sendKeys("pablito");
		//driver.findElement(By.id("password")).sendKeys("blasdahfduhfasdf");
		//driver.findElement(By.xpath("//input[contains(@name,'proceed')]")).click();
		driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_FamilyAndFriends")).click();
		System.out.println(driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_FamilyAndFriends")).isSelected());
		
		Thread.sleep(2000L);
		
		driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchVieworiginStation1_CTXT")).clear();
		driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchVieworiginStation1_CTXT")).sendKeys("MUM");
		driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchVieworiginStation1_CTXT")).sendKeys(Keys.ENTER);
	
		driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchViewdestinationStation1_CTXT")).clear();
		driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchViewdestinationStation1_CTXT")).sendKeys("BKK");
		driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchViewdestinationStation1_CTXT")).sendKeys(Keys.ENTER);
		
		driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_ButtonSubmit")).click();
		
		
		
		
		/*
		driver.findElement(By.cssSelector("a[title*='Sign in']")).click();
		driver.findElement(By.xpath("//input[@id='login1']")).sendKeys("hello");
		driver.findElement(By.cssSelector("input#password")).sendKeys("goodbye");
		driver.findElement(By.xpath("//input[contains(@name,'proceed')]")).click();
		 */

	}

}
