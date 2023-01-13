package com.utils;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory {

	private static Map<String, WebDriver> drivers = new HashMap<String, WebDriver>();

	public static WebDriver getBrowser(String nombreBrowser) {

		WebDriver driver = null;

		switch (nombreBrowser) {
		case "Chrome":

			driver = drivers.get("Chrome");

			if (driver == null) {

				System.setProperty("webdriver.chrome.driver",
						"C://DriversVarios//chromedriver_win32//chromedriver.exe");

				driver = new ChromeDriver();

				drivers.put("Chrome", driver);
				
				System.out.println("Usando Chrome");
			} // end of if

			break;

		case "Firefox":

			driver = drivers.get("Firefox");

			if (driver == null) {

				System.setProperty("webdriver.chrome.driver", "C://DriversVarios//chromedriver_win32//geckodriver.exe");

				driver = new FirefoxDriver();

				drivers.put("Firefox", driver);
				
				System.out.println("Usando firefox");
			} // end of if

			break;
			
		case "Edge":

			driver = drivers.get("Edge");

			if (driver == null) {

				System.setProperty("webdriver.chrome.driver", "C://DriversVarios//chromedriver_win32//edgeDriver.exe");// cambiar nombew

				driver = new EdgeDriver();

				drivers.put("EdgeDriver", driver);
				
				System.out.println("Usando edge");
			} // end of if

			break;

		}// end of switch

		return driver;

	}// end of getBrowser Method
	
	
	public static void cerrarDriver() {
		
		for(String key :drivers.keySet() ) {
			
			drivers.get(key).close();
			drivers.get(key).quit();
			
		}
		
	}

}
