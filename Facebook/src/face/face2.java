package face;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class face2
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Uttam\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com");
		
		Thread.sleep(5000);
		
		WebElement first = driver.findElement(By.xpath("//input[@placeholder='Email address or phone number']"));
		String firstname = first.getAttribute("placeholder");
		System.out.println(firstname);
		boolean me = firstname.equals("Email address or phone number");
		System.out.println(me);
		if(me==true)
		{
			System.out.println("firstname is pass");
		}
		else
		{
			System.out.println("firstname is not pass");
		}
		first.sendKeys("purushottamekkaldevi@rediffmail.com");
		
		Thread.sleep(5000);
		
		WebElement last = driver.findElement(By.xpath("//input[@aria-label='Password']"));
		String lastname = last.getAttribute("aria-label");
		System.out.println(lastname);
		boolean sk = lastname.equals("Password");
		System.out.println(sk);
		if(sk==true)
		{
			System.out.println("password is pass");
		}
		else
		{
			System.out.println("password is not pass");
		}
		last.sendKeys("9422549123");
		
		WebElement log = driver.findElement(By.xpath("//button[contains(text(),'Log In')]"));
		String login = log.getText();
		System.out.println(login);
		boolean lk = login.equals("Log In");
		System.out.println(lk);
		if(lk==true)
		{
			System.out.println("login is pass");
		}
		else
		{
			System.out.println("login is not pass");
		}
		log.click();
		
		
		
	}

}
