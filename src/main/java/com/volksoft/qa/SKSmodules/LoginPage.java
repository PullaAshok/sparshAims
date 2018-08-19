package com.volksoft.qa.SKSmodules;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.volksoft.qa.base.Testbase;

public class LoginPage extends Testbase {
   //Pagefactory or Page library
	
   @FindBy(id="txtUsername")
   WebElement username;
   @FindBy(id="txtPassword")
   WebElement password;
   @FindBy(id="btnLogin")
   WebElement loginbtn;
   
   
   
  public LoginPage() {
	  PageFactory.initElements(driver, this);
      }
  
  public void login(String Username,String Password){
	  
	  username.sendKeys(Username);
	  // username.sendKeys(property.getProperty("username"));
      password.sendKeys(Password);
 // password.sendKeys(property.getProperty("password"));
	  loginbtn.click();
	  //return new HomePage(); 
     }
  
  public String verifytitle(){
	  return driver.getTitle();
  }
  
  
  
}
