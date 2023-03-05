package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LambdaTest 
{
public WebDriver driver;
	
	@BeforeTest
	public void setup()
	{
		ChromeOptions p1=new ChromeOptions();
		p1.setHeadless(true);
		driver=new ChromeDriver(p1);
		driver.get("https://accounts.lambdatest.com/login");
	}
	 
	@AfterMethod
	   public void staticWait()
	    {
		try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
	}}
	
	@Test(priority=1)
    public void function1Test() 
      {
       driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("manisha.hatagini96@gmail.com");
       System.out.println("Email id Entering..");
      }
	
	@Test(priority=2)
    public void function2Test() 
      {
       driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Manisha123");
       System.out.println("Password Entering..");
      }
  
    @Test(priority=3)
     public void function3Test() 
       {
 	       driver.findElement(By.xpath("//button[@type='submit']")).click();
 	       System.out.println("login is Completed");
       }}