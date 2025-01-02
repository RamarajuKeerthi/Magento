package Magento_Home_Page;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.github.javafaker.Faker;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Create_Account_Page_Steps
{
	
	WebDriver driver;
	Page_Object_Of_Create_Account_page enter ;
	
	

	@Given("open chrome browser")
	public void open_chrome_browser()
	{
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
	}

	@Then("open url")
	public void open_url()
	{
		driver.get("https://magento.softwaretestingboard.com/");
	}
	@Then("click creat account button")
	public void click_creat_account_button()
	{
		enter = new Page_Object_Of_Create_Account_page(driver);
		
		enter.Click_Account_Button();
		enter.title();
	}

	@Then("enter fist name")
	public void enter_fist_name() 
	{
		enter.firstname();
	}

	@Then("enter lost name")
	public void enter_lost_name()
	{
		enter.lostname();
	}
	
	@Then("enter gmail")
	public void enter_gmail() {
	    enter.gmail();
	   
	}

	@Then("enter password")
	public void enter_password()
	{
		enter.password();
	}

	@Then("enter confirm password")
	public void enter_confirm_password() throws IOException 
	{
		enter.conpassword();
		enter.screenshot();
	}

	@When("click the create an account button")
	public void click_the_create_an_account_button() throws InterruptedException, IOException
	{
	   enter.accountclick();
	   enter.screenshot();
	   enter.close();
	}
	

}
