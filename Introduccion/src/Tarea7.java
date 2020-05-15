import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Tarea7 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\eclipse-java-2020-03-R-win32-x86_64\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		WebDriverWait wait=new WebDriverWait(driver,15);
		driver.get("http://qaclickacademy.com/");
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.sumome-react-wysiwyg-popup-animation-group")));
		
		driver.findElement(By.xpath("//div[@class='sumome-react-wysiwyg-component sumome-react-wysiwyg-popup-button sumome-react-wysiwyg-button'][2]")).click();
		
		driver.findElement(By.xpath("//a[text()='Practice']")).click();
		
		WebElement tabla=driver.findElement(By.id("product"));
		
		int rowscount=driver.findElements(By.xpath("//table[@id='product']/tbody/tr")).size();
		
		System.out.println("Rows count: "+rowscount);
		
		int columncount=driver.findElements(By.xpath("//table[@id='product']/tbody/tr/th")).size();
		
		System.out.println("Columns count: "+columncount);
		
		System.out.println(driver.findElement(By.xpath("//table[@id='product']/tbody/tr[2]")).getText());
		
	}

}
