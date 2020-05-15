import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tarea8 {

	public static void main(String[] args) {
		//https://www.rahulshettyacademy.com/AutomationPractice/
		System.setProperty("webdriver.chrome.driver", "D:\\eclipse-java-2020-03-R-win32-x86_64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		driver.findElement(By.id("autocomplete")).sendKeys("lo");
		
		JavascriptExecutor js= (JavascriptExecutor)driver;
		String script= "return document.getElementById(\"autocomplete\").value;";
		String text=(String) js.executeScript(script);
		
		int i=0;
		
		while(!text.equalsIgnoreCase("Slovenia")) {
			i++;
			driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);
			text=(String) js.executeScript(script);
			System.out.println(text);
			
			if(i>15) {
				System.out.println("Element not found");
				break;
			}
			

		}
		
	}

}
