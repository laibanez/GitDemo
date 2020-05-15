import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//selenium code-	
		
		//create driver object for chrome Browser
		
		//we will strictly implements methods of webDriver
		
	//invoca el archivo .exe 
		System.setProperty("webdriver.chrome.driver", "D:\\eclipse-java-2020-03-R-win32-x86_64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();  // nuevo objeto de WebDriver
		//driver.get("http://google.com.mx");  //url que se va a revisar
		
		//System.out.println(driver.getTitle());  //valida si en titulo de la pag es correcto
		//System.out.println(driver.getCurrentUrl());  //valida si estas en la url correcta
		//System.out.println(driver.getPageSource());  //imprime la fuente 
		
		//driver.get("http://yahoo.com"); // nueva pag 
		//driver.navigate().back();  // se regresa en el navegador 
		
		//driver.close();  // cierra el navegador actual
		//driver.quit();  //cierra todos los navegadores de selenium
		
		driver.get("https://translate.google.com/?hl=es");
		driver.findElement(By.id("source")).sendKeys("this is my first code");  //escribe algo en el textbox indicado
		driver.findElement(By.className("jfk-button-img")).click();
		//driver.findElement(By.name("pass")).sendKeys("34151342341325"); //escribe en el textbox
		//driver.findElement(By.id("loginbutton")).click(); //indentifica el boton y da click
		//driver.findElement(By.linkText("¿Olvidaste tu cuenta?")).click();
		//driver.findElement(By.xpath("//*[@id=\"email\"]")).clear();
		//driver.findElement(By.cssSelector("#email")).clear();
	

	}

}
