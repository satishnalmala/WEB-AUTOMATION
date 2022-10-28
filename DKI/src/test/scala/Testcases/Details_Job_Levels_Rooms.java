 package Testcases;

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

public class Details_Job_Levels_Rooms {
	WebDriver driver = null;
	//---------------------- Chrome Driver---------------------------
	@BeforeTest	
	public void setup()
		{
		/*
		//---------------------------- Chrome Driver----------
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\DKI-Satish\\eclipse-workspace\\DKI\\Drivers\\ChromeDriver\\chromedriver.exe");
			driver=new ChromeDriver();
			
			System.out.println("Chrome Driver started");
			
			driver.get("https://staging.dki.ca/Account/Login"); //url
			driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS) ;
			driver.manage().window().maximize();
			*/
			//---------------------------- Edge Driver----------
			System.setProperty("webdriver.edge.driver", "C:\\Users\\DKI-Satish\\eclipse-workspace\\DKI\\Drivers\\EdgeDriver\\msedgeDriver.exe");
			driver=new EdgeDriver();
			
			System.out.println("Edge Driver started");
			driver.get("https://staging.dki.ca/Account/Login"); //url
			driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS) ;
			driver.manage().window().maximize();
			
		}
	@Test
	public void Testcase3_LevelsRooms() throws InterruptedException
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
		driver.findElement(By.xpath("//div[contains(text(),'Test Satish')]")).click();
		Thread.sleep(2000);
		cf.myWait(10);
		cf.myWait(2);
		driver.findElement(By.xpath("//a[contains(text(),'Levels & Rooms')]")).click();
		cf.myWait(5);
		driver.findElement(By.xpath("//a[@id='btnAddLevel']")).click();
		cf.myWait(2);
		driver.findElement(By.xpath("//a[@id='btnAddLevel']")).click();
		cf.myWait(2);
		driver.findElement(By.xpath("//a[@id='btnAddLevel']")).click();
		cf.myWait(2);
		cf.myWait(2);
	//By folder1=By.xpath("//div[@id='ActiveSection']//li[2]");
			//--Right Click--
			
		Actions actions = new Actions(driver);
		WebElement newlevel1 = driver.findElement(By.xpath("//div[@id='ActiveSection']//li[2]"));
		WebElement newlevel2 = driver.findElement(By.xpath("//div[@id='ActiveSection']//li[3]"));
		WebElement newlevel3 = driver.findElement(By.xpath("//div[@id='ActiveSection']//li[4]"));
		//--- create room in first level---
		actions.contextClick(newlevel1).perform();
		cf.myWait(2);
		driver.findElement(By.xpath("//div[contains(text(),'New Room')]")).click();
		cf.myWait(2);
		Thread.sleep(1000);
		//--- second room under level 1
		driver.findElement(By.xpath("//li[2]//span[1]//span[2]")).click();
		
		Thread.sleep(2000);
		
		actions.contextClick(driver.findElement(By.xpath("//li[2]//span[1]//span[2]"))).perform();
		cf.myWait(2);
		driver.findElement(By.xpath("//div[contains(text(),'New Room')]")).click();
		cf.myWait(2);
		//--- third room under level 1
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[2]//span[1]//span[2]")).click();
		
		Thread.sleep(1000);
		actions.contextClick(driver.findElement(By.xpath("//li[2]//span[1]//span[2]"))).perform();
		cf.myWait(2);
		driver.findElement(By.xpath("//div[contains(text(),'New Room')]")).click();
		cf.myWait(2);
		
		
		//--- create room in 2nd level---
		actions.contextClick(newlevel2).perform();
		cf.myWait(2);
		driver.findElement(By.xpath("//div[contains(text(),'New Room')]")).click();
		cf.myWait(2);
		
		//--- second room under level 2
		Thread.sleep(1000);
				driver.findElement(By.xpath("//li[3]//span[1]//span[contains(text(),'New Level')]")).click();
				
				Thread.sleep(1000);
				
				actions.contextClick(driver.findElement(By.xpath("//li[3]//span[1]//span[contains(text(),'New Level')]"))).perform();
				cf.myWait(2);
				driver.findElement(By.xpath("//div[contains(text(),'New Room')]")).click();
				cf.myWait(2);
				//--- third room under level 2
				Thread.sleep(1000);
				driver.findElement(By.xpath("//li[3]//span[1]//span[contains(text(),'New Level')]")).click();
				
				Thread.sleep(1000);
				actions.contextClick(driver.findElement(By.xpath("//li[3]//span[1]//span[contains(text(),'New Level')]"))).perform();
				cf.myWait(2);
				driver.findElement(By.xpath("//div[contains(text(),'New Room')]")).click();
				cf.myWait(2);
		
		
		
		//--- create room in 3rd level---
		actions.contextClick(newlevel3).perform();
		cf.myWait(2);
		driver.findElement(By.xpath("//div[contains(text(),'New Room')]")).click();
		//--- second room under level 2
				Thread.sleep(1000);
						driver.findElement(By.xpath("//li[4]//span[1]//span[contains(text(),'New Level')]")).click();
						
						Thread.sleep(1000);
						actions.contextClick(driver.findElement(By.xpath("//li[4]//span[1]//span[contains(text(),'New Level')]"))).perform();
						cf.myWait(2);
						driver.findElement(By.xpath("//div[contains(text(),'New Room')]")).click();
						cf.myWait(2);
						//--- third room under level 2
						Thread.sleep(1000);
						driver.findElement(By.xpath("//li[4]//span[1]//span[contains(text(),'New Level')]")).click();
						Thread.sleep(1000);
						actions.contextClick(driver.findElement(By.xpath("//li[4]//span[1]//span[contains(text(),'New Level')]"))).perform();
						cf.myWait(2);
						driver.findElement(By.xpath("//div[contains(text(),'New Room')]")).click();
						cf.myWait(2);
		
					
		System.out.println("Details job TC Successfully");
	}
@AfterTest	
public void cleanup()
{
	//driver.close();
	
}


}
