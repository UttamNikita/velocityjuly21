package face;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class face9 
{
	public static void main(String[] args) throws IOException 
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Uttam\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://hi-in.facebook.com");
		
		File scr =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest = new File("D:\\screen shots\\"+".jpg"	);
		FileHandler.copy(scr,dest);
	}

}
