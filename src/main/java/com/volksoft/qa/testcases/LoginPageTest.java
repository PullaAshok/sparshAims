package com.volksoft.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.volksoft.qa.SKSmodules.HomePage;
import com.volksoft.qa.SKSmodules.LoginPage;
import com.volksoft.qa.base.Testbase;

public class LoginPageTest extends Testbase {
	LoginPage loginpage;
	HomePage homepage;
	SoftAssert sassert;
  public LoginPageTest(){
	  super();
      }
  
  @BeforeMethod
  public void setup() {
	  initialization();
	  loginpage=new LoginPage();
	  sassert=new SoftAssert();
       }
     
  @Test
  public void verifytitleTest(){
	  try{
		  loginpage.loginpage();
	  String title=loginpage.verifytitle();
	  sassert.assertEquals(title, "OrangeHRM", "the is mismatched");
	  System.out.println("the title is " +title);
	  sassert.assertAll();
	  }catch(Exception e){
		  e.printStackTrace();
		  }
      }
  
   }
