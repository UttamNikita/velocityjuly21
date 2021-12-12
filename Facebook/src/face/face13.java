package face;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class face13
{
	public static void main(String[] args) throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver","D:\\Nikita\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		 Thread.sleep(3000);
		WebElement name = driver.findElement(By.xpath("//input[@type='submit']"));
		Thread.sleep(5000);
		name.click();
		
		Thread.sleep(5000);
		Alert alt = driver.switchTo().alert();
		String data = alt.getText();
		System.out.println(data);
		//alt.dismiss();
		alt.accept();
	}

}
