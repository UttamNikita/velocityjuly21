package insta;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class insta1
{
	public static void main(String[] args) throws InterruptedException, IOException 
	{
		System.setProperty("webdriver.chrome.driver","D:\\Nikita\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com");
		
		Thread.sleep(5000);
		WebElement name = driver.findElement(By.xpath("//input[@aria-label='Phone number, username, or email']"));
		String s1 = name.getAttribute("aria-label");
		System.out.println(s1);
	boolean t1 =	s1.equals("Name");
	System.out.println(t1);
	if(t1==true)
	{
		System.out.println("page is pass");
	}
	else
	{
		System.out.println("page is not pass");
	}
	name.sendKeys("9422549123");
	
	
	WebElement y = driver.findElement(By.xpath("//button[@type='submit']"));
	boolean r1 = y.isEnabled();
	System.out.println(r1);
	if(r1==true)
	{
		System.out.println("button is pass");
	}
	else
	{
		System.out.println("button is not pass");
	}
	
	
	WebElement hid = driver.findElement(By.xpath("//input[@aria-label='Password']"));
	String p1 = hid.getAttribute("aria-label");
	System.out.println(p1);
boolean a1 =	p1.equals("Hidden");
System.out.println(a1);
if(a1==true)
{
	System.out.println("password is pass");
}
else
{
	System.out.println("password is not pass");
}
hid.sendKeys("Uttam@123");
	

WebElement x = driver.findElement(By.xpath("//button[@type='submit']"));
boolean l1 = x.isEnabled();
System.out.println(l1);
if(l1==true)
{
	System.out.println("button is pass");
}
else
{
	System.out.println("button is not pass");
}


WebElement log = driver.findElement(By.xpath("//div[text()='Log In']"));
String j1 = log.getText();
System.out.println(j1);
boolean f1 =	j1.equals("Logs");
System.out.println(f1);
if(f1==true)
{
System.out.println("logs is pass");
}
else
{
System.out.println("logs is not pass");
}
log.click();





WebElement log1 = driver.findElement(By.xpath("//a[@href='/direct/inbox/']"));
log1.click();





Random rd =new Random();
for(int i =1; i<=5; i++)
{
File scr = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
String timeStamp = new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss").format(new Date());
File dst = new File ("D:\\screen shots\\ "+ timeStamp + i +".jpg");
FileHandler.copy(scr, dst);
}


	

}
}
