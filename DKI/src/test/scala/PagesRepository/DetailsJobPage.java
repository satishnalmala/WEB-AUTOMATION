package PagesRepository;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DetailsJobPage {
WebDriver driver=null;

//--------CAuse of Loss--------------------------------
public By CauseofLossTab=By.xpath("//ul[@id='detailsAccordion']//li[2]//a[1]");
public By CauseofLoss_ResultingDamage_textarea=By.xpath("//textarea[@id='ResultingDamage']");
public By CauseofLosssave=By.xpath("//button[@id='SaveLossData']");
//------ Emergency Service Report-------
public By EmergencyServiceReportTab=By.xpath("//li[3]//ul[1]//li[3]//a[1]");
public By EmergencyServiceReport_textarea1=By.xpath("//div[3]//div[2]//textarea[1]");
public By EmergencyServiceReport_textarea2=By.xpath("//div[5]//div[2]//textarea[1]");
public By EmergencyServiceReportsave=By.xpath("//button[2]//i[1]");
//------ Subrogation Evidence------------------
public By SubrogationEvidenceTab=By.xpath("//li[3]//ul[1]//li[4]//a[1]");
public By Description_of_Evidence_textarea=By.xpath("//textarea[@name='Description']");
public By Collection_date=By.xpath("//input[@name='CollectedOn']");
public By SubrogationEvidencesave=By.xpath("//body/div/div/div/div/div/div/div/div/button/span[1]");
//------ Salvage------------------
public By SalvageTab=By.xpath("//body//div[@id='sideMenuId']//li//li[5]//a[1]");
public By Condition_of_Salvagetextarea=By.xpath("//textarea[@name='Condition']");
public By Salvagesave=By.xpath("//button[@id='SaveEvidenceSalvage']//span[contains(text(),'Save')]");
//------ ApprovalDetails------------------
public By ApprovalDetailTab=By.xpath("//li[@class='panel']//li[6]//a[1]");
public By ApprovalsRequiredtextarea=By.xpath("//textarea[@name='Details']");
public By ApprovalRequiredsave=By.xpath("//button[@class='btn btn-green ladda-button saveBtn']");
//============================================== Media=======================================================
public By MediaTab=By.xpath("//body/div/nav/div/ul[1]/li[4]/a[1]");
public By siteMap=By.xpath("//ul[@id='mediaAccordion']//li[1]//a[1]");
public By Add=By.xpath("//a[@id='addButton']");
public By dropPhoto=By.xpath("//div[@id='dropBody']");
public By ExistingPhoto=By.xpath("//a[contains(text(),'Existing Media')]");
public By ExistingPhotoSelectionImage=By.xpath("//img[@class='existThumb']");
public By ExistingPhotosave=By.xpath("//div[@class='hideDiv active']//button[2]");
public By NewPhotosave=By.xpath("//span[contains(text(),'Save')]");

//================== Documents Tab===============================
public By DocumentsTab=By.xpath("//body/div/nav/div/ul[1]/li[5]/a[1]");
public By Create=By.xpath("//a[contains(text(),'CREATE')]");
///=============================Eqipment============
//================== Documents Tab===============================
public By EquipmentTab=By.xpath("//body/div/nav/div/ul/li[8]/a[1]");


	public DetailsJobPage(WebDriver driver)
	{
		this.driver=driver;
		}
	
	public void searchJob() throws InterruptedException
	{
		CommonFunctions cf= new CommonFunctions(driver);
		driver.findElement(By.xpath("//input[@id='jobSearch']")).sendKeys("221");
		cf.myWait(2);cf.myWait(5);
		Thread.sleep(10000);
		driver.findElement(By.xpath("//input[@id='jobSearch']")).sendKeys("0DK");
		cf.myWait(2);cf.myWait(5);Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='jobSearch']")).sendKeys("001");
		cf.myWait(15);
		driver.findElement(By.xpath("//div[contains(text(),'EARTHQUAKE')]")).click();
		Thread.sleep(2000);
		cf.myWait(10);
		cf.myWait(2);
	}
}
