package Magento_Home_Page;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SingUp_Page_Steps 
{
	WebDriver driver;
	Sing_Up_Page_Object enter;
	
	@Given("open chromebrowser")
	public void open_chromebrowser()
	{
	   
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
	}

	@Then("open Url")
	public void open_url()
	{
		driver.get("https://magento.softwaretestingboard.com/");
	}

	
	@Then("click creat sing up button")
	public void click_creat_sing_up_button()
	{
		enter = new Sing_Up_Page_Object(driver);
		enter.singuplink();
	}

	@Then("enter valid email")
	public void enter_valid_email() 
	{
		enter.email();
	}

	@Then("enter valid  password")
	public void enter_valid_password() throws IOException 
	{
		enter.password();
	}

	@Then("click sing up button")
	public void click_sing_up_button() throws InterruptedException
	{
		enter.singupbutton();
		
	}


}
