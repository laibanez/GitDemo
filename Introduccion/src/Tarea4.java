import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tarea4 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\eclipse-java-2020-03-R-win32-x86_64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		
		driver.findElement(By.xpath("//a[@href='/windows']")).click();
		driver.findElement(By.xpath("//a[@href='/windows/new']")).click();
		Set<String> ids=driver.getWindowHandles();
		Iterator<String> it=ids.iterator();
		String openWindow=it.next();
		String newWindow=it.next();
		driver.switchTo().window(newWindow);
		System.out.println(driver.findElement(By.cssSelector("div.example")).getText());
		driver.switchTo().window(openWindow);
		System.out.println(driver.findElement(By.xpath("//div[@class='example']/h3")).getText());
		

	}

}
