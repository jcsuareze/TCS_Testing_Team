package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoFrames {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C://DriversVarios//chromedriver_win32//chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");

		driver.switchTo().frame("packageListFrame");

		driver.findElement(By.linkText("org.openqa.selenium")).click();

		driver.switchTo().defaultContent(); // Regresa el foco a la pagina principal si no, no encuentra el nuevo frame

		driver.switchTo().frame("packageFrame");

		driver.findElement(By.linkText("WebDriver")).click();

		driver.switchTo().defaultContent();

		driver.switchTo().frame("classFrame");
		
		driver.findElement(By.linkText("ChromeDriver")).click();

		driver.quit();
	}

}
