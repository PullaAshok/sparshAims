package com.volksoft.qa.testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.volksoft.qa.SKSmodules.*;
import com.volksoft.qa.base.*;
public class AdminPageTest extends Testbase {
 
	 HomePage homepage;
	 LoginPage login;
	 AdminPage adminpage;
     public AdminPageTest(){
	          super();
           }
  @BeforeMethod
      public void setup(){
	  initialization();
	  login=new LoginPage();
	  //login.login();
	  homepage=new HomePage();
	  homepage.Clickonadminlink(); 
	  adminpage=new AdminPage();
     }
  @Test
      public void verifyuserspage(){
	  adminpage.AddUsers("ESS","Fiona Grace","Ashok","ashok@123","ashok@123");
	  
	  
	  System.out.println("the user page opened");
	  
	  
	  
	  
	  
    }
  
}


