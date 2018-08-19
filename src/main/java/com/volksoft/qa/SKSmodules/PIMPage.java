package com.volksoft.qa.SKSmodules;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.volksoft.qa.base.Testbase;

public class PIMPage extends Testbase {

	@FindBy(xpath="//a[@href='/index.php/pim/viewPimModule']")
	   WebElement PIM_Link;
       public PIMPage(){	
	     PageFactory.initElements(driver, this);
         }
       
       
	
	
}
