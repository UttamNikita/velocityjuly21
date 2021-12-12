package face;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class face11
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.gecko.driver","D:\\Nikita\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://en-gb.facebook.com");
		
	}

}
