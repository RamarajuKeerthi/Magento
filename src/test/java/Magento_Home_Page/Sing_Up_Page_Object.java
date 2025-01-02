package Magento_Home_Page;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Sing_Up_Page_Object
{
	WebDriver driver;
	Page_Object_Of_Create_Account_page n;
	@FindBy(xpath=("(//*[@href='https://magento.softwaretestingboard.com/customer/account/login/referer/aHR0cHM6Ly9tYWdlbnRvLnNvZnR3YXJldGVzdGluZ2JvYXJkLmNvbS8%2C/'])[1]"))
	WebElement singup_link;
	
	@FindBy(xpath=("//*[@name='login[username]']"))
	WebElement email;
	
	@FindBy(xpath=("//*[@name='login[password]']"))
	WebElement password;
	
	@FindBy(xpath=("(//*[@name='send'])[1]"))
	WebElement singup_Button;
	
	
	public Sing_Up_Page_Object(WebDriver driver1) 
	{
		PageFactory.initElements(driver1, this);
		 driver = driver1;
	}
	
	public void singuplink(){
		singup_link.click();
	}
	public void email()
	{
		
	    n = new Page_Object_Of_Create_Account_page(driver);
		
		email.sendKeys("1234567@gmail.com");
		
	}
	public void password() throws IOException {
		
		password.sendKeys("Rama@7330");
		
		n.screenshot();
	}
	public void singupbutton() throws InterruptedException
	{
		Thread.sleep(5000);
		singup_Button.click();
		n.title();
		n.close();
	}
	
	
	
	
}
