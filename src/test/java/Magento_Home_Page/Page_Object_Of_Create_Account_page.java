package Magento_Home_Page;

import java.io.File;
import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;

import org.apache.commons.lang.RandomStringUtils;
import org.codehaus.plexus.util.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public  class Page_Object_Of_Create_Account_page 
{
	
	WebDriver driver;
	 
	String generatemails ;
	
	@FindBy(xpath="(//*[text()='Create an Account'])[1]")
	WebElement Click_Account_Button;
	
	
	@FindBy(xpath="//*[@id='firstname']")
	WebElement firstname;
	
	@FindBy(xpath="//*[@id='lastname']")
	WebElement lostname;
	
	@FindBy(xpath="//*[@name='email']")
	WebElement gmail;
	
	@FindBy(xpath="//*[@id='password']")
	WebElement password;
	
	@FindBy(xpath="//*[@name='password_confirmation']")
	WebElement conpassword;
	
	@FindBy(xpath="(//*[text()='Create an Account'])[3]")
	WebElement accountclick;
	
	
	
	public Page_Object_Of_Create_Account_page(WebDriver driver1) 
	{
		PageFactory.initElements(driver1, this);
		 driver = driver1;
	}
	
	
	
	public void Click_Account_Button()
	{
		Click_Account_Button.click();
		
		 System.out.println("clicl account button");
	}
	public void firstname() 
	{
		String name= generatemails+"ram" ;
		
		firstname.sendKeys(name);
		System.out.println(name+"user enter first name");
	}
	public void lostname()
	{
		lostname.sendKeys("raju");
		System.out.println("user enter lostname");
	}
	public String gmail() 
	{
		String generatemails = RandomStringUtils.randomAlphabetic(8);
		String gmails =generatemails+"@gmail.com";
		gmail.sendKeys(gmails);
		System.out.println("user enter email");
		return gmails;
		
	}
	public void password() 
	{
		password.sendKeys("Rama@7330");
		
		System.out.println("user enter password");
	}
	public void conpassword() 
	{
		conpassword.sendKeys("Rama@7330");
		
		System.out.println("user enter conpassword");
	}
	public void accountclick() throws InterruptedException 
	{
		Thread.sleep(5000);
		
		accountclick.click();
		
		System.out.println("user click account button");
	}
	
	public void close() 
	{
		driver.close();
	}
	
	public void title() 
	{
		driver.getTitle();
		
		System.out.println("=title="+driver.getTitle()+"========");
	}
	public void screenshot () throws IOException 
	{
		
			String pattern = "dd-M-yyyy hh:mm:ss";
			SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
			String date = simpleDateFormat.format(new Date(0));
			//System.out.println(date);
			date=date.replace(":", "-");
			System.out.println(date);
			
			 File  src=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);	 
			 File file=new File ("C:\\ramaraju\\Com.Magento\\src\\test\\resources\\screenshot"+date+".png");
			 FileUtils.copyFile(src, file);	
	}
}
