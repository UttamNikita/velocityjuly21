package face;

import java.io.File;
import java.io.IOException;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class face7 
{
	public static void main(String[] args) throws IOException, InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Uttam\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://hi-in.facebook.com");
		
		Thread.sleep(3000);
		WebElement name = driver.findElement(By.xpath("//a[text()='नया अकाउंट बनाएँ']"));
		name.click();
		//Thread.sleep(3000);
		
		Random rd =new Random();
		for(int i =31; i<=32; i++)
		{
		File scr = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String timeStamp = new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss").format(new Date());
		File dst = new File ("D:\\screen shots\\ "+ timeStamp + i +".jpg");
		FileHandler.copy(scr, dst);
		}
	}

}
