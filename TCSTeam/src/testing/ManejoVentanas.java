package testing;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ManejoVentanas {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C://DriversVarios//chromedriver_win32//chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.automationtesting.in/Windows.html");
		
		//driver.findElement(By.xpath("//button[@class=('btn btn-info')]")).click();
		
		driver.findElement(By.xpath("//a[@href=\"http://www.selenium.dev\"]/button")).click();
		
		Set<String> valorHandle = driver.getWindowHandles();
		
		Thread.sleep(3000);
		for(String handle:valorHandle) {
			
			System.out.println(handle);
			
			String title = driver.switchTo().window(handle).getTitle();
			
			System.out.println("Titulo de la ventana " + title);
			
			if(title.equals("Selenium")) {
				
				driver.findElement(By.xpath("//a[@href='/downloads']")).click();
				Thread.sleep(3000);
			}
			
		}
		
		
		driver.quit();

	}

}
