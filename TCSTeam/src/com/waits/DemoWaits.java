package com.waits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoWaits {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C://DriversVarios//chromedriver_win32//chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		
		//El implicit wait dura mientras el driver este activo 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
		driver.get("https://demo.guru99.com/selenium/newtours/index.php");
		
		driver.manage().window().maximize();
		
		//Thread.sleep(3000); Mala practica
		driver.findElement(By.name("userName")).sendKeys("JuanCarlos");
		
		
	
		driver.findElement(By.name("password")).sendKeys("myPassword");
		
		driver.quit();
		

	}

}
