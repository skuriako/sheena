package testPackage;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;



public class testClass {
	
	  public static void main(String[] args) throws InterruptedException {
	        // declaration and instantiation of objects/variables
	    	System.setProperty("webdriver.chrome.driver","D://Test//AutomationProject//driver//chromedriver.exe");
			

ChromeOptions options=new ChromeOptions();
options.addArguments("start-maximized");
options.addArguments("disable-infobars");
options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});
WebDriver driver=new ChromeDriver(options);
driver.get("https://www.redbus.in");
		
		    }	
	    }



