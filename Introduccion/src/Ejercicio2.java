import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ejercicio2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\eclipse-java-2020-03-R-win32-x86_64\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.cleartrip.com/"); //URL in the browser
		
		Select sa=new Select(driver.findElement(By.id("Adults")));
		sa.selectByVisibleText("2");
		
		Select se=new Select (driver.findElement(By.id("Childrens"))); 
		se.selectByValue("1");
		
		driver.findElement(By.id("DepartDate")).click();
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
		
		driver.findElement(By.id("SearchBtn")).click();
		
		System.out.println(driver.findElement(By.id("homeErrorMessage")).getText());

	}

}
