package Magento_Home_Page;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public  class JavascriptExecuto
{
	public static void JavascriptExecutos(WebDriver driver,WebElement r)
	{
		JavascriptExecutor s = (JavascriptExecutor)driver;
        s.executeScript("arguments[0].click();", r);
	}
}
