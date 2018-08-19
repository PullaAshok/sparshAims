package com.volksoft.qa.base;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import com.volksoft.qa.testutil.*;
import com.volksoft.qa.testutil.*;

public class Testbase {
	 public static Properties property;
	 public static WebDriver driver;
	 public static EventFiringWebDriver edriver;
	
	 
  public Testbase() {
	  try {
		  File path=new File("E:\\workspace\\qatest\\src\\main\\java\\com\\volksoft\\qa\\configuration\\configuration.properties");
		  property=new Properties();
		  FileInputStream ip=new FileInputStream(path);
		  property.load(ip);
		  
	          }catch(Exception e){
		         e.printStackTrace();
	             }
	  
	         }
  
  public void initialization(){
	  String browsername=property.getProperty("browsername");

	  if(browsername.equals("chrome")){
		  System.setProperty("webdriver.chrome.driver","D:\\Chomedrivera\\chromedriver_win32\\chromedriver.exe");
		   driver=new ChromeDriver();
	      }
	  
	  edriver=new EventFiringWebDriver(driver);
	  Eventcapture ecapture=new Eventcapture();
	  edriver.register(ecapture);
	  driver=edriver;
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(TestUtil.ImpliciteWait, TimeUnit.SECONDS);
	  driver.manage().timeouts().pageLoadTimeout(TestUtil.PageloadTimeOut, TimeUnit.SECONDS);
	  driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
	  
  }
  
  
  
  
}
