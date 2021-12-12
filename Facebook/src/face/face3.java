package face;

import java.io.File;
import java.io.IOException;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class face3
{
	public static void main(String[] args) throws IOException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Uttam\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://hi-in.facebook.com");
		
		WebElement name = driver.findElement(By.xpath("//input[@type='text']"));
		name.sendKeys("purushottamekkaldevi@rediffmail.com");
		WebElement pass = driver.findElement(By.xpath("//input[@type='password']"));
		pass.sendKeys("Uttam@123");
		WebElement log = driver.findElement(By.xpath("//button[text()='लॉग इन करें']"));
		log.click();
		
		Random rd =new Random();
		for(int i =1; i<=2; i++)
		{
		File scr = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest =new File("D:\\screen shots\\photo "+i+" .jpg");
		FileHandler.copy(scr, dest);
		}
		
		
	}

}
