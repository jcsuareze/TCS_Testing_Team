package com.waits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C://DriversVarios//chromedriver_win32//chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		WebDriverWait miEspera = new WebDriverWait(driver, Duration.ofSeconds(3));
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.guru99.com/selenium/newtours/index.php");
		
		WebElement userName = miEspera.until(ExpectedConditions.visibilityOfElementLocated(By.name("userName")));
		userName.sendKeys("Juancarlos");
		
		WebElement passwordTxt = miEspera.until(ExpectedConditions.visibilityOfElementLocated(By.name("password")));
		passwordTxt.sendKeys("miPassword");
		
		driver.quit();

	}

}
