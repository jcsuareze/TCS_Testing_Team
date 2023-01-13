package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesAnidados {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C://DriversVarios//chromedriver_win32//chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.automationtesting.in/Frames.html");
		
		
		driver.findElement(By.xpath("//a[@href='#Multiple']")).click();
		
		WebElement frameExt = driver.findElement(By.xpath("//*[@id=\"Multiple\"]/iframe"));
		
		driver.switchTo().frame(frameExt);
		
		WebElement frameInt = driver.findElement(By.xpath("//div[@class='iframe-container']/iframe"));
		
		driver.switchTo().frame(frameInt);
		
		driver.findElement(By.cssSelector("input")).sendKeys("Testing");
		
		Thread.sleep(3000);
		driver.quit();
		
	}

}
