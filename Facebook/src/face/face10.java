package face;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class face10
{
	
	public static void Screen ( WebDriver driver, String fileName) throws IOException
	{
		
		File scr = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//String timeStamp = new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss").format(new Date());
		File dst = new File ("D:\\screen shots\\ "+fileName+"");
		FileHandler.copy(scr, dst);
	}
	public static void main(String[] args) throws InterruptedException, IOException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Uttam\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://hi-in.facebook.com");
		face10.Screen(driver, "photo678.jpg");
		
		Thread.sleep(3000);
		WebElement name = driver.findElement(By.xpath("//a[text()='नया अकाउंट बनाएँ']"));
		name.click();
		face10.Screen(driver, "photo789.jpg");
		Thread.sleep(3000);
		face10.Screen(driver, "photo456.jpg");
		
		
		
	}

}
