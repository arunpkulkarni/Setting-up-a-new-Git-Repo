package com.Search;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Launch {

	//WebDriver driver = null;
	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws Exception {
	     
        //Creating a driver object referencing WebDriver interface
       // ChromeDriver driver1;
        
        //Setting webdriver.gecko.driver property
        System.setProperty("webdriver.chrome.driver", "D:\\AUTOMATION\\selenium\\Drivers\\chromedriver_win32\\chromedriver.exe");
        
        //Instantiating driver object and launching browser
        WebDriver driver = new ChromeDriver();
        
        //Using get() method to open a webpage
        driver.get("https://www.amazon.in/");
        
        Thread.sleep(5000);
        driver.manage().window().maximize();
        
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        Thread.sleep(5000);
        
        //Xpath searchbox
     //  WebElement searchBox = driver .findElement(By.xpath(("//*[@id=\"twotabsearchtextbox\"]")));
        
        
      WebElement searchBox = driver .findElement(By.cssSelector(("input#twotabsearchtextbox")));
       searchBox.sendKeys("book");
       
       //Search button
       WebElement searchButton = driver .findElement(By.cssSelector(("input#nav-search-submit-button")));
       searchButton.click();
       
        
        //Closing the browser
       // driver.quit();
	
		
	 
	 


		
	}

}
