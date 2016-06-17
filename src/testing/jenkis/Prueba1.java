package testing.jenkis;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class 	Prueba1 {

	@Test
	public static void principal() {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.youtube.com/");
		driver.manage().window().maximize();
		
	}

}
