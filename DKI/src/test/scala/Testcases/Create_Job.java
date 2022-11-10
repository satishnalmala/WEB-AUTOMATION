package Testcases;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PagesRepository.CommonFunctions;

public class Create_Job {
	WebDriver driver = null;
	//---------------------- Chrome Driver---------------------------
	@BeforeTest	
	public void setup()
		{
		
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\DKI-Satish\\eclipse-workspace\\DKI\\Drivers\\ChromeDriver\\chromedriver.exe");
			driver=new ChromeDriver();
			
			//System.out.println("Chrome Driver started");
			driver.get("https://staging.dki.ca/Account/Login"); //url
			driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS) ;
			driver.manage().window().maximize();
			//reccurring
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
	public void Testcase1_CreateJob() throws InterruptedException
	{
		CommonFunctions cf= new CommonFunctions(driver);
		cf.Login();
		cf.myWait(15);
		
		WebElement ele1 =driver.findElement(By.xpath("//body/div/nav[@class='navbar-side']/div[@class='navbar-collapse sidebar-collapse collapse']/ul[contains(@class,'nav navbar-nav side-nav')]/li[4]/a[1]"));
		cf.highLighterMethod(driver, ele1);
		driver.findElement(By.xpath("//body/div/nav[@class='navbar-side']/div[@class='navbar-collapse sidebar-collapse collapse']/ul[contains(@class,'nav navbar-nav side-nav')]/li[4]/a[1]")).click();
		WebElement ele2 =driver.findElement(By.xpath("//input[@placeholder='(eg. John Smith)']"));
		cf.highLighterMethod(driver, ele2);
		
		driver.findElement(By.xpath("//input[@placeholder='(eg. John Smith)']")).sendKeys("Test Satish");
		WebElement ele3 =driver.findElement(By.xpath("//input[@name='InsuredAddress']"));
		cf.highLighterMethod(driver, ele3);
		
		driver.findElement(By.xpath("//input[@name='InsuredAddress']")).sendKeys("Teting Address, Canada ");
		driver.findElement(By.xpath("//form//div[@class='row']//div[@class='row']//input[@name='UnitNumber']")).sendKeys("123");
		driver.findElement(By.xpath("//input[@id='InsuredCity']")).sendKeys("Ontario");
		driver.findElement(By.xpath("//input[@id='InsuredPostal']")).sendKeys("m1p0a9");
		driver.findElement(By.xpath("//input[@id='EmailAddress']")).sendKeys("testing@gmail.com");
		driver.findElement(By.xpath("//button[@id='AddInsuredMethod']")).click();
		cf.myWait(3);
		driver.findElement(By.xpath("//body[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[2]/input[1]")).sendKeys("6456789356");
		// ---  Add contact detail ?????
		driver.findElement(By.xpath("//div[@class='col-md-3']/select[1]")).click();
		
		driver.findElement(By.xpath("//div[@class='col-md-3']/select[1]//option[contains(text(),'Work')][1]")).click();
		driver.findElement(By.xpath("//body[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[3]/input[1]")).sendKeys("1");
		
		
		// ---  Add contact detail ?????
		
		driver.findElement(By.xpath("//input[@id='nextButton']")).click();
		// wait
		cf.myWait(10);
		//Loss location
		driver.findElement(By.xpath("//input[@id='LossAddress']")).sendKeys("37 kilmarnock Crescent");
		driver.findElement(By.xpath("//input[@id='LossUnit']")).sendKeys("555");
		driver.findElement(By.xpath("//input[@id='LossCity']")).sendKeys("ontario");
		driver.findElement(By.xpath("//input[@id='LossPostal']")).sendKeys("m1p0a9");
		driver.findElement(By.xpath("//input[@id='nextButton']")).click();
		// wait
		cf.myWait(10);
		//-------- Claim Information-----
		driver.findElement(By.xpath("//form[@id='claimInfoForm']//div//div//div//div//button//div//div//div[contains(text(),'Nothing selected')]")).click();
		
		driver.findElement(By.xpath("//div[@class='tab-content']//li[2]")).click();
		driver.findElement(By.xpath("//div[contains(text(),'Reconstruction')]")).click();
		cf.myWait(10);
		driver.findElement(By.xpath("//input[@id='ClaimNum']")).sendKeys("1234");
		driver.findElement(By.xpath("//input[@id='DateReceived']")).click();
		driver.findElement(By.xpath("//select[@id='JobSource']")).click();
		driver.findElement(By.xpath("//select[@id='JobSource']//option[contains(text(),'Insurer')]")).click();
		driver.findElement(By.xpath("//select[@id='JobSize']")).click();
		driver.findElement(By.xpath("//option[contains(text(),'Sm - <= $3,500.00')]")).click();
		driver.findElement(By.xpath("//select[@id='TypeOfWork']")).click();
		driver.findElement(By.xpath("//select[@id='TypeOfWork']//option[contains(text(),'Commercial')]")).click();
		driver.findElement(By.xpath("//input[@id='CatFile']")).click();
		driver.findElement(By.xpath("//input[@id='Contacted']")).click();
		driver.findElement(By.xpath("//input[@id='nextButton']")).click();
		cf.myWait(10);
		//---- Loss Details
		driver.findElement(By.xpath("//input[@id='DateOfLoss']")).click();
		driver.findElement(By.xpath("//input[@id='DateOfLoss']")).sendKeys("2022-06-05 10:47 PM");
		
		Select objSelect =new Select(driver.findElement(By.id("TypeOfLoss")));
		objSelect.selectByVisibleText("COLLAPSE");
		
		driver.findElement(By.xpath("//input[@id='CauseOfLoss']")).sendKeys("Emergency");
			
		driver.findElement(By.xpath("//textarea[@id='LossDescription']")).sendKeys("100 $ , Jewellery , Documents");
		driver.findElement(By.xpath("//input[@id='nextButton']")).click();
		cf.myWait(10);
		
		//---------- Internal Staff--
		WebDriverWait waitdp = new WebDriverWait(driver,30);
		waitdp.until(ExpectedConditions.visibilityOfElementLocated(By.id("MemberID")));  // wait for Member ID drop down
		
		Select objmanager =new Select(driver.findElement(By.id("MemberID")));
		objmanager.selectByVisibleText("DKI Canada Ltd.");
		
		driver.findElement(By.xpath("//a[@id='btnAddPM']")).click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		waitdp.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='PMModalBody']//div[@class='filter-option-inner-inner'][contains(text(),'Nothing selected')]")));  // wait for PM ID drop down
		System.out.println("Code done till here");
		driver.findElement(By.xpath("//div[@id='PMModalBody']//div[@class='filter-option-inner-inner'][contains(text(),'Nothing selected')]")).click();
		System.out.println("Code done till here 2");
		driver.findElement(By.xpath("//select[@id='PMDropDown']//option[contains(text(),'Brock Moote')]")).click();
		driver.findElement(By.xpath("//button[@id='PMSelectBtn']")).click();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS) ;
		driver.findElement(By.xpath("//input[@id='nextButton']")).click();
		cf.myWait(10);
		//--------Accounting Customer Information---
		Thread.sleep(5000);
		Select objcustomerType =new Select(driver.findElement(By.id("CustomerType")));
		objcustomerType.selectByVisibleText("Brokerage");
		cf.myWait(10);
		driver.findElement(By.xpath("//input[@id='finishButton']")).click();
		cf.myWait(10);
		System.out.println("Create Job created Successfully");
	} 
@AfterTest	
public void cleanup()
{
	//driver.close();
	
}
}
