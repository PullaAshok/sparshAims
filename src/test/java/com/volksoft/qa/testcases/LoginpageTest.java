package com.volksoft.qa.testcases;

import java.util.ArrayList;
import java.util.Iterator;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.volksoft.qa.SKSmodules.HomePage;
import com.volksoft.qa.SKSmodules.LoginPage;
import com.volksoft.qa.base.Testbase;
import com.volksoft.qa.testutil.*;

public class LoginpageTest extends Testbase {
	LoginPage loginpage;
	HomePage homepage;
	SoftAssert sassert;
	
  public LoginpageTest(){
	  super();
      }
  
  @BeforeMethod
  public void setup() {
	  initialization();
	  loginpage=new LoginPage();
	  sassert=new SoftAssert();
	 
    }
       // we can run failed test cases by using two types 1)we can specify retryAnalyser at the test cases.(not recomanded)
       // 2) we can specify at one time by using IAnnotationtransformer interface
       //@Test(retryAnalyzer=com.volksoft.qa.analyser.Retryanalyser.class)
  
  @Test(dataProvider="getdataexcel")
  public void verifytitleTest(String username,String password){
	  try{
		loginpage.login(username, password);
		
	  String title=loginpage.verifytitle();
	  sassert.assertEquals(title, "OrangeHRM", "the is mismatched");
	  System.out.println("the title is " +title);
	  sassert.assertAll();
	  }catch(Exception e){
		   e.printStackTrace();
		  }
    }
  
  @DataProvider(name="getdataexcel")
  public Iterator<Object[]> getdataexcel(){
	  ArrayList<Object[]> testdata=TestUtil.getdatafromExcel();
	 return testdata.iterator();
	  
       }
	 // @Test()
	  
	  //public void verifylogin(){
		   
		  
		// }
		  
		  
		  
		  
	 }
	  
	  
  























