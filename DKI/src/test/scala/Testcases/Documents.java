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

public class Documents {
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
	public void Documents_Create() throws InterruptedException
	{
		CommonFunctions cf= new CommonFunctions(driver);
		cf.Login();
		DetailsJobPage djp=new DetailsJobPage(driver);
		//djp.searchJob();
		searchJob();
		Thread.sleep(2000);
		WebElement ele =driver.findElement(djp.DocumentsTab);
		cf.highLighterMethod(driver, ele);
		Thread.sleep(2000);
		driver.findElement(djp.DocumentsTab).click();
		cf.myWait(5);
		Thread.sleep(2000);
		WebElement ele1 =driver.findElement(djp.Create);
		cf.highLighterMethod(driver, ele1);
		Thread.sleep(2000);
		driver.findElement(djp.Create).click();
		Thread.sleep(2000);

		 Select cft =new Select(driver.findElement(By.xpath("//select[@name='FormTemplateList']")));
			//objmanager.selectByVisibleText("Emergency");
		 cft.selectByIndex(1);
		 
		 
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//div[@id='formStartCreateModalBody']//div//div//div//button//div//div//div[contains(text(),'Nothing selected')]")).click();
		 
		 WebElement ele5 =driver.findElement(By.xpath("//span[contains(text(),'Reconstruction')]"));
			cf.highLighterMethod(driver, ele5);
			Thread.sleep(2000);
		 driver.findElement(By.xpath("//span[contains(text(),'Reconstruction')]")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//span[contains(text(),'Start')]")).click();
		 Thread.sleep(2000);
		 
		 driver.findElement(By.xpath("//html//body//div//div//div//div//div//div//div//div//div//div//div//div//div//div//div//form//table//tbody//tr//td//div//div//textarea")).sendKeys("Testing Data");
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//button[contains(text(),'+ Next')]")).click();
		 
		 Thread.sleep(3000);
		 
		 var canvas =driver.findElement(By.xpath("//td[1]//div[1]//canvas[1]"));
		 
	        //Calculate position canvas button
	        var canvas_dimensions = canvas.getSize();
	        var canvas_center_x = canvas_dimensions.getWidth() / 2;
	        var canvas_center_y = canvas_dimensions.getHeight() / 2;
	        int button_x = (canvas_center_x / 3) * 2;
	        int button_y = (canvas_center_y / 3) * 2;
	 
	        //Click button on the canvas
	        new Actions(driver)
	            .moveToElement(canvas, button_x, button_y)
	            .click()
	            .perform();
	 
		 
		 System.out.println(" Testcase complete");
	}
	
	@Test
	public void Documents_Create_Insepction_Report() throws InterruptedException
	{
		CommonFunctions cf= new CommonFunctions(driver);
		cf.Login();
		DetailsJobPage djp=new DetailsJobPage(driver);
		//djp.searchJob();
		searchJob();
		Thread.sleep(2000);
		WebElement ele =driver.findElement(djp.DocumentsTab);
		cf.highLighterMethod(driver, ele);
		Thread.sleep(2000);
		driver.findElement(djp.DocumentsTab).click();
		cf.myWait(5);
		Thread.sleep(2000);
		WebElement ele1 =driver.findElement(djp.Create);
		cf.highLighterMethod(driver, ele1);
		Thread.sleep(2000);
		driver.findElement(djp.Create).click();
		Thread.sleep(2000);

		 Select cft =new Select(driver.findElement(By.xpath("//select[@name='FormTemplateList']")));
			//objmanager.selectByVisibleText("Emergency");
		// cft.selectByIndex(1);
		 cft.selectByVisibleText("Inspection Report");
		 
		 
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//div[@id='formStartCreateModalBody']//div//div//div//button//div//div//div[contains(text(),'Nothing selected')]")).click();
		 
		 WebElement ele5 =driver.findElement(By.xpath("//span[contains(text(),'Reconstruction')]"));
			cf.highLighterMethod(driver, ele5);
			Thread.sleep(2000);
		 driver.findElement(By.xpath("//span[contains(text(),'Reconstruction')]")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//span[contains(text(),'Start')]")).click();
		 Thread.sleep(4000);
		 
		 driver.findElement(By.xpath("//div[15]//div[1]//textarea[1]")).sendKeys("Testing Data");
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//button[contains(text(),'Next')]")).click();
		 
		 Thread.sleep(3000);
		 
		 driver.findElement(By.xpath("//a[contains(text(),'Select All')]")).click();
		 Thread.sleep(3000);
		 
		 
		 driver.findElement(By.xpath("//button[contains(text(),'Next')]")).click();
		 Thread.sleep(3000);
		 // Options for Damage
		 driver.findElement(By.xpath("//tr//tr[1]//td[2]//fieldset[1]//div[1]//label[2]")).click();
		 
		 driver.findElement(By.xpath("//body//div//div//div//div//div//div//div//div//div//div//div//div//div//div//div//div//div//div//div//div//div[2]//div[2]//fieldset[1]//div[1]//label[2]")).click();// Were contents damaged?
		 driver.findElement(By.xpath("//textarea[@name='TechQuestionExplanation_21']")).sendKeys("Kitchen items");
		 
		 driver.findElement(By.xpath("//div//div//div//div//div//div//div//div//div//div//div//div//div//div[4]//div[2]//fieldset[1]//div[1]//label[2]")).click();
		 driver.findElement(By.xpath("//textarea[@name='TechQuestionExplanation_19']")).sendKeys("Test data");
		 
		 driver.findElement(By.xpath("//div[6]//div[2]//fieldset[1]//div[1]//label[1]")).click();
		 driver.findElement(By.xpath("//div[7]//div[2]//fieldset[1]//div[1]//label[2]")).click();
		 driver.findElement(By.xpath("//textarea[@name='TechQuestionExplanation_18']")).sendKeys("Test");
		 driver.findElement(By.xpath("//div[9]//div[2]//fieldset[1]//div[1]//label[1]")).click();
		 driver.findElement(By.xpath("//div[11]//div[2]//fieldset[1]//div[1]//label[1]")).click();
		 driver.findElement(By.xpath("//div[13]//div[2]//fieldset[1]//div[1]//label[1]")).click();
		 driver.findElement(By.xpath("//div[15]//div[2]//fieldset[1]//div[1]//label[1]")).click();
		 driver.findElement(By.xpath("//div[17]//div[2]//fieldset[1]//div[1]//label[1]")).click();
		 
//Include Room Notes?*
		 driver.findElement(By.xpath("//tr[3]//td[2]//fieldset[1]//div[1]//label[1]")).click();
		 driver.findElement(By.xpath("//button[contains(text(),'Finish')]")).click();
		 
		 System.out.println(" Testcase complete");
	}
	
	
	@Test
	public void Documents_Create_Work_Authorization_Commercial() throws InterruptedException
	{
		CommonFunctions cf= new CommonFunctions(driver);
		cf.Login();
		DetailsJobPage djp=new DetailsJobPage(driver);
		//djp.searchJob();
		searchJob();
		Thread.sleep(2000);
		WebElement ele =driver.findElement(djp.DocumentsTab);
		cf.highLighterMethod(driver, ele);
		Thread.sleep(2000);
		driver.findElement(djp.DocumentsTab).click();
		cf.myWait(5);
		Thread.sleep(2000);
		WebElement ele1 =driver.findElement(djp.Create);
		cf.highLighterMethod(driver, ele1);
		Thread.sleep(2000);
		driver.findElement(djp.Create).click();
		Thread.sleep(2000);

		 Select cft =new Select(driver.findElement(By.xpath("//select[@name='FormTemplateList']")));
			//objmanager.selectByVisibleText("Emergency");
		// cft.selectByIndex(1);
		 cft.selectByVisibleText("Work Authorization - Commercial");
		 
		 
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//div[@id='formStartCreateModalBody']//div//div//div//button//div//div//div[contains(text(),'Nothing selected')]")).click();
		 
		 WebElement ele5 =driver.findElement(By.xpath("//span[contains(text(),'Reconstruction')]"));
			cf.highLighterMethod(driver, ele5);
			Thread.sleep(2000);
		 driver.findElement(By.xpath("//span[contains(text(),'Reconstruction')]")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//span[contains(text(),'Start')]")).click();
		 Thread.sleep(4000);
		 
		 driver.findElement(By.xpath("//html//body//div//div//div//div//div//div//div//div//div//div//div//div//div//div//div//form//table//tbody//tr//td//div//div//textarea")).sendKeys("Testing Data");
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//button[contains(text(),'Next')]")).click();
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("//button[contains(text(),'Next')]")).click();
		 Thread.sleep(3000);
		 var canvas =driver.findElement(By.xpath("//td[1]//div[1]//canvas[1]"));
		 
	        //Calculate position canvas button
	        var canvas_dimensions = canvas.getSize();
	        var canvas_center_x = canvas_dimensions.getWidth() / 2;
	        var canvas_center_y = canvas_dimensions.getHeight() / 2;
	        int button_x = (canvas_center_x / 3) * 2;
	        int button_y = (canvas_center_y / 3) * 2;
	 
	        //Click button on the canvas
	        new Actions(driver)
	            .moveToElement(canvas, button_x, button_y)
	            .click()
	            .perform();
	        
	        driver.findElement(By.xpath("//div[@class='tab-pane active']//td[1]//input[1]")).sendKeys("Test customer");
	        
	        var canvas2 =driver.findElement(By.xpath("//td[2]//div[1]//canvas[1]"));
			 
	        //Calculate position canvas button
	        var canvas_dimensions2 = canvas2.getSize();
	        var canvas_center_x2 = canvas_dimensions2.getWidth() / 2;
	        var canvas_center_y2 = canvas_dimensions2.getHeight() / 2;
	        int button_x2 = (canvas_center_x2 / 3) * 2;
	        int button_y2 = (canvas_center_y2 / 3) * 2;
	 
	        //Click button on the canvas
	        new Actions(driver)
	            .moveToElement(canvas2, button_x2, button_y2)
	            .click()
	            .perform();
	        Thread.sleep(3000);
	        driver.findElement(By.xpath("//button[contains(text(),'Send For Signature')]")).click();
		 
		 System.out.println(" Testcase complete");
	}
	
	@Test
	public void Documents_Create_Work_Authorization_Emergency() throws InterruptedException
	{
		CommonFunctions cf= new CommonFunctions(driver);
		cf.Login();
		DetailsJobPage djp=new DetailsJobPage(driver);
		//djp.searchJob();
		searchJob();
		Thread.sleep(2000);
		WebElement ele =driver.findElement(djp.DocumentsTab);
		cf.highLighterMethod(driver, ele);
		Thread.sleep(2000);
		driver.findElement(djp.DocumentsTab).click();
		cf.myWait(5);
		Thread.sleep(2000);
		WebElement ele1 =driver.findElement(djp.Create);
		cf.highLighterMethod(driver, ele1);
		Thread.sleep(2000);
		driver.findElement(djp.Create).click();
		Thread.sleep(2000);

		 Select cft =new Select(driver.findElement(By.xpath("//select[@name='FormTemplateList']")));
			//objmanager.selectByVisibleText("Emergency");
		// cft.selectByIndex(1);
		 cft.selectByVisibleText("Work Authorization - Emergency");
		 
		 
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//div[@id='formStartCreateModalBody']//div//div//div//button//div//div//div[contains(text(),'Nothing selected')]")).click();
		 
		 WebElement ele5 =driver.findElement(By.xpath("//span[contains(text(),'Reconstruction')]"));
			cf.highLighterMethod(driver, ele5);
			Thread.sleep(2000);
		 driver.findElement(By.xpath("//span[contains(text(),'Reconstruction')]")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//span[contains(text(),'Start')]")).click();
		 Thread.sleep(4000);
		 
		 driver.findElement(By.xpath("//html//body//div//div//div//div//div//div//div//div//div//div//div//div//div//div//div//form//table//tbody//tr//td//div//div//textarea")).sendKeys("Testing Data");
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//button[contains(text(),'Next')]")).click();
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("//button[contains(text(),'Next')]")).click();
		 Thread.sleep(3000);
		 var canvas =driver.findElement(By.xpath("//td[1]//div[1]//canvas[1]"));
		 
	        //Calculate position canvas button
	        var canvas_dimensions = canvas.getSize();
	        var canvas_center_x = canvas_dimensions.getWidth() / 2;
	        var canvas_center_y = canvas_dimensions.getHeight() / 2;
	        int button_x = (canvas_center_x / 3) * 2;
	        int button_y = (canvas_center_y / 3) * 2;
	 
	        //Click button on the canvas
	        new Actions(driver)
	            .moveToElement(canvas, button_x, button_y)
	            .click()
	            .perform();
	        
	        driver.findElement(By.xpath("//div[@class='tab-pane active']//td[1]//input[1]")).sendKeys("Test customer");
	        
	        var canvas2 =driver.findElement(By.xpath("//td[2]//div[1]//canvas[1]"));
			 
	        //Calculate position canvas button
	        var canvas_dimensions2 = canvas2.getSize();
	        var canvas_center_x2 = canvas_dimensions2.getWidth() / 2;
	        var canvas_center_y2 = canvas_dimensions2.getHeight() / 2;
	        int button_x2 = (canvas_center_x2 / 3) * 2;
	        int button_y2 = (canvas_center_y2 / 3) * 2;
	 
	        //Click button on the canvas
	        new Actions(driver)
	            .moveToElement(canvas2, button_x2, button_y2)
	            .click()
	            .perform();
	        Thread.sleep(3000);
	        driver.findElement(By.xpath("//button[contains(text(),'Send For Signature')]")).click();
		 
		 System.out.println(" Testcase complete");
	}
	@Test
	public void Documents_Create_Work_Authorization_Structural() throws InterruptedException
	{
		CommonFunctions cf= new CommonFunctions(driver);
		cf.Login();
		DetailsJobPage djp=new DetailsJobPage(driver);
		//djp.searchJob();
		searchJob();
		Thread.sleep(2000);
		WebElement ele =driver.findElement(djp.DocumentsTab);
		cf.highLighterMethod(driver, ele);
		Thread.sleep(2000);
		driver.findElement(djp.DocumentsTab).click();
		cf.myWait(5);
		Thread.sleep(2000);
		WebElement ele1 =driver.findElement(djp.Create);
		cf.highLighterMethod(driver, ele1);
		Thread.sleep(2000);
		driver.findElement(djp.Create).click();
		Thread.sleep(2000);

		 Select cft =new Select(driver.findElement(By.xpath("//select[@name='FormTemplateList']")));
			//objmanager.selectByVisibleText("Emergency");
		// cft.selectByIndex(1);
		 cft.selectByVisibleText("Work Authorization - Structural");
		 
		 
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//div[@id='formStartCreateModalBody']//div//div//div//button//div//div//div[contains(text(),'Nothing selected')]")).click();
		 
		 WebElement ele5 =driver.findElement(By.xpath("//span[contains(text(),'Reconstruction')]"));
			cf.highLighterMethod(driver, ele5);
			Thread.sleep(2000);
		 driver.findElement(By.xpath("//span[contains(text(),'Reconstruction')]")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//span[contains(text(),'Start')]")).click();
		 Thread.sleep(4000);
		 
		 driver.findElement(By.xpath("//html//body//div//div//div//div//div//div//div//div//div//div//div//div//div//div//div//form//table//tbody//tr//td//div//div//textarea")).sendKeys("Testing Data");
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//button[contains(text(),'Next')]")).click();
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("//button[contains(text(),'Next')]")).click();
		 Thread.sleep(3000);
		 var canvas =driver.findElement(By.xpath("//td[1]//div[1]//canvas[1]"));
		 
	        //Calculate position canvas button
	        var canvas_dimensions = canvas.getSize();
	        var canvas_center_x = canvas_dimensions.getWidth() / 2;
	        var canvas_center_y = canvas_dimensions.getHeight() / 2;
	        int button_x = (canvas_center_x / 3) * 2;
	        int button_y = (canvas_center_y / 3) * 2;
	 
	        //Click button on the canvas
	        new Actions(driver)
	            .moveToElement(canvas, button_x, button_y)
	            .click()
	            .perform();
	        
	        driver.findElement(By.xpath("//div[@class='tab-pane active']//td[1]//input[1]")).sendKeys("Test customer");
	        
	        var canvas2 =driver.findElement(By.xpath("//td[2]//div[1]//canvas[1]"));
			 
	        //Calculate position canvas button
	        var canvas_dimensions2 = canvas2.getSize();
	        var canvas_center_x2 = canvas_dimensions2.getWidth() / 2;
	        var canvas_center_y2 = canvas_dimensions2.getHeight() / 2;
	        int button_x2 = (canvas_center_x2 / 3) * 2;
	        int button_y2 = (canvas_center_y2 / 3) * 2;
	 
	        //Click button on the canvas
	        new Actions(driver)
	            .moveToElement(canvas2, button_x2, button_y2)
	            .click()
	            .perform();
	        Thread.sleep(3000);
	        driver.findElement(By.xpath("//button[contains(text(),'Send For Signature')]")).click();
		 
		 System.out.println(" Testcase complete");
	}
	@Test
	public void Documents_Create_Workmanship_Warranty() throws InterruptedException
	{
		CommonFunctions cf= new CommonFunctions(driver);
		cf.Login();
		DetailsJobPage djp=new DetailsJobPage(driver);
		//djp.searchJob();
		searchJob();
		Thread.sleep(2000);
		WebElement ele =driver.findElement(djp.DocumentsTab);
		cf.highLighterMethod(driver, ele);
		Thread.sleep(2000);
		driver.findElement(djp.DocumentsTab).click();
		cf.myWait(5);
		Thread.sleep(2000);
		WebElement ele1 =driver.findElement(djp.Create);
		cf.highLighterMethod(driver, ele1);
		Thread.sleep(2000);
		driver.findElement(djp.Create).click();
		Thread.sleep(2000);

		 Select cft =new Select(driver.findElement(By.xpath("//select[@name='FormTemplateList']")));
			//objmanager.selectByVisibleText("Emergency");
		// cft.selectByIndex(1);
		 cft.selectByVisibleText("Workmanship Warranty");
		 
		 
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//div[@id='formStartCreateModalBody']//div//div//div//button//div//div//div[contains(text(),'Nothing selected')]")).click();
		 
		 WebElement ele5 =driver.findElement(By.xpath("//span[contains(text(),'Reconstruction')]"));
			cf.highLighterMethod(driver, ele5);
			Thread.sleep(2000);
		 driver.findElement(By.xpath("//span[contains(text(),'Reconstruction')]")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//span[contains(text(),'Start')]")).click();
		 Thread.sleep(4000);
		 
		 driver.findElement(By.xpath("//html//body//div//div//div//div//div//div//div//div//div//div//div//div//div//div//div//form//table//tbody//tr//td//div//div//textarea")).sendKeys("Testing Data");
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//button[contains(text(),'Next')]")).click();
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("//button[contains(text(),'Next')]")).click();
		 Thread.sleep(3000);
		 var canvas =driver.findElement(By.xpath("//td[1]//div[1]//canvas[1]"));
		 
	        //Calculate position canvas button
	        var canvas_dimensions = canvas.getSize();
	        var canvas_center_x = canvas_dimensions.getWidth() / 2;
	        var canvas_center_y = canvas_dimensions.getHeight() / 2;
	        int button_x = (canvas_center_x / 3) * 2;
	        int button_y = (canvas_center_y / 3) * 2;
	 
	        //Click button on the canvas
	        new Actions(driver)
	            .moveToElement(canvas, button_x, button_y)
	            .click()
	            .perform();
	        
	        driver.findElement(By.xpath("//div[@class='tab-pane active']//td[1]//input[1]")).sendKeys("Test customer");
	        
	        var canvas2 =driver.findElement(By.xpath("//td[2]//div[1]//canvas[1]"));
			 
	        //Calculate position canvas button
	        var canvas_dimensions2 = canvas2.getSize();
	        var canvas_center_x2 = canvas_dimensions2.getWidth() / 2;
	        var canvas_center_y2 = canvas_dimensions2.getHeight() / 2;
	        int button_x2 = (canvas_center_x2 / 3) * 2;
	        int button_y2 = (canvas_center_y2 / 3) * 2;
	 
	        //Click button on the canvas
	        new Actions(driver)
	            .moveToElement(canvas2, button_x2, button_y2)
	            .click()
	            .perform();
	        Thread.sleep(3000);
	        driver.findElement(By.xpath("//button[contains(text(),'Send For Signature')]")).click();
		 
		 System.out.println(" Testcase complete");
	}
	@Test
	public void Documents_Create_Completion_Certificate() throws InterruptedException
	{
		CommonFunctions cf= new CommonFunctions(driver);
		cf.Login();
		DetailsJobPage djp=new DetailsJobPage(driver);
		//djp.searchJob();
		searchJob();
		Thread.sleep(2000);
		WebElement ele =driver.findElement(djp.DocumentsTab);
		cf.highLighterMethod(driver, ele);
		Thread.sleep(2000);
		driver.findElement(djp.DocumentsTab).click();
		cf.myWait(5);
		Thread.sleep(2000);
		WebElement ele1 =driver.findElement(djp.Create);
		cf.highLighterMethod(driver, ele1);
		Thread.sleep(2000);
		driver.findElement(djp.Create).click();
		Thread.sleep(2000);

		 Select cft =new Select(driver.findElement(By.xpath("//select[@name='FormTemplateList']")));
			//objmanager.selectByVisibleText("Emergency");
		// cft.selectByIndex(1);
		 cft.selectByVisibleText("Completion Certificate");
		 
		 
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//div[@id='formStartCreateModalBody']//div//div//div//button//div//div//div[contains(text(),'Nothing selected')]")).click();
		 
		 WebElement ele5 =driver.findElement(By.xpath("//span[contains(text(),'Reconstruction')]"));
			cf.highLighterMethod(driver, ele5);
			Thread.sleep(2000);
		 driver.findElement(By.xpath("//span[contains(text(),'Reconstruction')]")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//span[contains(text(),'Start')]")).click();
		 Thread.sleep(4000);
		 
		 driver.findElement(By.xpath("//html//body//div//div//div//div//div//div//div//div//div//div//div//div//div//div//div//form//table//tbody//tr//td//div//div//textarea")).sendKeys("Testing Data");
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//button[contains(text(),'Next')]")).click();
		 Thread.sleep(3000);
		// driver.findElement(By.xpath("//button[contains(text(),'Next')]")).click();
		// Thread.sleep(3000);
		 var canvas =driver.findElement(By.xpath("//td[1]//div[1]//canvas[1]"));
		 
	        //Calculate position canvas button
	        var canvas_dimensions = canvas.getSize();
	        var canvas_center_x = canvas_dimensions.getWidth() / 2;
	        var canvas_center_y = canvas_dimensions.getHeight() / 2;
	        int button_x = (canvas_center_x / 3) * 2;
	        int button_y = (canvas_center_y / 3) * 2;
	 
	        //Click button on the canvas
	        new Actions(driver)
	            .moveToElement(canvas, button_x, button_y)
	            .click()
	            .perform();
	        
	        driver.findElement(By.xpath("//div[@class='tab-pane active']//td[1]//input[1]")).sendKeys("Test customer");
	        
	        var canvas2 =driver.findElement(By.xpath("//td[2]//div[1]//canvas[1]"));
			 
	        //Calculate position canvas button
	        var canvas_dimensions2 = canvas2.getSize();
	        var canvas_center_x2 = canvas_dimensions2.getWidth() / 2;
	        var canvas_center_y2 = canvas_dimensions2.getHeight() / 2;
	        int button_x2 = (canvas_center_x2 / 3) * 2;
	        int button_y2 = (canvas_center_y2 / 3) * 2;
	 
	        //Click button on the canvas
	        new Actions(driver)
	            .moveToElement(canvas2, button_x2, button_y2)
	            .click()
	            .perform();
	        Thread.sleep(3000);
	        driver.findElement(By.xpath("//button[contains(text(),'Send For Signature')]")).click();
		 
		 System.out.println(" Testcase complete");
	}
	
	@Test
	public void Documents_Create_Contents_Disposal() throws InterruptedException
	{
		CommonFunctions cf= new CommonFunctions(driver);
		cf.Login();
		DetailsJobPage djp=new DetailsJobPage(driver);
		//djp.searchJob();
		searchJob();
		Thread.sleep(2000);
		WebElement ele =driver.findElement(djp.DocumentsTab);
		cf.highLighterMethod(driver, ele);
		Thread.sleep(2000);
		driver.findElement(djp.DocumentsTab).click();
		cf.myWait(5);
		Thread.sleep(2000);
		WebElement ele1 =driver.findElement(djp.Create);
		cf.highLighterMethod(driver, ele1);
		Thread.sleep(2000);
		driver.findElement(djp.Create).click();
		Thread.sleep(2000);

		 Select cft =new Select(driver.findElement(By.xpath("//select[@name='FormTemplateList']")));
			//objmanager.selectByVisibleText("Emergency");
		// cft.selectByIndex(1);
		 cft.selectByVisibleText("Contents Disposal");
		 
		 
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//div[@id='formStartCreateModalBody']//div//div//div//button//div//div//div[contains(text(),'Nothing selected')]")).click();
		 
		 WebElement ele5 =driver.findElement(By.xpath("//span[contains(text(),'Reconstruction')]"));
			cf.highLighterMethod(driver, ele5);
			Thread.sleep(2000);
		 driver.findElement(By.xpath("//span[contains(text(),'Reconstruction')]")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//span[contains(text(),'Start')]")).click();
		 Thread.sleep(4000);
		 
		 driver.findElement(By.xpath("//html//body//div//div//div//div//div//div//div//div//div//div//div//div//div//div//div//form//table//tbody//tr//td//div//div//textarea")).sendKeys("Testing Data");
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//button[contains(text(),'Next')]")).click();
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("//button[contains(text(),'Next')]")).click();
		 Thread.sleep(3000);
		 var canvas =driver.findElement(By.xpath("//td[1]//div[1]//canvas[1]"));
		 
	        //Calculate position canvas button
	        var canvas_dimensions = canvas.getSize();
	        var canvas_center_x = canvas_dimensions.getWidth() / 2;
	        var canvas_center_y = canvas_dimensions.getHeight() / 2;
	        int button_x = (canvas_center_x / 3) * 2;
	        int button_y = (canvas_center_y / 3) * 2;
	 
	        //Click button on the canvas
	        new Actions(driver)
	            .moveToElement(canvas, button_x, button_y)
	            .click()
	            .perform();
	        
	        driver.findElement(By.xpath("//div[@class='tab-pane active']//td[1]//input[1]")).sendKeys("Test customer");
	        
	        var canvas2 =driver.findElement(By.xpath("//td[2]//div[1]//canvas[1]"));
			 
	        //Calculate position canvas button
	        var canvas_dimensions2 = canvas2.getSize();
	        var canvas_center_x2 = canvas_dimensions2.getWidth() / 2;
	        var canvas_center_y2 = canvas_dimensions2.getHeight() / 2;
	        int button_x2 = (canvas_center_x2 / 3) * 2;
	        int button_y2 = (canvas_center_y2 / 3) * 2;
	 
	        //Click button on the canvas
	        new Actions(driver)
	            .moveToElement(canvas2, button_x2, button_y2)
	            .click()
	            .perform();
	        Thread.sleep(3000);
	        driver.findElement(By.xpath("//button[contains(text(),'Send For Signature')]")).click();
		 
		 System.out.println(" Testcase complete");
	}
	@Test
	public void Documents_Add() throws InterruptedException, AWTException
	{
		CommonFunctions cf= new CommonFunctions(driver);
		cf.Login();
		DetailsJobPage djp=new DetailsJobPage(driver);
		//djp.searchJob();
		searchJob();
		Thread.sleep(2000);
		WebElement ele =driver.findElement(djp.DocumentsTab);
		cf.highLighterMethod(driver, ele);
		Thread.sleep(2000);
		driver.findElement(djp.DocumentsTab).click();
		cf.myWait(5);
				
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'ADD')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(text(),'Drop files here to upload')]")).click();
		Thread.sleep(4000);
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
		    Thread.sleep(1000);
			 Select cft =new Select(driver.findElement(By.xpath("//select[@id='FolderList']")));
				//objmanager.selectByVisibleText("Emergency");
			// cft.selectByIndex(1);
			 cft.selectByVisibleText("General");
			 Thread.sleep(2000);
			 driver.findElement(By.xpath("//html//body//div//div//div//div//div//div//div//div//div//div//div//div//button//div//div//div[contains(text(),'Nothing selected')]")).click();
				Thread.sleep(2000);
				 driver.findElement(By.xpath("//span[contains(text(),'Reconstruction')]")).click();
				 Thread.sleep(2000);
		    driver.findElement(By.xpath("//button[@id='SaveMedia']//span[@class='ladda-label'][contains(text(),'Save')]")).click();
		 
		
	}
	@Test
	public void Documents_Move() throws InterruptedException, AWTException
	{
		CommonFunctions cf= new CommonFunctions(driver);
		cf.Login();
		DetailsJobPage djp=new DetailsJobPage(driver);
		//djp.searchJob();
		searchJob();
		Thread.sleep(2000);
		WebElement ele =driver.findElement(djp.DocumentsTab);
		cf.highLighterMethod(driver, ele);
		Thread.sleep(2000);
		driver.findElement(djp.DocumentsTab).click();
		cf.myWait(5);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div//div[3]//div[1]//img[1]")).click(); //Click on field documents
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[4]//div[1]//div[2]//div[3]//div[1]//img[1]")).click();
		
		driver.findElement(By.xpath("//a[contains(text(),'MOVE')]")).click();
		Thread.sleep(2000);
		
		 Select cft =new Select(driver.findElement(By.xpath("//select[@name='FolderMoveList']")));
			cft.selectByVisibleText("General");
		
		
			driver.findElement(By.xpath("//div[@class='modal-content']//div//div[@class='modal-footer']//span[@class='ladda-label'][contains(text(),'Save')]")).click();
		 
		
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
		WebElement ele =driver.findElement(By.xpath("//div[contains(text(),'Test Satish')]"));
		cf.highLighterMethod(driver, ele);
		 Thread.sleep(2000);
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
