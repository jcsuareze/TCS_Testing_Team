package testing;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownYRadioBtn {

	public static void main(String[] args) throws InterruptedException {
		

		System.setProperty("webdriver.chrome.driver","C://Drivers//chromedriver_win32//chromedriver.exe" );
		
		WebDriver driver = new ChromeDriver();
		
	
		driver.get("https://fs2.formsite.com/meherpavan/form2/index.html?1537702596407");
		
		//input[@id="RESULT_TextField-1"]
		
		driver.manage().window().maximize();
		
		String title = driver.getTitle();
		String strURL = driver.getCurrentUrl();
		
		System.out.println("El titulo de la pagina es: "+ title);
		System.out.println("La URL de la pagina es:  "+ strURL);
		
		String codigoFte = driver.getPageSource();
		
		//System.out.println("El codigo fuente de la pagina es: "+ codigoFte);
		driver.findElement(By.xpath("//input[@id=\"RESULT_TextField-4\"]"));
		
		driver.findElement(By.xpath("//input[@id=\"RESULT_TextField-3\"]")).sendKeys("1234567890");
		
		driver.findElement(By.xpath("//input[@id=\"RESULT_TextField-4\"]")).sendKeys("Mexico");
		
		driver.findElement(By.xpath("//input[@id=\"RESULT_TextField-5\"]")).sendKeys("Gdl");
		
		driver.findElement(By.xpath("//input[@id=\"RESULT_TextField-6\"]")).sendKeys("amaury@user.com");
		
		WebElement checkbox = driver.findElement(By.xpath("//*[@id=\"q15\"]/table/tbody/tr[1]/td"));
		
		checkbox.click();
		
		
		Select dropdown = new Select(driver.findElement(By.xpath("//select[@id=\"RESULT_RadioButton-9\"]")));
		
		System.out.println(dropdown.getOptions().size());
		
		List<WebElement> opciones = dropdown.getOptions();
		
		for(WebElement elements:opciones) {
			
			System.out.println(elements.getText());
		}
		
		dropdown.selectByIndex(1);
		dropdown.selectByVisibleText("Evening");
		
	
		//input[@id='RESULT_RadioButton-7_0']
		WebElement radioBtnMale = driver.findElement(By.xpath("//*[@id=\"q26\"]/table/tbody/tr[1]/td"));
		
		System.out.println("Esta desplegado? "+ radioBtnMale.isDisplayed());
		System.out.println("Esta habilitado? "+ radioBtnMale.isEnabled());
		System.out.println("Esta seleccionado? "+ radioBtnMale.isSelected());
		radioBtnMale.click();
		Thread.sleep(3000); // mala practica 
		System.out.println("Esta seleccionado? "+ radioBtnMale.isSelected());
		
		
		driver.quit();
	}

}
