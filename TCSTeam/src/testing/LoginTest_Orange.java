package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



//1) Abrir el web browser
//2) Abrir la URL
//3) Interactuar

public class LoginTest_Orange {
	
	public static void main(String [] args) throws InterruptedException {
		
		String title = "OrangeHRM";
		
		//1) Abrir el web browser
		System.setProperty("webdriver.chrome.driver","C://DriversVarios//chromedriver_win32//chromedriver.exe" );
		
		WebDriver driver = new ChromeDriver();
		
		//2)Abrir la URL
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		//3) Interactuar
		
		/*WebElement userNameTxt = driver.findElement(By.name("username"));
		userNameTxt.sendKeys("Admin");*/
		
				
		driver.findElement(By.name("username")).sendKeys("Admin");  // Interactua con el webElement y envia texto
		
		driver.findElement(By.name("password")).sendKeys("admin123");	
		
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		String getPageTitle = driver.getTitle();// Captura el titulo de la pagina
		
		
		if(getPageTitle.equals(title)) {
			
			System.out.println("Test pasa");
		}else
		{
			System.out.println("Test Falla");
		}
		
		
		//driver.close();   Cierra el navegador
		driver.quit();    //Cierra sesion
		
		
		
		
		
		
	}

}
