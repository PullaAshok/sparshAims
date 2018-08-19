package com.volksoft.qa.testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.volksoft.qa.SKSmodules.HomePage;
import com.volksoft.qa.SKSmodules.LoginPage;
import com.volksoft.qa.base.Testbase;
public class HomePageTest extends Testbase {
	LoginPage loginpage;
	HomePage homepage;
  public HomePageTest() {
      super();  
     }
  @BeforeMethod
    public void setup(){
	initialization();
    loginpage=new LoginPage();
    //loginpage.login(Usernamea, Passwordd);
    homepage=new HomePage();
   }
  @Test
  public void ClickonAdminPage(){
	  homepage.Clickonadminlink();
	  System.out.println("Adminpage clicked successfully");
	  
  }
  
 }
