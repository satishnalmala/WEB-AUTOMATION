 package Testcases;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
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
import PagesRepository.DetailsJobPage;

public class Media {
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
	
	public void MediaTestCaseExistingPhoto() throws InterruptedException
	{
		CommonFunctions cf= new CommonFunctions(driver);
		cf.Login();
		DetailsJobPage djp=new DetailsJobPage(driver);
		//djp.searchJob();
		searchJob();
		Thread.sleep(2000);
		driver.findElement(djp.MediaTab).click();
		cf.myWait(5);
		Thread.sleep(2000);
		
		driver.findElement(djp.siteMap).click();
		Thread.sleep(2000);

		driver.findElement(djp.Add).click();
		Thread.sleep(2000);
		//driver.findElement(djp.dropPhoto).click();
		cf.myWait(2);
		driver.findElement(djp.ExistingPhoto).click();
		cf.myWait(2);
		driver.findElement(djp.ExistingPhotoSelectionImage).click();
		cf.myWait(2);
		driver.findElement(djp.ExistingPhotosave).click();
	
System.out.println("Media Testcase complete");
	}
	@Test
	public void MediaTestCaseNewPhoto() throws InterruptedException, AWTException
	{
		CommonFunctions cf= new CommonFunctions(driver);
		cf.Login();
		DetailsJobPage djp=new DetailsJobPage(driver);
		//djp.searchJob();
		searchJob();
		Thread.sleep(2000);
		driver.findElement(djp.MediaTab).click();
		cf.myWait(5);
		Thread.sleep(2000);
		
		driver.findElement(djp.siteMap).click();
		Thread.sleep(2000);

		driver.findElement(djp.Add).click();
		Thread.sleep(2000);
		driver.findElement(djp.dropPhoto).click();
		cf.myWait(2);
		
		 Robot rb = new Robot();
		 
		    // copying File path to Clipboard
		    StringSelection str = new StringSelection("C:\\Users\\DKI-Satish\\OneDrive - DKI Canada\\Desktop\\Photoupload.jpg");
		    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
		 
		     // press Contol+V for pasting
		     rb.keyPress(KeyEvent.VK_CONTROL);
		     rb.keyPress(KeyEvent.VK_V);
		 
		    // release Contol+V for pasting
		    rb.keyRelease(KeyEvent.VK_CONTROL);
		    rb.keyRelease(KeyEvent.VK_V);
		 
		    // for pressing and releasing Enter
		    rb.keyPress(KeyEvent.VK_ENTER);
		    rb.keyRelease(KeyEvent.VK_ENTER);
		    
		    Select objmanager =new Select(driver.findElement(By.id("JobList")));
			//objmanager.selectByVisibleText("Emergency");
		    objmanager.selectByIndex(0);
			cf.myWait(2);
			Select objmanager1 =new Select(driver.findElement(By.id("LevelList")));
			//objmanager1.selectByVisibleText("First Floor");
			objmanager1.selectByIndex(1);
			cf.myWait(2);
			Thread.sleep(2000);
			Select objmanager2 =new Select(driver.findElement(By.id("RoomList")));
			//objmanager2.selectByVisibleText("Living Room");
			objmanager2.selectByIndex(1);
			cf.myWait(2);
			driver.findElement(By.id("cbExternal")).click();
			driver.findElement(By.id("cbCOL")).click();
			driver.findElement(djp.NewPhotosave).click();
		    /*
		driver.findElement(djp.ExistingPhoto).click();
		cf.myWait(2);
		driver.findElement(djp.ExistingPhotoSelectionImage).click();
		cf.myWait(2);
		driver.findElement(djp.ExistingPhotosave).click();
		*/
	
System.out.println("Media Testcase complete");
	}
	public void searchJob() throws InterruptedException
	{
		CommonFunctions cf= new CommonFunctions(driver);
		driver.findElement(By.xpath("//input[@id='jobSearch']")).sendKeys("220");
		cf.myWait(2);cf.myWait(5);
		Thread.sleep(10000);
		driver.findElement(By.xpath("//input[@id='jobSearch']")).sendKeys("7DK");
		cf.myWait(2);cf.myWait(5);Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='jobSearch']")).sendKeys("008");
		cf.myWait(15);
		driver.findElement(By.xpath("//div[contains(text(),'Test Satish')]")).click();
		Thread.sleep(2000);
		cf.myWait(10);
		cf.myWait(2);
	}
@AfterTest	
public void cleanup()
{
	//driver.close();
	
}


}
