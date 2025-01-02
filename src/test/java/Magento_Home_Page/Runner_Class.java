package Magento_Home_Page;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions
(
		
	
		
		features="C:\\ramaraju\\Com.Magento\\src\\test\\resources\\Singin_Page",
		glue="Magento_Home_Page",
		dryRun=	false,
		stepNotifications=	true,
		tags= "@Createaccount  or @singuppage",
		plugin= {"pretty","html:target/cucumber-reports/CucumberTestReport.html"}
		
)
public class Runner_Class {
	

}
