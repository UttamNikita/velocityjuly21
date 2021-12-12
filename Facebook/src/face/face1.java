package face;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class face1 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver","D:\\Nikita\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://en-gb.facebook.com");
		
		Thread.sleep(5000);
		//WebElement username = driver.findElement(By.xpath("//input[@type='text']"));
		//username.sendKeys("mona");
		//WebElement pass = driver.findElement(By.xpath("//input[@type='password']"));
		//pass.sendKeys("789");
		//WebElement login = driver.findElement(By.xpath("//button[@value='1']"));
		//login.click();
		//Thread.sleep(5000);
		//WebElement loss = driver.findElement(By.xpath("(//button[@value='1'])[2]"));
		//loss.click();
		//Thread.sleep(5000);
		//WebElement forget = driver.findElement(By.xpath("(//a[text()='Forgotten password?'])[2]"));
		//forget.click();
		
		
		WebElement create = driver.findElement(By.xpath("//a[text()='Create New Account']"));
		String get = create.getText();
		System.out.println(get);
		boolean my = get.equals("Create New Account");
		System.out.println(my);
		if(my==true)
		{
			System.out.println("account is pass");
		}
		else
		{
			System.out.println("account is not pass");
		}
		create.click();
		
		Thread.sleep(5000);
		
		WebElement back = driver.findElement(By.xpath("//div[text()='Sign Up']"));
		String symbol = back.getText();
		System.out.println(symbol);
		boolean h = symbol.equals("Sign Up");
		System.out.println(h);
		if(h==true)
		{
			System.out.println("front page is pass");
		}
		else
		{
			System.out.println("front page is not pass");
		}
		
		
		WebElement front = driver.findElement(By.xpath("//div[@class='_52lr fsm fwn fcg']"));
		String s = front.getAttribute("class");
		System.out.println(s);
		boolean x = s.equals("It's quick and easy");
		System.out.println(x);
		if(x==true)
		{
			System.out.println("back page is pass");
		}
		else
		{
			System.out.println("back page is not pass");
		}
		
		
		
		
		Thread.sleep(5000);
		
		WebElement first = driver.findElement(By.xpath("//input[@aria-label='First name']"));
		String result = first.getAttribute("aria-label");
		System.out.println(result);
		boolean a = result.equals("First name");
		System.out.println(a);
		if(a==true)
		{
			System.out.println("test case is pass");
		}
		else
		{
			System.out.println("test case is fail");
		}
		first.sendKeys("sohrmo");
		
		
		WebElement last = driver.findElement(By.xpath("//input[@aria-label='Surname']"));
		String lastname = last.getAttribute("aria-label");
		System.out.println(lastname);
		boolean c =lastname.equals("Surname");
		System.out.println(c);
		if(c==true)
		{
			System.out.println("lastname is correct");
		}
		else
		{
			System.out.println("lastname is not correct");
		}
		last.sendKeys("khroma");
		
		
		
		WebElement mobi = driver.findElement(By.xpath("//input[@aria-label='Mobile number or email address']"));
		String mobile = mobi.getAttribute("aria-label");
		System.out.println(mobile);
		boolean d = mobile.equals("Mobile number or email address");
		System.out.println(d);
		if(d==true)
		{
			System.out.println("moblie test case is pass");
		}
		else
		{
			System.out.println("moblie test case is not pass");
		}
		Thread.sleep(5000);
		mobi.sendKeys("7878787878");
	
		
		
		WebElement newpass = driver.findElement(By.xpath("//input[@aria-label='New password']"));
		String pass = newpass.getAttribute("aria-label");
		System.out.println(pass);
		boolean k = pass.equals("New password");
		System.out.println(k);
		if(k==true)
		{
			System.out.println("new pass is correct");
		}
		else
		{
			System.out.println("new pass is incorrect");
		}
		newpass.sendKeys("rono");
		
		WebElement ele = driver.findElement(By.xpath("//div[contains(text(),'Date of birth')]"));
		String m = ele.getText();
		System.out.println(m);
		boolean w = m.equals("Date of birth");
		System.out.println(w);
		if(w==true)
		{
			System.out.println("date page is pass");
		}
		else
		{
			System.out.println("date page is not pass");
		}
		
		
		Thread.sleep(5000);
		//WebElement date = driver.findElement(By.xpath("//select[@aria-label='Day']"));
		//date.click();
		WebElement day = driver.findElement(By.xpath("//option[text()='13']"));
		day.click();
		
		//WebElement may = driver.findElement(By.xpath("//select[@aria-label='Month']"));
				//may.click();
				WebElement month = driver.findElement(By.xpath("//option[text()='May']"));
				month.click();
				
				
				//WebElement year = driver.findElement(By.xpath("//select[@aria-label='Year']"));
				//year.click();
				WebElement center = driver.findElement(By.xpath("//option[text()='1996']"));
				center.click();
		
				

				WebElement element = driver.findElement(By.xpath("(//div[contains(text(),'Gender')])[1]"));
				String j = element.getText();
				System.out.println(j);
				boolean p = j.equals("Gender");
				System.out.println(p);
				if(p==true)
				{
					System.out.println("sex page is pass");
				}
				else
				{
					System.out.println("sex page is not pass");
				}
				
				
		WebElement key = driver.findElement(By.xpath("//label[text()='Female']"));
		String sex = key.getText();
		System.out.println(sex);
		boolean rst = sex.equals("Female");
		System.out.println(rst);
		if(rst==true)
		{
			System.out.println("text box is pass");
		}
		else
		{
			System.out.println("text box is false");
		}
		
		
		WebElement radio = driver.findElement(By.xpath("(//input[@type='radio'])[1]"));
		boolean test = radio.isSelected();
		System.out.println(test);
		if(test==true)
		{
			System.out.println("test button is pass");
			
		}
		else
		{
			System.out.println("test button is not pass");
		}
		radio.click();
		
		
		WebElement button = driver.findElement(By.xpath("(//input[@type='radio'])[2]"));
		boolean male = button.isSelected();
		System.out.println(male);
		if(male==true)
		{
			System.out.println("sex is true");
		}
		else
		{
			System.out.println("sex is false");
		}
		
		
		WebElement keyword = driver.findElement(By.xpath("//label[text()='Male']"));
		String ke = keyword.getText();
		System.out.println(ke);
		boolean r = ke.equals("Male");
		System.out.println(r);
		if(r==true)
		{
			System.out.println("text box male is pass");
		}
		else
		{
			System.out.println("text box male is false");
		}
		
		
		WebElement word = driver.findElement(By.xpath("//label[text()='Custom']"));
		String kae = word.getText();
		System.out.println(kae);
		boolean t = kae.equals("Custom");
		System.out.println(t);
		if(t==true)
		{
			System.out.println("text box custom is pass");
		}
		else
		{
			System.out.println("text box custom is false");
		}
		
		
		WebElement button1 = driver.findElement(By.xpath("(//input[@type='radio'])[3]"));
		boolean mall = button.isSelected();
		System.out.println(mall);
		if(mall==true)
		{
			System.out.println("gender is true");
		}
		else
		{
			System.out.println("gender is false");
		}
		
		WebElement button2 = driver.findElement(By.xpath("//p[contains(text(),'By clicking Sign Up, you agree to our ')]"));
		String small = button2.getText();
		System.out.println(small);
		boolean n = small.equals("By clicking Sign Up, you agree to our ");
		System.out.println(n);
		if(n==true)
		{
			System.out.println("creadintial is true");
		}
		else
		{
			System.out.println("creadintial is false");
		}
		
		
		WebElement button3 = driver.findElement(By.xpath("//a[text()='Cookie Policy']"));
		String big = button3.getText();
		System.out.println(big);
		boolean o = big.equals("Cookie Policy");
		System.out.println(o);
		if(o==true)
		{
			System.out.println("policy is true");
		}
		else
		{
			System.out.println("policy is false");
		}
		
		
		WebElement button4 = driver.findElement(By.xpath("(//button[contains(text(),'Sign Up')])[1]"));
		String sign = button4.getText();
		System.out.println(sign);
		boolean aa = sign.equals("Sign Up");
		System.out.println(aa);
		if(aa==true)
		{
			System.out.println("sign up button is true");
		}
		else
		{
			System.out.println("sign up button is false");
		}
		button4.click();
		
	}

}
