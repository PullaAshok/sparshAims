package com.volksoft.qa.SKSmodules;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.volksoft.qa.base.Testbase;

public class HomePage extends Testbase {
	
	
	@FindBy(xpath="//img[@src='/webres_5acde3dbd3adc6.90334155/orangehrmLeavePlugin/images/MyLeave.png']")
	WebElement leavelist;
	
	@FindBy(xpath="//img[@src='/webres_5acde3dbd3adc6.90334155/orangehrmLeavePlugin/images/ApplyLeave.png']")
	WebElement assignleave;
	
	@FindBy(id="menu_admin_viewAdminModule")
	WebElement Admin;
	
	@FindBy(xpath="//a[@href='/index.php/pim/viewPimModule']")
	WebElement PIM;
	
	@FindBy(id="menu_leave_viewLeaveModule")
	WebElement Leave;
	
	@FindBy(id="menu_time_viewTimeModule")
	WebElement Time;
	
	@FindBy(id="menu_recruitment_viewRecruitmentModule")
    WebElement Recruitement;
	
	@FindBy(id="menu__Performance")
	WebElement Performance;
	
	@FindBy(id="menu_directory_viewDirectory")
	WebElement Directory;
	
   public HomePage(){
	PageFactory.initElements(driver, this);
	
      }
 	public AdminPage Clickonadminlink(){
       Admin.click();
       return new AdminPage();
 	  }
 	




}
