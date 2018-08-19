package com.volksoft.qa.SKSmodules;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.volksoft.qa.base.Testbase;

public class AdminPage extends Testbase {
	
	//User management
	
	@FindBy(id="menu_admin_UserManagement")
	WebElement Usermanagement_dropdown;
	
	@FindBy(id="menu_admin_viewSystemUsers")
	WebElement Users;
	
	@FindBy(id="btnAdd")
	WebElement Addbutton;
	
	@FindBy(id="btnSave")
	WebElement Savebutton;
	
	@FindBy(id="systemUser_userType")
	WebElement Userrolesdropdown;
	
	@FindBy(css="#systemUser_userType")
	WebElement Userroledropdown;
	
	@FindBy(xpath="//*[@id='systemUser_employeeName_empName']")
	WebElement Employename;
	
	@FindBy(id="systemUser_userName")
	WebElement Systemusername;
	
	@FindBy(xpath="//input[@name='systemUser[password]']")
	WebElement Password;
	
	@FindBy(css="#systemUser_confirmPassword")
	WebElement Confirmpassword;
	
	@FindBy(id="systemUser_status")
	WebElement Status;
	
	//Job Titles
	
	@FindBy(id="menu_admin_Job")
	WebElement Jobtitle_dropdown;
	
	@FindBy(xpath="//a[@href='/index.php/admin/viewJobTitleList']")
	WebElement JobTiltle_link;
	
	@FindBy(css="#jobTitle_jobTitle")
	WebElement Jobtitle_text;
	
	@FindBy(css="jobTitle_jobDescription")
	WebElement Job_Description;
	
	@FindBy(css="#jobTitle_note")
	WebElement Jobtitle_notes;
	
	//Paygegrades
	
	//After Click on add button
	
	@FindBy(css="#payGrade_name")
	WebElement Paygrades_name;
	
	//Employement status
	
	@FindBy(xpath="//a[@href='/index.php/admin/employmentStatus']")
	WebElement Employementstatus_link;
	
	//Organisation
	
	@FindBy(id="menu_admin_Organization")
	WebElement Organisation_dropdown;
	
	@FindBy(xpath="//a[@href='/index.php/admin/viewOrganizationGeneralInformation']")
	WebElement GeneralInformation_Link;
	
	@FindBy(id="btnSaveGenInfo")
	WebElement Edit_button;
	
	@FindBy(css="#organization_name")
	WebElement Organisation_name;
	
	@FindBy(css="#organization_phone")
	WebElement phone_number;
	
	
	
	public AdminPage(){
		
		PageFactory.initElements(driver, this);
	}
	
	public void AddUsers(String userroletext, String employename,String usernameofAdminpage,String password,String confirmpassword){
		try{
		Actions usermanagementaction=new Actions(driver);
		usermanagementaction.moveToElement(Usermanagement_dropdown).build().perform();
		usermanagementaction.moveToElement(Users).build().perform();
		Users.click();
		Addbutton.click();
		Select sltESS=new Select(Userroledropdown);
		sltESS.selectByVisibleText(userroletext);
		Employename.sendKeys(employename);
		Systemusername.clear();
		Systemusername.sendKeys(usernameofAdminpage);
		Password.clear();
		Password.sendKeys(password);
		Confirmpassword.clear();
		Confirmpassword.sendKeys(confirmpassword);
		Savebutton.click();
		
		} catch(Exception e){
			e.printStackTrace();
		   }
		}
	
	
	
	

}
