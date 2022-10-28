package PagesRepository;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonFunctions {
WebDriver driver=null;

	public CommonFunctions(WebDriver driver)
	{
		this.driver=driver;
		}
	public void Login()
	{
		
		driver.findElement(By.xpath("//input[@id='UserName']")).sendKeys("Satish.Nalmala");
		// User name
		WebElement ele1 =driver.findElement(By.xpath("//input[@id='UserName']"));
		highLighterMethod(driver, ele1);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Tara0518"); // Password
		WebElement ele2 =driver.findElement(By.xpath("//span[@class='ladda-label']"));
		highLighterMethod(driver, ele2);
		
		driver.findElement(By.xpath("//span[@class='ladda-label']")).click(); // Click button
		
		//-------  Getting Input from user at runtime-----
		System.out.println("Enter Passcode in Console= ");
		Scanner scan1 =new Scanner(System.in);
		String Passcodeinput=scan1.nextLine();
		WebDriverWait wait=new WebDriverWait(driver, 20);
		//------------------------------
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		driver.findElement(By.xpath("//input[@id='AuthKey']")).sendKeys(Passcodeinput);
		driver.findElement(By.xpath("//span[@class='ladda-label']")).click();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS) ;
	}
	// Method to highlight object
			public void highLighterMethod(WebDriver driver, WebElement element){
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("arguments[0].setAttribute('style', 'border: 2px solid red;');", element);
				}
	public void myWait(int mytime) throws InterruptedException
	{
	driver.manage().timeouts().implicitlyWait(mytime,TimeUnit.SECONDS) ;
	Thread.sleep(2000);
	}
}
