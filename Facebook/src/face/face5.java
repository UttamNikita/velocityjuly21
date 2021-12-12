package face;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class face5 
{
	public static void main(String[] args) throws InterruptedException 
	{

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Uttam\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://hi-in.facebook.com");
		
		Thread.sleep(3000);
		WebElement name = driver.findElement(By.xpath("//a[text()='नया अकाउंट बनाएँ']"));
		name.click();
		
		Thread.sleep(3000);
		WebElement day= driver.findElement(By.xpath("//select[@aria-label='दिन']"));
		Select k = new Select(day);
		//k.selectByIndex(16);
		//k.selectByValue("4");
		k.selectByVisibleText("9");
		
		
		Thread.sleep(3000);
		WebElement month= driver.findElement(By.xpath("//select[@aria-label='महीना']"));
		Select p = new Select(month);
		//p.selectByIndex(3);
		//p.selectByValue("5");
		p.selectByVisibleText("जून");
		
		Thread.sleep(3000);
		WebElement year= driver.findElement(By.xpath("//select[@aria-label='वर्ष']"));
		Select t = new Select(year);
		//t.selectByIndex(9);
		//t.selectByValue("2010");
		t.selectByVisibleText("2007");
		
		
		WebElement yy= driver.findElement(By.xpath("//select[@aria-label='अपने सर्वनाम का चयन करें']"));
		boolean g1 = yy.isDisplayed();
		System.out.println(g1);
		if(g1==true)
		{
			System.out.println("hidden is show");
		}
		else
		{
			System.out.println("hidden is not show");
		}
		
		
		WebElement xy= driver.findElement(By.xpath("(//input[@type='radio'])[3]"));
		boolean z1 = xy.isDisplayed();
		System.out.println(z1);
		if(z1==true)
		{
			System.out.println("Radio button is display");
		}
		else
		{
			System.out.println("Radio button is not display");
		}
		xy.click();
		
		

		WebElement zzz= driver.findElement(By.xpath("//select[@aria-label='अपने सर्वनाम का चयन करें']"));
		boolean c1 = zzz.isDisplayed();
		System.out.println(c1);
		if(c1==true)
		{
			System.out.println("hidden is show");
		}
		else
		{
			System.out.println("hidden is not show");
		}
		
		
		WebElement zr= driver.findElement(By.xpath("//select[@aria-label='अपने सर्वनाम का चयन करें']"));
		Select hy = new Select(zr);
		//hy.selectByIndex(2);
		//hy.selectByValue("6");
		hy.selectByVisibleText("पुरुष: \"उन्हें जन्मदिन की शुभकामनाएँ दें!\"");
		driver.close();
		
	}

}
