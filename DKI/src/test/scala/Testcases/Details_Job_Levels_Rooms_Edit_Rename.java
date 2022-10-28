 package Testcases;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PagesRepository.CommonFunctions;

public class Details_Job_Levels_Rooms_Edit_Rename {
	WebDriver driver = null;
	//---------------------- Chrome Driver---------------------------
	@BeforeTest	
	public void setup()
		{
		
		//---------------------------- Chrome Driver----------
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\DKI-Satish\\eclipse-workspace\\DKI\\Drivers\\ChromeDriver\\chromedriver.exe");
			driver=new ChromeDriver();
			
			System.out.println("Chrome Driver started");
			
			driver.get("https://staging.dki.ca/Account/Login"); //url
			driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS) ;
			driver.manage().window().maximize();
			/*
			//---------------------------- Edge Driver----------
			System.setProperty("webdriver.edge.driver", "C:\\Users\\DKI-Satish\\eclipse-workspace\\DKI\\Drivers\\EdgeDriver\\msedgeDriver.exe");
			driver=new EdgeDriver();
			
			System.out.println("Edge Driver started");
			driver.get("https://staging.dki.ca/Account/Login"); //url
			driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS) ;
			driver.manage().window().maximize();
			*/
		}
	@Test
	public void Rename_Levels() throws InterruptedException, AWTException
	{
		CommonFunctions cf= new CommonFunctions(driver);
		cf.Login();
		driver.findElement(By.xpath("//input[@id='jobSearch']")).sendKeys("220");
		cf.myWait(2);cf.myWait(5);
		Thread.sleep(10000);
		driver.findElement(By.xpath("//input[@id='jobSearch']")).sendKeys("9DK");
		cf.myWait(2);cf.myWait(5);Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='jobSearch']")).sendKeys("014");
		cf.myWait(15);
		WebElement pressEnter=driver.findElement(By.xpath("//input[@id='jobSearch']"));
		pressEnter.sendKeys(Keys.DOWN);
		pressEnter.sendKeys(Keys.ENTER);
		//driver.findElebent(By.xpath("//div[contains(text(),'Test Satish')]")).click();
		Thread.sleep(2000);
		cf.myWait(10);
		cf.myWait(2);
		driver.findElement(By.xpath("//a[contains(text(),'Levels & Rooms')]")).click();
		cf.myWait(5);
Thread.sleep(2000);
//String mylev=driver.findElement(By.xpath("//li[2]//span[1]//span[2]")).getText();
//System.out.println(mylev);
Actions actions = new Actions(driver);
		actions.contextClick(driver.findElement(By.xpath("//li[3]//span[1]//span[2]"))).perform();
		cf.myWait(2);
		driver.findElement(By.xpath("//div[contains(text(),'Edit')]")).click();
		cf.myWait(2);
		cf.myWait(2);
		Thread.sleep(2000);
		
		//Rename 
		 Robot rb = new Robot();
		 
		    // copying File path to Clipboard
		    StringSelection str = new StringSelection("Level Renamed");
		    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
		 
		    rb.keyPress(KeyEvent.VK_CONTROL);
		     rb.keyPress(KeyEvent.VK_A);
		    
		     // press Contol+V for pasting
		     rb.keyPress(KeyEvent.VK_CONTROL);
		     rb.keyPress(KeyEvent.VK_V);
		 
		    // release Contol+V for pasting
		    rb.keyRelease(KeyEvent.VK_CONTROL);
		    rb.keyRelease(KeyEvent.VK_V);
		 
		    // for pressing and releasing Enter
		  //  rb.keyPress(KeyEvent.VK_ENTER);
		  //  rb.keyRelease(KeyEvent.VK_ENTER);
		    
		
					
		System.out.println("Code ended");
	}
	
	// ======================= Rooms Rename====
	@Test
	public void Rename_Rooms() throws InterruptedException, AWTException
	{
		CommonFunctions cf= new CommonFunctions(driver);
		cf.Login();
		driver.findElement(By.xpath("//input[@id='jobSearch']")).sendKeys("220");
		cf.myWait(2);cf.myWait(5);
		Thread.sleep(10000);
		driver.findElement(By.xpath("//input[@id='jobSearch']")).sendKeys("7DK");
		cf.myWait(2);cf.myWait(5);Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='jobSearch']")).sendKeys("008");
		cf.myWait(15);
		WebElement pressEnter=driver.findElement(By.xpath("//input[@id='jobSearch']"));
		pressEnter.sendKeys(Keys.DOWN);
		pressEnter.sendKeys(Keys.ENTER);
		//driver.findElebent(By.xpath("//div[contains(text(),'Test Satish')]")).click();
		Thread.sleep(2000);
		cf.myWait(10);
		cf.myWait(2);
		driver.findElement(By.xpath("//a[contains(text(),'Levels & Rooms')]")).click();
		cf.myWait(5);
Thread.sleep(2000);

driver.findElement(By.xpath("//body/div/div/div/div/div/div/div/div/div/ul/li[2]/span[1]/span[1]")).click();
Thread.sleep(2000);

//=======================//Rename first room======================================
Actions actions = new Actions(driver);
		actions.contextClick(driver.findElement(By.xpath("//li//li[1]//span[1]//span[2]"))).perform();
		cf.myWait(2);
		driver.findElement(By.xpath("//div[contains(text(),'Edit')]")).click();
		cf.myWait(2);
		cf.myWait(2);
		Thread.sleep(2000);
		
		//Rename 
		 Robot rb = new Robot();
		 
		    // copying File path to Clipboard
		    StringSelection str = new StringSelection("First Room Renamed");
		    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
		 
		    rb.keyPress(KeyEvent.VK_CONTROL);
		     rb.keyPress(KeyEvent.VK_A);
		    
		     // press Contol+V for pasting
		     rb.keyPress(KeyEvent.VK_CONTROL);
		     rb.keyPress(KeyEvent.VK_V);
		 
		    // release Contol+V for pasting
		    rb.keyRelease(KeyEvent.VK_CONTROL);
		    rb.keyRelease(KeyEvent.VK_V);
		 
//================== //Rename Second room======================================
		    Actions actions2 = new Actions(driver);
		    		actions2.contextClick(driver.findElement(By.xpath("//li//li[2]//span[1]//span[2]"))).perform();
		    		cf.myWait(2);
		    		driver.findElement(By.xpath("//div[contains(text(),'Edit')]")).click();
		    		cf.myWait(2);
		    		cf.myWait(2);
		    		Thread.sleep(2000);
		    		
		    		//Rename 
		    		 Robot rb2 = new Robot();
		    		 
		    		    // copying File path to Clipboard
		    		    StringSelection str2 = new StringSelection("Second Room Renamed");
		    		    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str2, null);
		    		 
		    		    rb2.keyPress(KeyEvent.VK_CONTROL);
		    		     rb2.keyPress(KeyEvent.VK_A);
		    		    
		    		     // press Contol+V for pasting
		    		     rb2.keyPress(KeyEvent.VK_CONTROL);
		    		     rb2.keyPress(KeyEvent.VK_V);
		    		 
		    		    // release Contol+V for pasting
		    		    rb2.keyRelease(KeyEvent.VK_CONTROL);
		    		    rb2.keyRelease(KeyEvent.VK_V);
		    		  //================== //Rename Third room======================================
		    		    Actions actions3 = new Actions(driver);
		    		    		actions3.contextClick(driver.findElement(By.xpath("//li//li[3]//span[1]//span[2]"))).perform();
		    		    		cf.myWait(2);
		    		    		driver.findElement(By.xpath("//div[contains(text(),'Edit')]")).click();
		    		    		cf.myWait(2);
		    		    		cf.myWait(2);
		    		    		Thread.sleep(2000);
		    		    		
		    		    		//Rename 
		    		    		 Robot rb3 = new Robot();
		    		    		 
		    		    		    // copying File path to Clipboard
		    		    		    StringSelection str3 = new StringSelection("Second Room Renamed");
		    		    		    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str3, null);
		    		    		 
		    		    		    rb3.keyPress(KeyEvent.VK_CONTROL);
		    		    		     rb3.keyPress(KeyEvent.VK_A);
		    		    		    
		    		    		     // press Contol+V for pasting
		    		    		     rb3.keyPress(KeyEvent.VK_CONTROL);
		    		    		     rb3.keyPress(KeyEvent.VK_V);
		    		    		 
		    		    		    // release Contol+V for pasting
		    		    		    rb3.keyRelease(KeyEvent.VK_CONTROL);
		    		    		    rb3.keyRelease(KeyEvent.VK_V);
		    		
					
		System.out.println("Code ended");
	}
	
@AfterTest	
public void cleanup()
{
	//driver.close();
	
}


}
