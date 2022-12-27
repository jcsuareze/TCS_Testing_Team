package testing;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Contarlinks {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C://DriversVarios//chromedriver_win32//chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://demo.guru99.com/selenium/newtours/index.php");

		driver.manage().window().maximize();
		
		System.out.println(driver.findElements(By.tagName("a")).size());  //Numero de links
		System.out.println(driver.findElements(By.tagName("a")));
		
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		for(WebElement l:links) {
			
			String nombreLink = l.getText();
			
			System.out.println("Links: " + nombreLink);
		}
		
		driver.quit();

	}

}
