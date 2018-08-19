package com.volksoft.qa;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.volksoft.qa.testutil.Eventcapture;
import com.volksoft.qa.testutil.TestUtil;

public class datadriven {
  public WebDriver driver;
  public static EventFiringWebDriver edriver;
	
	@BeforeMethod
	public void setupe(){
		try{
		 System.setProperty("webdriver.chrome.driver","D:\\Chomedrivera\\chromedriver_win32\\chromedriver.exe");
		   driver=new ChromeDriver();
		   edriver=new EventFiringWebDriver(driver);
			  Eventcapture ecapture=new Eventcapture();
			  edriver.register(ecapture);
			  driver=edriver;
			  driver.manage().window().maximize();
			  driver.manage().timeouts().implicitlyWait(TestUtil.ImpliciteWait, TimeUnit.SECONDS);
			  driver.manage().timeouts().pageLoadTimeout(TestUtil.PageloadTimeOut, TimeUnit.SECONDS);
			  driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
	      }
	catch(Exception e){
		System.out.println("Exception in the browser");
	}
}
	@DataProvider
	      public Iterator<Object[]> getdataexcel(){
	    	  
		  ArrayList<Object[]> testdata=TestUtil.getdatafromExcel();
	    	  
	    	  return testdata.iterator();
	       }
	
    @Test(dataProvider="getdataexcel")
          public void verifylogin(String username,String password) {
    	try{
    	
	  WebElement Username=driver.findElement(By.id("txtUsername"));
	  //Username.clear();
	  Username.sendKeys(username);
	  WebElement Password=driver.findElement(By.id("txtPassword"));
	  //Username.clear();
	  Username.sendKeys(password);
	  
	  WebElement Login=driver.findElement(By.id("loginbtn"));
	  Login.click();
    	}catch(Exception e){
    		System.out.println("Exception in the data");
    	}
  }
}
